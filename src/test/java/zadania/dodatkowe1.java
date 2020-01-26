package zadania;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;



import java.util.Random;

public class dodatkowe1 {

    private WebDriver driver;

    String[] products = {"T-shirt", "Mug", "Sweater", "Cushion", "Poster", "Notebook"};

    Random random = new Random();
    int randomInteger = random.nextInt(50);
     int productSelector = (randomInteger % products.length);




@Before
    public void setUp() {
        // Uruchom nowy egzemplarz przeglądarki Chrome

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        //przejdz do sklepu
        driver.get("http://prod-kurs.coderslab.pl");


    }
    @Test
    public void testProdSearch() throws InterruptedException {
         // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("s"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();
        Thread.sleep(5000);

        // Wpisz informacje do wyszukania
        //element.sendKeys("Mug");
        element.sendKeys(products[productSelector]);

        // Prześlij formularz
        element.submit();
    }
    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}

/*

Pierwszym zadaniem będzie przygotowanie skryptu, który zwery kuje funkcjonalność wyszukiwania
produktów w sklepie. Celem naszego testu będzie uniknięcie tzw. paradoksu pestycydów - czyli
wykorzystywania tych samych danych podczas testu. Dlatego też ważne będzie, aby wyszukiwać
produkt w sposób losowy.

 */