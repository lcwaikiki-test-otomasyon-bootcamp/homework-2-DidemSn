package test.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import main.DriverFactory;
import test.pages.SearchPage;
import org.openqa.selenium.WebDriver;

public class StepSearchPage {

    WebDriver driver = DriverFactory.getDriver();
    SearchPage searchPage = new SearchPage(driver);

    @Given("Kirmizi Renk butonuna basilir")
    public void kirmiziRenkButonunaBasilir() {
        searchPage.clickByXPath("//*[text()='Bordo']");
    }

    @When("LCW Casual butonuna basilir")
    public void LCWCasualButonunaBasilir() {
        searchPage.clickByXPath("//*[text()='LCW Casual']");
    }

    @When("Ucuncu Urunu secilir")
    public void UcuncuUrunuSecilir() {
        searchPage.clickNthElement(3);
    }
}
