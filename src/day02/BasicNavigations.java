package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        //jar dosyalari class'a eklenmez projeye eklenmelidir. biz ekledik

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.youtube.com");

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.manage().window().maximize();

        Thread.sleep(5000); // milisaniye olarak yazilir. 5 saniye bekletiyor bulunulan sayfayi

        driver.navigate().refresh();













        driver.close();
    }
}
