package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zad14 {
    public String keyword;
    private WebDriver driver;

    @Given("^an open browser with google\\.com$")
    // public void anOpenBrowserWithGoogleCom() {

    public void openGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tester.codersguru.pl/register/");
    }

    @When("^a keyword (.*)is entered in input field$")
    //public void aKeywordSeleniumIsEnteredInInputField() {
    public void enterKeyword(String keyword) {
        WebElement element = driver.findElement(By.id("fos_user_registration_form_email"));
        element.clear();
        element.sendKeys(keyword);
        System.out.println(driver.getCurrentUrl());



    }

    @Then("^the rst one should contain (.*)$")
    //public void theRstOneShouldContainSelenium() {
    public void theFirstOneShouldContainKeyword(String expectedText) {
        System.out.println(expectedText);


    }

    @And("close browser")
    public void closeBrowser() {
        //driver.quit();
    }


}







/*
Z wykorzystaniem Cucumber przygotuj test, który będzie zakładał konto na stronie
// https://tester.codersguru.pl/login
// https://www.mcdonalds.com/us/en-us/subscription.html#signin


 */