package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsIntro {
    /*
    1. Bir class oluşturun: LocatorsIntro
    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    i. Username : testtechproed@gmail.com
    ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
    doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //soylenmese bile sayfayi maximize etmeliyiz. cunku bazi veriler kucuk boyutta gorulmeyebilir
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        //Sign in butonuna basin
        //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        //id ile locate ediyoruz

        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // Thread.sleep(2000); //zaman kazandirmak gerekiyor yoksa yazmiyor

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
       //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
       //id unique ve name unique bunu inspect te gorduk
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement signInButonu=driver.findElement(By.name("commit"));

        /*d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
           i. Username : testtechproed@gmail.com
            ii. Password : Test1234!
       */
        //Thread.sleep(2000);
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

       // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
       WebElement kullaniciAdi=driver.findElement(By.className("navbar-text"));
       if(kullaniciAdi.isDisplayed()){
           System.out.println("Kullanici adi testtechproed@gmail.com PASS ");
       }else{
           System.out.println("Kullanici adi testtechproed@gmail.com FAILED");
       }

       //2. yol
        if(kullaniciAdi.getText().equals("testtechproed@gmail.com")){
            System.out.println("Kullanici adi testtechproed@gmail.com PASS ");
        }else{
            System.out.println("Kullanici adi testtechproed@gmail.com FAILED");
        }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
        //    doğrulayin(verify).

        WebElement adressesLinki=driver.findElement(By.linkText("Addresses"));

        if(adressesLinki.isDisplayed()){
            System.out.println("Adresses Linki gorundu tasti PASS ");
        }else{
            System.out.println("Adresses Linki gorundu tasti FAILED ");
        }

        WebElement signOutGoruntusu=driver.findElement(By.linkText("Sign out"));
        if(signOutGoruntusu.isDisplayed()){
            System.out.println("Sign out gorundu tasti PASS ");
        }else{
            System.out.println("Sign out gorundu tasti FAILED ");
        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfada "+linkListesi.size()+ " tane a tag'i yani link vardir");

        //4-Linkleri yazdiralim
        for (WebElement w:linkListesi) {
            System.out.println(w.getText());
        }

        driver.close();


    }
}
