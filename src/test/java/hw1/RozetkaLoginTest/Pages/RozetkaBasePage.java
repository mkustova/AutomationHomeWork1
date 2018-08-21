package hw1.RozetkaLoginTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RozetkaBasePage {

    public RozetkaBasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

       public WebDriver driver;

    @FindBy(xpath = "//a[@class='header-user-link sprite-side whitelink xhr']")
    protected WebElement userProfeleName;

    @FindBy(xpath = "//span[@class='btn-link-i']")
    protected WebElement categoryButton;

    @FindBy(xpath = "//span='Корзина'")
    protected WebElement bucket;

    @FindBy(className = "popup-close")
    protected WebElement closeBucket;

    public String getUsername(){
        String username = userProfeleName.getText();
        return username;
    }

    public void goToBucket(){
        driver.findElement(By.cssSelector("a[href='https://my.rozetka.com.ua/cart/']")).click();
        //bucket.click();
    }

    public void closeBucket() {
        closeBucket.click();
    }
}
