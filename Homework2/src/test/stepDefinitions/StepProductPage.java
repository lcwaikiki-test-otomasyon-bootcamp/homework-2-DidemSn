package test.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import main.Common;
import main.DriverFactory;
import test.pages.ProductPage;
import test.pages.SearchPage;
import org.openqa.selenium.WebDriver;

public class StepProductPage {

    WebDriver driver = DriverFactory.getDriver();
    ProductPage productPage = new ProductPage(driver);

    @Given("Small butonu secilir")
    public void smallButonusecilir() {
        productPage.smallBedenSec();
    }

    @When("Sepete eklenir")
    public void sepeteEklenir() {
        productPage.clickById("pd_add_to_cart");
        Common.sleep(2);
        productPage.setup("https://www.lcwaikiki.com/tr-TR/TR/sepetim");
    }
}
