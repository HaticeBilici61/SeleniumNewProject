package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Classwork {
    public static void main(String[] args) {

        /*
     Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “Amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.
        Ausblenden
 */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        // Sayfa basligini(title) yazdirin
        System.out.println("sayfa basligi : "+ driver.getTitle());

        // Sayfa basliginin “Amazon” icerdigini test edin
         if (driver.getTitle().contains("Amazon")){
             System.out.println("Title testi PASSED");
         }else{
             System.out.println("Title testi FAILED");
         }

         //Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

         //  Sayfa url’inin “Amazon” icerdigini test edin.
         if (driver.getCurrentUrl().contains("Amazon")){
             System.out.println("URL testi PASSED");
         }else{
             System.out.println("URL testi FAILED");
         }

       // Sayfa handle degerini yazdirin
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());


       // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        System.out.println(driver.getPageSource());
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("getPageSource testi PASSED");
        }else{
            System.out.println("getPageSource testi FAILED");
        }

        //Sayfayi kapatin.
        driver.close();
    }


    }

