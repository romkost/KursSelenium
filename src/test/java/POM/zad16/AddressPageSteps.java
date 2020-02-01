package POM.zad16;

import POM.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AddressPageSteps {
    UserAdressPage userAddressPage;
    WebDriver driver;

    @Given("^User log in$")
    public void userLogIn() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
        userAddressPage = new UserAdressPage(driver);
    }


    @When("^User goes to UserAddressPage$")
    public void userGoesToUserAddressPage() {
    userAddressPage.goToAddressDetails();
    }

    @And("^User write zip \"([^\"]*)\" city \"([^\"]*)\" and street \"([^\"]*)\"$")
    public void userWriteZipCityAndStreet(String zip, String city, String street)  {
        userAddressPage.enterZipCityStreetInfo(zip, city, street);

    }

    @And("^User click save$")
    public void userClickSave() {
    userAddressPage.userZapisujeFormularz();
    }

    @Then("^User sees message \"([^\"]*)\"$")
    public void userSeesMsg(String message)  {
        Assert.assertEquals(message, userAddressPage.dodanieAdresuInfo());
        //driver.quit();
    }


}





 /*

Zadanie 16 - Page Object Pattern
Mając już poprzednie dwa PageObject dodaj kolejny dla strony https://prod-
kurs.coderslab.pl/index.php?controller=address
Klika podpowiedzi:

[opcjonalnie] Utwórz Feature File (Gherkin).
Utwórz klasę UserAdressPage.java (użyj PageFactory).
Utwórz klasę UserAdressPage.java lub AdressStepDe nitions.java (jeżeli używasz Gherkina).
Twój test powinien dodawać nowy adres wysyłkowy dla użytkownika.
Uruchom test i sprawdź czy działa.
Zastanów się jak napisać test, aby możliwe dodawanie wielu adresów. Pamiętaj o asercjach!



 */