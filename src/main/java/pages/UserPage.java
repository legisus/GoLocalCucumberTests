package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{
    public UserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ion-segment-button[1]")
    private WebElement buttonCustomer;

    @FindBy(xpath = "//ion-segment-button[2]")
    private WebElement buttonSeller;

    @FindBy(xpath = "//*[contains(@name, 'ion-input-1')]")
    private WebElement firstName;

    @FindBy(xpath = "//*[contains(@name, 'ion-input-2')]")
    private WebElement lastName;

    @FindBy(xpath = "//*[contains(@name, 'ion-input-3')]")
    private WebElement eMail;

    @FindBy(xpath = "//*[contains(@name, 'ion-input-4')]")
    private WebElement password;

    @FindBy(xpath = "//ion-button[contains(@class, '-1')]")
    private WebElement registrationButton;

    @FindBy(xpath = "//ion-button[contains(@class, 'button-clear')]")
    private WebElement switchButton;

    @FindBy(xpath = "//h2[contains(@id, 'alert')]")
    private WebElement message;

    public WebElement getRegistrationButton(){
        return registrationButton;
    }

    public void clickOnRegistrationButton(){
        registrationButton.click();
    }

    public void fillInValidDataRegistrationForm(String fillInFirstName, String fillInLastName,
                                                String fillInEMail, String fillInPassword){
        firstName.sendKeys(fillInFirstName);
        lastName.sendKeys(fillInLastName);
        eMail.sendKeys(fillInEMail);
        password.sendKeys(fillInPassword);
    }

    public WebElement getMessage(){
        return message;
    }

    public WebElement getFirstName(){
        return firstName;
    }


}
