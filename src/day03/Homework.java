package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework {
    /*
       1. Bir class oluşturun : GoogleSearchTest
       2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.google web sayfasına gidin. https://www.google.com/
        b. Search(ara) “city bike”
        c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. “Shopping” e tıklayın.
        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
       // driver.navigate().to("https://www.facebook.com");
       // driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement searchButonuLocate=driver.findElement(By.name("q"));
        searchButonuLocate.sendKeys("city bike");
        searchButonuLocate.submit();
        
    }
}
