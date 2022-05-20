package main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver webDriver;

    public static WebDriver getDriver()
    {
        if(webDriver == null)
        {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }
}
