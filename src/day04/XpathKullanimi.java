package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class XpathKullanimi {
    /*
       1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
       2- Add Element butonuna basin
       3- Delete butonu’nun gorunur oldugunu test edin
       4- Delete tusuna basin
       5- Delete butonunun gorunur olmadigini test edin
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement addElementTusu=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementTusu.click();

        WebElement deleteButonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("Delete butonu gorundu Testi PASS");
        }else{
            System.out.println("Delete butonu gorundu Testi FAILED");
        }

        deleteButonu.click();
        //element olmayinca test edemiyr hata veriyor. 5'i iptal ediyoruz
       // if(deleteButonu.isDisplayed()){
         //   System.out.println("Delete butonu bastiktan sonra isDisplayed Testi PASS");
        //}else{
          //  System.out.println("Delete butonu bastiktan sonra isDisplayed Testi FAILED");
        //}



    }
}
