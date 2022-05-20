package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage
{
    WebDriver driver;

    public CartPage(WebDriver _driver)
    {
        driver = _driver;
    }

    public boolean checkCart(String key)
    {
        WebElement element = driver.findElement(By.xpath("//*[text()='" + key + "']"));
        if(element == null)
            return false;
        else
            return true;
    }

    public void sendKey(String searchBarId, String keys) {
        driver.findElement(By.id(searchBarId)).sendKeys(keys);
    }
}
