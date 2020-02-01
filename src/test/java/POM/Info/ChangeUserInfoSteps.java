package POM.Info;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.LoginPage;

import java.util.concurrent.TimeUnit;

public class ChangeUserInfoSteps {
    UserInfoPage userInfoPage;
    WebDriver driver;

    @Given("^User is logged in to CodersLab shop$")
    public void userIsLooggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");
        userInfoPage = new UserInfoPage(driver);
    }



    @When("^User goes to UserInformationPage$")
    public void userGoesToUserInformationPage() {userInfoPage.goToAccountDetails();
    }




    @And("^User signs up for our newsletter$")
    public void userSignsUpForOurNewsletter() {userInfoPage.signInForNewsletter();}

    @And("^User saves information$")
    public void userSavesInformation() {
        userInfoPage.submitUserInfo();
    }

    @And("^User changes his birthday to \"([^\"]*)\"$")
    public void userChangesHisBirthdayTo(String date) { userInfoPage.setBirthdate(date);}


    @Then("^User sees \"([^\"]*)\"$")
    public void userSees(String message) {
        Assert.assertEquals(message, userInfoPage.getUpdateInformation());
        // driver.quit();
       // throw new PendingException();
    }



}