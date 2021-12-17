package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    @FindBy(xpath = "//span[@class=\"alert-button-inner sc-ion-alert-md\"]")
    private WebElement okButton;

    public WebElement getOkButton(){
        return okButton;
    }

    public void clickOnOk(){
        okButton.click();
    }


}
