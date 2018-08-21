package hw1.RozetkaLoginTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SmesiteliPage extends RozetkaBasePage {
    public SmesiteliPage(WebDriver driver) {
        super(driver);
    }

    //@FindBy(xpath = "//a[@href='https://bt.rozetka.com.ua/hansgrohe_71153000/p43084464/']")
    @FindBy(id = "image_item43084464")
    private WebElement desiredSmesitel;

    public void openDesiredSmesitelPage() {
        Actions action = new Actions(driver);
        action.moveToElement(desiredSmesitel).build().perform();

        desiredSmesitel.click();
    }
}
