package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Field;

public class ConsolePage extends BasePage{

    public ConsolePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ion-tab-button//*[contains(text(),'Home')]")
    private WebElement homeButton;

    @FindBy(xpath = "//ion-tab-button//*[contains(text(),'About')]")
    private WebElement aboutButton;

    @FindBy(xpath = "//ion-tab-button//*[contains(text(),'User')]")
    private WebElement userButton;

    public void clickOnUserButton(){
        userButton.click();
    }

}
