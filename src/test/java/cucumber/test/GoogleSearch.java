package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public String keyword;
    private WebDriver driver;

    @Given("^an open browser with google\\.com$")
   // public void anOpenBrowserWithGoogleCom() {

        public void openGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }

    @When("^a keyword (.*)is entered in input field$")
    //public void aKeywordSeleniumIsEnteredInInputField() {
        public void enterKeyword(String keyword) {
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys(keyword);
        element.submit();
        //WebElement result = driver.findElement(By.xpath("//h3"));
        WebElement result = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[3]/div/div/div[1]/a/h3"));
        //employee[@id=1]/following::employee
        result.click();

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

