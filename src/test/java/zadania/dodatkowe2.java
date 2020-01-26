package zadania;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;
import java.util.Formatter.*;

public class dodatkowe2 {

    String[] firstnameFemaleT = {"Asia", "Kasia", "Basia", "Ala", "Ela", "Mela", "Hania", "Genia", "Ania"};
    String[] firstnameMaleT = {"Wiesiek", "Grzesiek", "Krzysiek", "Tytus", "Romek", "Tomek"};
    String[] lastNameT = {"Nowak", "Mazur", "Kaczmarek", "Pawlak", "Kargul", "Krawczyk", "Walczak", "Socha", "Duda"};
    String[] emailSpecialT ={"", ".", "-","_"};
    String selectedFirstName;
    String selectedLastName;
    String selectedEmail;

    int gender;
    int selectFirstName;
    int selectLastName;
    int selectEmail;

    Random random = new Random();
    int rfnFemale = random.nextInt(firstnameFemaleT.length + 3);
    int rfnMale = random.nextInt(firstnameMaleT.length +3);
    int rlN = random.nextInt(lastNameT.length + 3);
    int reS = random.nextInt(emailSpecialT.length + 3);



    private WebDriver driver;



    @Before
    public void setUp() {
        // Uruchom nowy egzemplarz przeglądarki Chrome

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        //przejdz do sklepu
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1");


    }
    @Test
    public void testProdSearch() throws InterruptedException {

        if (rfnFemale > rfnMale) {
            selectFirstName = rfnFemale % firstnameFemaleT.length;
            selectedFirstName = firstnameFemaleT[selectFirstName];
            gender = 2;
        } else {
            selectFirstName = rfnMale % firstnameMaleT.length;
            selectedFirstName = firstnameMaleT[selectFirstName];
            gender = 1;
        }

        selectLastName = rlN % lastNameT.length;
        selectedLastName = lastNameT[selectLastName];

        selectEmail = reS % emailSpecialT.length;
        selectedEmail = selectedFirstName + emailSpecialT[selectEmail] + selectedLastName + "@gmail.com";



        WebElement imie = driver.findElement(By.name("firstname"));
        System.out.println("TagName imie: " + imie.getTagName());
        System.out.println("Enabled imie: " + imie.isEnabled());
        System.out.println("Displayed imie: " + imie.isDisplayed());
        System.out.println("Atrybut imie: " + imie.getAttribute("required"));
        Thread.sleep(500);
        if (imie.isEnabled() && imie.isDisplayed()) {
            imie.clear();
            imie.sendKeys(selectedFirstName);
        } else {
            Assert.fail();
        }
        //System.out.println("getText imie: " + imie.getText());


        WebElement nazwisko = driver.findElement(By.name("lastname"));
        System.out.println("TagName nazwisko: " + nazwisko.getTagName());
        //System.out.println("Enabled nazwisko: " + nazwisko.isEnabled());
        //System.out.println("Displayed nazwisko: " + nazwisko.isDisplayed());
        System.out.println("Atrybut nazwisko: " + nazwisko.getAttribute("required"));
        Thread.sleep(500);
        if (nazwisko.isEnabled() && nazwisko.isDisplayed()) {
            nazwisko.clear();
            nazwisko.sendKeys(selectedLastName);
        } else {
            Assert.fail();
        }
        //System.out.println("getText nazwisko: " + nazwisko.getText());


        WebElement email = driver.findElement(By.name("email"));
        //WebElement danger = driver.findElement(By.className("alert-danger"));
        System.out.println("TagName email: " + email.getTagName());
        //System.out.println("Enabled email: " + email.isEnabled());
        //System.out.println("Displayed email: " + email.isDisplayed());
        System.out.println("Atrybut email: " + email.getAttribute("required"));
       // System.out.println("getText danger: " + danger.getText());
        Thread.sleep(500);
        if (email.isEnabled() && email.isDisplayed()) {
            email.clear();
            email.sendKeys(selectedEmail);
        } else {
            Assert.fail();
        }
        //System.out.println("getText email: " + email.getText());

        String pass = "!" + selectedLastName + "_" + selectFirstName;

        WebElement haslo = driver.findElement(By.name("password"));
        //WebElement danger = driver.findElement(By.className("alert-danger"));
        System.out.println("TagName haslo: " + haslo.getTagName());
        //System.out.println("Enabled haslo: " + haslo.isEnabled());
        //System.out.println("Displayed haslo: " + haslo.isDisplayed());
        System.out.println("Atrybut haslo: " + haslo.getAttribute("required"));
        // System.out.println("getText danger: " + danger.getText());
        Thread.sleep(500);
        if (haslo.isEnabled() && haslo.isDisplayed()) {
            haslo.clear();
            haslo.sendKeys(pass);
        } else {
            Assert.fail();
        }
        //System.out.println("getText haslo: " + haslo.getText());

        WebElement urodziny = driver.findElement(By.name("birthday"));
        System.out.println("TagName urodziny: " + urodziny.getTagName());
        //System.out.println("Enabled urodziny: " + urodziny.isEnabled());
        //System.out.println("Displayed urodziny: " + urodziny.isDisplayed());
        //System.out.println("getText urodziny: " + urodziny.getText());
        System.out.println("Atrybut urodziny: " + urodziny.getAttribute("required"));

//Wylaczone, bo test z failem
       // Thread.sleep(500);
       // if(urodziny.isEnabled() && urodziny.isDisplayed()) {


            //if (urodziny.getAttribute("required").equals(true)) {
            //urodziny.clear();
            //urodziny.sendKeys("06/24/1977");
            //} else {
                //throw new NullPointerException();

            //}


        String expression = (gender==1) ? "//*[@value='1']" : "//*[@value='2']";
        WebElement plec = driver.findElement(By.xpath(expression));
        plec.click();

        //save
        WebElement save = driver.findElement(By.className("btn-primary"));
        save.click();
//ALE TO BYLO PODLE :)


    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}

/*
Klika podpowiedzi:
• Skrypt powinien mieć możliwość zdefiniowania dowolnej liczby użytkowników, którą chcemy
utworzyć.
•
• Zwróć uwagę, że: The email is already used, please choose another one or sign in.
Wiesz już jak generować losowe liczby - Wykorzystaj to i dodawaj losowe liczby do adresów e-mail.



 */

