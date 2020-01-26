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
        System.out.println("TagName eadres: " + eadres.getTagName());
        System.out.println("Enabled eadres: " + eadres.isEnabled());
        System.out.println("Displayed eadres: " + eadres.isDisplayed());
        System.out.println("getText eadres: " + eadres.getText());
        System.out.println("Atrybut eadres: " + eadres.getAttribute("name"));

        Thread.sleep(500);
        if(eadres.isEnabled() && eadres.isDisplayed()) {
            eadres.clear();
            eadres.sendKeys("karol.kowalski@mailinator.com");
        }else {
            Assert.fail();
        }


      //haslo
      WebElement haslo = driver.findElement(By.id("password"));
        System.out.println("TagName haslo: " + haslo.getTagName());
        System.out.println("Enabled haslo: " + haslo.isEnabled());
        System.out.println("Displayed haslo: " + haslo.isDisplayed());
        System.out.println("getText haslo: " + haslo.getText());
        System.out.println("Atrybut haslo: " + haslo.getAttribute("name"));

        Thread.sleep(500);
        if(haslo.isEnabled() && haslo.isDisplayed()) {
            haslo.clear();
            haslo.sendKeys("Pass123");
        }else {
            Assert.fail();
        }


      //firma
      WebElement firma = driver.findElement(By.id("company"));
        System.out.println("TagName firma: " + firma.getTagName());
        System.out.println("Enabled firma: " + firma.isEnabled());
        System.out.println("Displayed firma: " + firma.isDisplayed());
        System.out.println("getText firma: " + firma.getText());
        System.out.println("Atrybut firma: " + firma.getAttribute("name"));

        Thread.sleep(500);
        if(firma.isEnabled() && firma.isDisplayed()) {
            firma.clear();
            firma.sendKeys("Coders Lab");
        }else {
            Assert.fail();
        }


      //posada
      WebElement posada = driver.findElement(By.id("role"));
        System.out.println("TagName posada: " + posada.getTagName());
        System.out.println("Enabled posada: " + posada.isEnabled());
        System.out.println("Displayed posada: " + posada.isDisplayed());
        System.out.println("getText posada: " + posada.getText());
        System.out.println("Atrybut posada: " + posada.getAttribute("name"));

        Thread.sleep(500);
        if(posada.isEnabled() && posada.isDisplayed()) {
        //if(posada.isEnabled()) {
            //if(posada.isDisplayed()) {
            //posada.clear(); tutaj niefajnie stosowac clear
            posada.sendKeys("QA");

        }else {
            Assert.fail();
        }


      //komentarz
      WebElement komentarz = driver.findElement(By.id("comment"));
        System.out.println("TagName komentarz: " + komentarz.getTagName());
        System.out.println("Enabled komentarz: " + komentarz.isEnabled());
        System.out.println("Displayed komentarz: " + komentarz.isDisplayed());
        System.out.println("getText komentarz: " + komentarz.getText());
        System.out.println("Atrybut komentarz: " + komentarz.getAttribute("name"));

        Thread.sleep(500);
        if(komentarz.isEnabled() && komentarz.isDisplayed()) {
            komentarz.clear();
            komentarz.sendKeys("To jest mój pierwszy automat testowy");
        }else {
            Assert.fail();
        }


      //wyslij
      WebElement wyslij = driver.findElement(By.id("submit"));
        System.out.println("TagName wyslij: " + wyslij.getTagName());
        System.out.println("Enabled wyslij: " + wyslij.isEnabled());
        System.out.println("Displayed wyslij: " + wyslij.isDisplayed());
        System.out.println("getText wyslij: " + wyslij.getText());
        System.out.println("Atrybut wyslij: " + wyslij.getAttribute("name"));

        Thread.sleep(500);
        if(wyslij.isEnabled() && wyslij.isDisplayed()) {
            wyslij.click();
        }else {
            Assert.fail();
        }




    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}

    /*
    Zadanie 11 - funkcje
Rozbuduj swój kod z zadania 10 o następujące elementy:
Przed każdym elementem sprawdź czy jest on widoczny lub dostępny aby wpisać do niego tekst.

Przed każdym elementem odczytaj jego nazwę a następnie wyświetl ją w konsoli w formacie -
nazwa pola : wpisywana wartość


     */