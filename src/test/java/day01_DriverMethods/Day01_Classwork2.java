package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_Classwork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//bu method sayfadaki her bir web element icin
                                                                         //max.bekleme suresini belirler.

      /*


        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
         oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
                Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
                https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
       */

       //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //  oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver.get("https://facebook.com");
        String actualTitel=driver.getTitle();
      if (actualTitel.contains("facebook")){
          System.out.println("Titel testi Passed");
      }else{
          System.out.println("titel testi failed"+actualTitel);

      }

       // Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        // yazdirin.
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains("actual")){
            System.out.println("URL testi passed");
        }else{
            System.out.println("Url testi FAILED"+actualUrl);
        }

      //  https://www.walmart.com/ sayfasina gidin.
       driver.get(" https://www.walmart.com/");

    //  Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWarmTitel= driver.getTitle();
        if (actualWarmTitel.contains("Walmart.com")){
            System.out.println("titel testi Passed");
        }else{
            System.out.println("titel Testi Failed");
        }
        //  Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        // Sayfayi yenileyin
        driver.navigate().refresh();

       // 9.Browser’i kapatin
        driver.close();

    }
}
