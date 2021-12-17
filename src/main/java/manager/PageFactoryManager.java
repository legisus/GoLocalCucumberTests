package manager;

import org.openqa.selenium.WebDriver;
import pages.AboutPage;
import pages.ConsolePage;
import pages.HomePage;
import pages.UserPage;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }

    public AboutPage getAboutPage(){
        return new AboutPage(driver);
    }

    public ConsolePage getConsolePage(){
        return new ConsolePage(driver);
    }

    public UserPage getUserPage(){
        return new UserPage(driver);
    }

}
