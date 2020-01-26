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
    public void testFormularz() {
        // imie
      WebElement imie = driver.findElement(By.id("first-name"));
      imie.clear();
      imie.sendKeys("Karol");

      //nazwisko
      WebElement nazwisko = driver.findElement(By.id("last-name"));
      nazwisko.clear();
      nazwisko.sendKeys("Kowalski");

      //gender
      WebElement plec = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
      plec.click();

      //urodziny
      WebElement urodziny = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
      urodziny.sendKeys("05/22/2010");

      //adres
      WebElement adres = driver.findElement(By.id("address"));
      adres.clear();
      adres.sendKeys("Prosta 51");

      //email
      WebElement eadres = driver.findElement(By.id("email"));
      eadres.clear();
      eadres.sendKeys("karol.kowalski@mailinator.com");

      //haslo
      WebElement haslo = driver.findElement(By.id("password"));
      haslo.clear();
      haslo.sendKeys("Pass123");

      //firma
      WebElement firma = driver.findElement(By.id("company"));
      firma.clear();
      firma.sendKeys("Coders Lab");

      //posada
      WebElement posada = driver.findElement(By.id("role"));
      posada.sendKeys("QA");

      //komentarz
      WebElement komentarz = driver.findElement(By.id("comment"));
      komentarz.clear();
      komentarz.sendKeys("To jest mój pierwszy automat testowy");

      //wyslij
      driver.findElement(By.id("submit")).click();


    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}

/*

Pod linkiem https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html dostępny jest
formularz, którego wypełnianie i wysyłanie należy zautomatyzować tym razem z wykorzystaniem
Selenium WebDriver.
Jest to bardzo ważne ćwiczenie. Ćwiczenie w praktyce wykorzystuję wiedzę z lokalizowania
elementów na stronie. Wszyscy kursanci muszą to zadanie wykonać!

Wypełnij dane w formularzu:

First name Karol
Last name Kowalski
Gender Male
Date of birth 05/22/2010
Address Prosta 51
Zatwierdź formularz - SUBMIT

Email karol.kowalski@mailinator.com
Password Pass123
Company Coders Lab
Comment To jest mój pierwszy automat
testowy


 */

