package test.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Common;
import main.DriverFactory;
import org.openqa.selenium.WebDriver;
import test.pages.HomePage;

public class StepHomePage {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("Site Acilir")
    public void siteAcilir() {
        homePage.setup();
    }

    @When("Arama Cubuguna {string} yazilir")
    public void aramaCubugunaYazilir(String arg0) {
        homePage.sendKey("search-form__input-field__search-input", arg0);
    }

    @When("Ara butonuna tiklanir")
    public void araButonunaTiklanir() {
        homePage.clickByCss(".search-form__input-field__btn-search.false");
    }
}
