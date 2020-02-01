package POM.zad16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class UserAdressPage {
    private static WebDriver driver;

    @FindBy(className = "account")
    WebElement account;

    @FindBy(css = "a[href*='addresses'] i")
    WebElement addressDetails;

    @FindBy(css = "a[data-link-action*='add-address']")
    WebElement addNewAddress;

    @FindBy(name = "city")
    WebElement cityInfo;

    @FindBy(name = "address1")
    WebElement address1Info;

    @FindBy(name = "postcode")
    WebElement postCodeInfo;

    @FindBy(xpath = "//input[@name = 'submitAddress']/following::button")
    WebElement btnSave;

    @FindBy(xpath = "//article[@class = 'alert alert-success']")
    WebElement message;

    public UserAdressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToAddressDetails() {
        account.click(); //Automated Tester click
        addressDetails.click(); //2 z 4 kafelkow
        addNewAddress.click();
    }

    public void enterZipCityStreetInfo(String zip, String city, String street) {
        postCodeInfo.sendKeys(zip);
        cityInfo.sendKeys(city);
        address1Info.sendKeys(street);
    }

    public void userZapisujeFormularz() {
        btnSave.click();
    }

    public String dodanieAdresuInfo(){
        return message.getText();
    }




}



