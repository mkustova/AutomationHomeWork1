package hw1.RozetkaLoginTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage  extends RozetkaBasePage
{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@name='signin']")
    private WebElement enterButton;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void closeBunner() {
        List<WebElement> elements = driver.findElements(By.id("rz-banner-img"));
        if(elements.size() > 0){
            driver.findElement(By.className("exponea-close-cross")).click();
        }
    }

    public void clickEnterButton() {
        enterButton.click();
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void Login() throws InterruptedException {
        synchronized (driver) {
            driver.wait(1500);

            this.closeBunner();
            this.clickEnterButton();
            this.inputLogin("m8kustova@gmail.com");
            this.inputPassword("Rozetkatest01");
            this.clickLoginButton();

            driver.wait(5000);
        }
    }
}
