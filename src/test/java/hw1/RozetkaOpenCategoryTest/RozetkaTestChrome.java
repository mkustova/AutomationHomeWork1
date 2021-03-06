package hw1.RozetkaOpenCategoryTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RozetkaTestChrome {
    public WebDriver driver;

    @FindBy(id = "7806")
    public WebElement categoryLink;

    @FindBy(className = "title-page")
    public WebElement titleHeader;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua");
        PageFactory.initElements(driver, this);
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
