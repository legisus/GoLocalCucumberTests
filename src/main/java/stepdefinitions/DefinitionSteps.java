package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AboutPage;
import pages.ConsolePage;
import pages.HomePage;
import pages.UserPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {
    private static final long DEFAULT_TIMEOUT = 60;
    WebDriver driver;
    PageFactoryManager pageFactoryManager;
    HomePage homePage;
    AboutPage aboutPage;
    ConsolePage consolePage;
    UserPage userPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
        homePage = pageFactoryManager.getHomePage();
        aboutPage = pageFactoryManager.getAboutPage();
        consolePage = pageFactoryManager.getConsolePage();
        userPage = pageFactoryManager.getUserPage();
    }

    @Given("User opens {string} page")
    public void openPage(final String url) {
        homePage.openHomePage(url);
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User click on ok button")
    public void userClickOnOkButton() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getOkButton());
        homePage.clickOnOk();
    }

    @When("User click on User button")
    public void userClickOnUserButton() {
        consolePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        consolePage.clickOnUserButton();
    }


    @When("User fill in all registration fields valid data")
    public void userFillInAllRegistrationFieldsValidData() {
        userPage.pageLoadWait(DEFAULT_TIMEOUT);
        userPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, userPage.getFirstName());
        userPage.fillInValidDataRegistrationForm(
                "Anton", "Antonov", "anton@gmil.com", "123456");


    }

    @Then("User click on button registration")
    public void userClickOnButtonRegistration() {
        userPage.pageLoadWait(DEFAULT_TIMEOUT);
        userPage.clickOnRegistrationButton();
    }

    @And("Check the massage is displayed")
    public void checkTheMassage() {
        userPage.pageLoadWait(DEFAULT_TIMEOUT);
        userPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, userPage.getMessage());
        assertTrue(userPage.getMessage().isDisplayed());
    }
}
