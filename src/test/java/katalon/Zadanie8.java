package katalon;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadanie8 {
    private WebDriver driver;




    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");


        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testZadanie8() throws Exception {
        System.out.println("Otwieram formularz");
        // ERROR: Caught exception [ERROR: Unsupported command [loadVars | doKatalona.csv | ]]
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
        System.out.println("Wypelniam formularz");
        driver.findElement(By.id("first-name")).clear();
        driver.findElement(By.id("first-name")).sendKeys("Karol");
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
        driver.findElement(By.id("last-name")).clear();
        driver.findElement(By.id("last-name")).sendKeys("Kowalski");
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.id("dob")).click();
        driver.findElement(By.xpath("//th[2]")).click();
        driver.findElement(By.id("infoForm")).click();
        driver.findElement(By.id("dob")).click();
        driver.findElement(By.xpath("//th[2]")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[2]/table/thead/tr[2]/th | ]]
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[2]/table/thead/tr[2]/th | ]]
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[2]/table/thead/tr[2]/th | ]]
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //div[2]/table/thead/tr[2]/th | ]]
        driver.findElement(By.xpath("//span[5]")).click();
        driver.findElement(By.xpath("//tr[4]/td[7]")).click();
        driver.findElement(By.id("address")).click();
        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("address")).sendKeys("Prosta 51");
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("");
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Pass123");
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys("Coders Lab");
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
        new Select(driver.findElement(By.id("role"))).selectByVisibleText("QA");
        driver.findElement(By.id("role")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=expectation | label=Challenging]]
        driver.findElement(By.xpath("//select[@id='expectation']/option[6]")).click();
        driver.findElement(By.xpath("//select[@id='expectation']/option[6]")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //select[@id='expectation']/option[6] | ]]
        driver.findElement(By.xpath("//input[@value='']")).click();
        driver.findElement(By.xpath("(//input[@value=''])[2]")).click();
        driver.findElement(By.id("comment")).click();
        driver.findElement(By.id("comment")).clear();
        driver.findElement(By.id("comment")).sendKeys("To jest mój pierwszy automat testowy");
        driver.findElement(By.id("submit")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
        assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
        // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
