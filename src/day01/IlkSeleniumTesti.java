package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkSeleniumTesti {

    public static void main(String[] args) {

        //sayfada ilk olarak driver objesi olusturulur. impot'lar otomatikman oluyor.
        //daha sonra bilgisayarimiza indirdigimiz chrome driver'i ekliyoruz.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //ilk kurulumlar tamamlandi

        //driver.get("https://www.google.com/");
        driver.get("https://www.youtube.com/"); //get konutu ile herhangi bir siteyi acabiliyoruz.
        driver.manage().window().maximize(); //sayfayi tam ekran yapiyor
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        //driver.close();  //sadece calisilan browser'i kapatir. acilan sayfa kapanir
        driver.quit();  //Acik olan tum browser'lari kapatir.butun chromu kapatir.



    }
}
