package hw1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RozetkaTest {
    public WebDriver driver;

    @FindBy(id = "7806")
    public WebElement categoryLink;

    @FindBy(className = "title-page")
    public WebElement titleHeader;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://rozetka.com.ua");
        PageFactory.initElements(driver, this);

        // YY
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifyCategoryLinkIsFound() {
        categoryLink.click();

        Assert.assertTrue(titleHeader.isDisplayed());
        String titleText = titleHeader.findElement(By.className("pab-h1")).getText();

        Assert.assertEquals("Сантехника и ремонт", titleText);
    }
}
