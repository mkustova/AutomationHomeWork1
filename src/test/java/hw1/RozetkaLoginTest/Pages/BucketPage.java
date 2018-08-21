package hw1.RozetkaLoginTest.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BucketPage extends RozetkaBasePage {
    public BucketPage (WebDriver driver) throws InterruptedException {
        super(driver);
        goToBucket();
        synchronized (driver) {
            driver.wait(5000);
        }
    }

    public boolean isProductInBucket(String text) {
        List<WebElement> goods = driver.findElements(By.name("goods-link"));
        for (WebElement good :
                goods) {
            if (good.getText().equals(text)) {
                return true;
            }
        }

        return false;
    }
}
