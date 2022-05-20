package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage
{
    WebDriver driver;

    public ProductPage(WebDriver _driver)
    {
        driver = _driver;
    }

    public void smallBedenSec()
    {
        driver.findElement(By.cssSelector("a[size='S']")).click();
    }

    public void setup(String link)
    {
        driver.get(link);
    }

    public void clickById(String searchBarId)
    {
        driver.findElement(By.id(searchBarId)).click();
    }
}
