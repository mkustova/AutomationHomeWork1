package hw1.RozetkaLoginTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesiredSmesitelPage extends RozetkaBasePage {
    public DesiredSmesitelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@name='topurchases']")
    private WebElement buyButton;

    @FindBy(className = "detail-title")
    private WebElement productTitle;

    private boolean isElementAlreadyInCart() {
        List<WebElement> elements =  driver.findElements(By.className("detail-g-in-cart"));
        return elements.size() > 0 ;
    }

    public void addDesiredSmesitelToBucket() throws InterruptedException {
        synchronized (driver) {
            driver.wait(5000);
            if (!isElementAlreadyInCart()) {
                buyButton.click();
                driver.wait(5000);
                this.closeBucket();
            }
        }
    }

    public WebElement getProductTitle() {
        return productTitle;
    }
}
