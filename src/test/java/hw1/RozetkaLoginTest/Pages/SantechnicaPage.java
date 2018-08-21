package hw1.RozetkaLoginTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SantechnicaPage extends RozetkaBasePage {
    public SantechnicaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='https://bt.rozetka.com.ua/mixer_taps/c80706/']")
    private WebElement smesiteliButton;

    public void openSmesiteliPage() {
        smesiteliButton.click();
    }
}
