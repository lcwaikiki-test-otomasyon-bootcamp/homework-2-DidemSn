package test.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import main.DriverFactory;
import test.pages.CartPage;
import test.pages.ProductPage;
import test.pages.SearchPage;
import org.openqa.selenium.WebDriver;

public class StepCartPage {

    WebDriver driver = DriverFactory.getDriver();
    CartPage cartPage = new CartPage(driver);

    @Given("Sepetteki oge Bordomu bakilir")
    public boolean sepettekiOgeBordomuBakilir() {
        return cartPage.checkCart("Bordo");
    }

    @When("Sepetteki urun Kazakmi diye kontrol edilir")
    public boolean sepettekiurunKazakmiDiyeKontrolEdilir() {
        return cartPage.checkCart("Kazak");
    }
}
