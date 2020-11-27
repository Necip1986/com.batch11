package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class VerifyTitleandURL {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        1.Yeni bir Class olusturalim. (VerifyTitle)
        2.Google ana sayfasina gidelim . https://www.google.com/
        3.Sayfa basliginin (title) “google” oldugunu dogrulayin. (verify)
         */
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String actualResult=driver.getTitle();
        String expectedResult="google";

        if(actualResult.equals(expectedResult)){
            System.out.println("Page title testi PASS");
        }else{
            System.out.println("Page title testi FAILED");
            System.out.println("Actual page title: "+actualResult);
        }

        /*
           1.Navigate to youtube homepage https://www.youtube.com/
           2.Verify if youtube homepage url is “www.youtube.com”
         */
        driver.navigate().to("https://www.youtube.com/");
        String actualURL=driver.getCurrentUrl();
        String expectedURL="www.youtube.com";

        if(actualURL.equals(expectedURL)){
            System.out.println("homepage URL testi PASS");
        }else{
            System.out.println("Homepage URL testi FAILED ");
            System.out.println("Actual homepage URL: "+actualURL);
        }







        driver.close();

    }
}
