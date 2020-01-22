package wyszukiwanie;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;



import java.util.Random;

public class zad10 {

    private WebDriver driver;


    @Before
    public void setUp() {
        // Uruchom nowy egzemplarz przeglądarki Chrome

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        //przejdz do sklepu
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");


    }
    @Test
    public void testProdSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
      driver.findElement(By.id("first-name")).clear();
      driver.findElement(By.id("first-name")).sendKeys("Karol");

      driver.findElement(By.id("last-name")).clear();
      driver.findElement(By.id("last-name")).sendKeys("Kowalski");
        //gender
      driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input")).click();


        driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("05/22/2010");
        driver.findElement(By.id("address")).sendKeys("Prosta 51");
        driver.findElement(By.id("role")).sendKeys("QA");
        driver.findElement(By.id("email")).sendKeys("karol.kowalski@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("Pass123");
        driver.findElement(By.id("company")).sendKeys("Coders Lab");
        driver.findElement(By.id("comment")).sendKeys("To jest mój pierwszy automat testowy");
        driver.findElement(By.id("submit")).click();


    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}

