package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    WebDriver driver;

    public HomePage(WebDriver _driver)
    {
        driver = _driver;
    }

    public void setup()
    {
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
    }

    public void clickByCss(String searchBarcss)
    {
        driver.findElement(By.cssSelector(searchBarcss)).click();
    }

    public void sendKey(String searchBarId, String keys) {
        driver.findElement(By.id(searchBarId)).sendKeys(keys);
    }
}
