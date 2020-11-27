package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework {
    /*
       1. Bir class oluşturun : Locators_css
       2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
          a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
          b. Locate email textbox
          c. Locate password textbox ve
          d. Locate signin button
          e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
            i. Username : testtechproed@gmail.com
            ii. Password : Test1234!
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement emailTextBox=driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement signInButton= driver.findElement(By.xpath("//input[@type='submit']"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.submit();
    }
}
