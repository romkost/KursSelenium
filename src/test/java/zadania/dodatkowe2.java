package zadania;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;
import java.util.Random;

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
        }
        else {
            selectFirstName = rfnMale % firstnameMaleT.length;
            selectedFirstName = firstnameMaleT[selectFirstName];
            gender = 1;
        }

        selectLastName = rlN % lastNameT.length;
        selectedLastName = lastNameT[selectLastName];

        selectEmail = reS % emailSpecialT.length;
        selectedEmail = selectedFirstName + emailSpecialT[selectEmail] + selectedLastName + "@gmail.com";


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement imie = driver.findElement(By.name("firstname"));
        imie.clear();
        imie.sendKeys(selectedFirstName);
        Thread.sleep(1000);
        System.out.println("Imie class atrrr:" + imie.getAttribute("class"));
        System.out.println("Imie getText:" + imie.getText());





        WebElement nazwisko = driver.findElement(By.name("lastname"));
        nazwisko.clear();
        nazwisko.sendKeys(selectedLastName);
        Thread.sleep(1000);


        String expression = (gender==1) ? "//*[@value='1']" : "//*[@value='2']";


        WebElement plec = driver.findElement(By.xpath(expression));
       // WebElement plec = driver.findElement(By.xpath("//*[@value='gender']"));
        //plec.clear();
        plec.click();
       // WebElement urodziny = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys(selectedEmail);
        Thread.sleep(4000);






       // System.out.println(selectedEmail);












        //element.submit();
    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}

/*
Klika podpowiedzi:
• Skrypt powinien mieć możliwość zde niowania dowolnej liczby użytkowników, którą chcemy
utworzyć.
•
• Zwróć uwagę, że: The email is already used, please choose another one or sign in.
Wiesz już jak generować losowe liczby - Wykorzystaj to i dodawaj losowe liczby do adresów e-mail.



 */

