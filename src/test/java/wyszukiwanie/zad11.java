package wyszukiwanie;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class zad11 {

    private WebDriver driver;


    /*
    Zadanie 11 - funkcje
Rozbuduj swój kod z zadania 10 o następujące elementy:
Przed każdym elementem sprawdź czy jest on widoczny lub dostępny aby wpisać do niego tekst.

Przed każdym elementem odczytaj jego nazwę a następnie wyświetl ją w konsoli w formacie -
nazwa pola : wpisywana wartość


     */



    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");


    }
    @Test
    public void testFormularz() throws InterruptedException {
        // imie
      WebElement imie = driver.findElement(By.id("first-name"));
        System.out.println("TagName imie: " + imie.getTagName());
        System.out.println("Enabled imie: " + imie.isEnabled());
        System.out.println("Displayed imie: " + imie.isDisplayed());
        System.out.println("getText imie: " + imie.getText());
        System.out.println("Atrybut imie: " + imie.getAttribute("id"));


        Thread.sleep(500);
        if(imie.isEnabled() && imie.isDisplayed()) {
            imie.clear();
            imie.sendKeys("Karol");
            //imie.submit();
        }else {
            Assert.fail();
        }


      //nazwisko
      WebElement nazwisko = driver.findElement(By.id("last-name"));
        //System.out.println("TagName nazwisko: " + nazwisko.getTagName());
        //System.out.println("Enabled nazwisko: " + nazwisko.isEnabled());
        //System.out.println("Displayed nazwisko: " + nazwisko.isDisplayed());
        //System.out.println("getText nazwisko: " + nazwisko.getText());
        System.out.println("Atrybut nazwisko: " + nazwisko.getAttribute("type"));

        Thread.sleep(500);
        if(nazwisko.isEnabled() && nazwisko.isDisplayed()) {
            nazwisko.clear();
            nazwisko.sendKeys("Kowalski");
            //nazwisko.submit();
        }else {
            Assert.fail();
        }


      //gender
      WebElement plec = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        //System.out.println("TagName plec: " + plec.getTagName());
        //System.out.println("Enabled plec: " + plec.isEnabled());
        //System.out.println("Displayed plec: " + plec.isDisplayed());
        //System.out.println("getText plec: " + plec.getText());
        System.out.println("Atrybut plec: " + plec.getAttribute("name"));

        //Thread.sleep(500);
        if(plec.isEnabled() && plec.isDisplayed()) {
            plec.click();
        }else {
            Assert.fail();
        }


      //urodziny
      WebElement urodziny = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
        System.out.println("TagName urodziny: " + urodziny.getTagName());
        //System.out.println("Enabled urodziny: " + urodziny.isEnabled());
        //System.out.println("Displayed urodziny: " + urodziny.isDisplayed());
        //System.out.println("getText urodziny: " + urodziny.getText());
        System.out.println("Atrybut urodziny: " + urodziny.getAttribute("value"));

        Thread.sleep(500);
        if(urodziny.isEnabled() && urodziny.isDisplayed()) {
            urodziny.clear();
            urodziny.sendKeys("05/22/2010");
        }else {
            Assert.fail();
        }


      //adres
      WebElement adres = driver.findElement(By.id("address"));
        System.out.println("TagName adres: " + adres.getTagName());
        System.out.println("Enabled adres: " + adres.isEnabled());
        System.out.println("Displayed adres: " + adres.isDisplayed());
        System.out.println("getText adres: " + adres.getText());
        System.out.println("Atrybut adres: " + adres.getAttribute("name"));

        Thread.sleep(500);
        if(adres.isEnabled() && adres.isDisplayed()) {
            adres.clear();
            adres.sendKeys("Prosta 51");
        }else {
            Assert.fail();
        }





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

