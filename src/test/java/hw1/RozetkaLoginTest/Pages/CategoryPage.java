package hw1.RozetkaLoginTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends RozetkaBasePage {

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "7806")
    public WebElement santechnikaCategoryLink;

    @FindBy(className = "title-page")
    public WebElement titleHeader;

    public void openSantechnika() {
        super.categoryButton.click();
        santechnikaCategoryLink.click();
    }

    public String getTitleText() {
        return titleHeader.findElement(By.className("pab-h1")).getText();
    }
}
