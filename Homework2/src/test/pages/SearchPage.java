package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage
{
    WebDriver driver;

    public SearchPage(WebDriver _driver)
    {
        driver = _driver;
    }

    public void clickByXPath(String xpath)
    {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickNthElement(int nth)
    {
        List<WebElement> elements = driver.findElements(By.cssSelector(".product-card.product-card--one-of-4"));

        if( elements.size() <= nth)
            return;

        elements.get(nth-1).click();
    }
}
