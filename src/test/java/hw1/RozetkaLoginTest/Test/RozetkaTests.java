package hw1.RozetkaLoginTest.Test;

import com.sun.xml.internal.ws.policy.AssertionSet;
import hw1.RozetkaLoginTest.Pages.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RozetkaTests {

    public static WebDriver driver;
    public static LoginPage loginPage;
    public static CategoryPage categoryPage;

    @BeforeClass
    public static void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
        loginPage.Login();
    }

    @Test
    public void loginTest() {
        String username = loginPage.getUsername();
        Assert.assertEquals("Мария", username);
    }

    @Test
    public void titleTest() {
        categoryPage = new CategoryPage(driver);
        categoryPage.openSantechnika();
        Assert.assertTrue(categoryPage.titleHeader.isDisplayed());
        Assert.assertEquals("Сантехника и ремонт", categoryPage.getTitleText());
    }

    @Test
    public void checkProductIsAddedToBucket() throws InterruptedException {
        SantechnicaPage santechnicaPage = new SantechnicaPage(driver);
        santechnicaPage.openSmesiteliPage();
        SmesiteliPage smesiteliPage = new SmesiteliPage(driver);
        smesiteliPage.openDesiredSmesitelPage();
        DesiredSmesitelPage desiredSmesitelPage = new DesiredSmesitelPage(driver);
        desiredSmesitelPage.addDesiredSmesitelToBucket();

        WebElement productTitle = desiredSmesitelPage.getProductTitle();
        BucketPage bucketPage = new BucketPage(driver);
        Assert.assertEquals(true, bucketPage.isProductInBucket(productTitle.getText()));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
