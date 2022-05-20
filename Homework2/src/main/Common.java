package main;

import org.openqa.selenium.WebElement;

public class Common {
    public static void sleep(int sec)
    {
        try {
            Thread.sleep(sec * 100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
