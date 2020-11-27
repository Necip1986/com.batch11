package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class TekrarTesti {
    public static void main(String[] args) {

        /*
        1. Yeni bir class olusturun (TekrarTesti)
        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını  doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa  doğru URL'yi yazdırın.
        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. RefrSayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa     doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru  URL'yi yazdırın
        11.Sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");

        String actualTitle=driver.getTitle();
        String expectedTitle="youtube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Youtube Title testi PASS");
        }else{
            System.out.println("Youtube Title testi FAILED");
            System.out.println("Youtube sayfasi actual Title: "+actualTitle);
        }

        String actualURL=driver.getCurrentUrl();
        String urlisContains="youtube";
        if(actualURL.contains(urlisContains)){
            System.out.println("URL contains youtube Testi PASS");
        }else{
            System.out.println("URL contains youtube Testi FAILED");
            System.out.println("Actual Youtube URL: "+actualURL);
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String actualTitleAmazon=driver.getTitle();
        String arananAmazonKelime="Amazon";

        if(actualTitleAmazon.contains(arananAmazonKelime)){
            System.out.println("Amazon Title contains Amazon Testi PASS");
        }else{
            System.out.println("Amazon Title contains Amazon Testi FAILED");
            System.out.println("Actual Amazon URL: "+actualTitleAmazon);
        }

        String actualURLAmazon=driver.getCurrentUrl();
        String expectedAmazonURL="https://www.amazon.com/";
        if(actualURLAmazon.equals(expectedAmazonURL)){
            System.out.println("Amazon URL Testi PASS");
        }else{
            System.out.println("Amazon URL Testi FAILED");
            System.out.println("Actual Amazon URL: "+actualURLAmazon);
        }

        driver.close();


    }
}
