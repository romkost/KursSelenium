package cucumber.test.zad14;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class zad14steps {
    WebDriver driver;

    @Before()
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
    }

    @After()
    public void tearDown() throws Throwable {
        driver.manage().deleteAllCookies();
        driver.quit();
        Thread.sleep(1000);
    }


    @Given("^user navigates to \"([^\"]*)\"$")
        public void user_navigates_to(String url) throws Throwable {
            driver.get(url);
    }


    @When("^user clicks on the Zarejestruj sie button$")
        public void user_click_on_button() throws Throwable {
            driver.findElement(By.xpath("//a[contains(text(), 'Zarejestruj się')]")).click();
    }

    @And("^user enters the email \"([^\"]*)\"$")
        public void user_enters_email(String iadres) throws Throwable {
            driver.findElement(By.xpath("//input[@id='fos_user_registration_form_email']")).sendKeys(iadres);
    }

    @And("^user enters the first name \"([^\"]*)\"$")
        public void user_enters_first_name(String imie) throws Throwable {
            driver.findElement(By.xpath("//input[@id='fos_user_registration_form_name']")).sendKeys(imie);
    }

    @And("^user enters the last name \"([^\"]*)\"$")
        public void user_enters_last_name(String nazwisko) throws Throwable {
            driver.findElement(By.xpath("//input[@id='fos_user_registration_form_lastname']")).sendKeys(nazwisko);
    }

    @And("^user enters the password \"([^\"]*)\"$")
        public void user_enters_password(String haslo) throws Throwable {
        driver.findElement(By.xpath("//input[@id='fos_user_registration_form_plainPassword_first']")).sendKeys(haslo);
    }

    @And("^user confirm password \"([^\"]*)\"$")
        public void user_confirm_password(String haslo) throws Throwable {
            driver.findElement(By.xpath("//input[@id='fos_user_registration_form_plainPassword_second']")).sendKeys(haslo); //powtorz haslo
    }


    @And("^user enters the city \"([^\"]*)\"$")
        public void user_enters_city(String miasto) throws Throwable {
            driver.findElement(By.xpath("//input[@id='form_city']")).sendKeys(miasto);
    }

    @And("^user enters the postcode \"([^\"]*)\"$")
        public void user_enters_postcode(String kod) throws Throwable {
            driver.findElement(By.xpath("//input[@id='form_postal_code']")).sendKeys(kod);
    }

    @And("^user enters the street \"([^\"]*)\"$")
        public void user_enters_street(String ulica) throws Throwable {
            driver.findElement(By.xpath("//input[@id='form_street']")).sendKeys(ulica);
    }


    @And("^user enters the flat \"([^\"]*)\"$")
        public void user_enters_flat(String numerd) throws Throwable {
            driver.findElement(By.xpath("//input[@id='form_number']")).sendKeys(numerd);
            Thread.sleep(1000);
    }

    @And("^user accept rules$")
        public void user_accept_rules() throws Throwable {
            driver.findElement(By.xpath("//*[contains(@type,'checkbox')]")).click();
            Thread.sleep(1000);

    }

    @And("^user clicks Zarejestruj button$")
        public void user_clicks_zarejestruj() throws Throwable {
            driver.findElement(By.xpath("//button[contains(text(), 'Zarejestruj')]")).click();
    }

    @Then("^user sees confirm page \"([^\"]*)\"$")
    public void user_sees_confirm_page(String url2) throws Throwable {
            Assert.assertEquals(driver.getCurrentUrl(), url2);
    }

}

//MIALEM DUZA FRAJDE WYKONUJAC TO ZADANIE









