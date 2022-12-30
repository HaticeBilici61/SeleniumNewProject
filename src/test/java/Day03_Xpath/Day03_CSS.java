package Day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Day03_CSS {
    public static void main(String[] args) {
//       // 1-C01_TekrarTesti isimli bir class olusturun
//       2- https://www.amazon.com/ adresine gidin
//       3- Browseri tam sayfa yapin
//        4- Sayfayi “refresh” yapin
//        5Sayfa basliginin “Spend less” ifadesi icerdigini test edin
//        6Gift Cards sekmesine basin
//        7Birthday butonuna basin
//        8 Best Seller bolumunden ilk urunu tiklayin
//        9- Gift card details’den 25 $’i secin
//        10-Urun ucretinin 25$ oldugunu test edin
//        10-Sayfayi kapatin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       // 1-C01_TekrarTesti isimli bir class olusturun

        // 2- https://www.amazon.com/ adresine gidin
        driver.get(" https://www.amazon.com/ ");

       // 3- Browseri tam sayfa yapin
       driver.manage().window().maximize();

       // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

       // 5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
          String actualTitel= driver.getTitle();
          String aranakelime= "Spend less";
          if (actualTitel.contains(aranakelime)){
              System.out.println("Title testi passed");
          }else{
              System.out.println("titel testi failed");
          }

//        6-Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //        7-Birthday butonuna basin
        //img[alt='Birthday'] bunu da kullanabiliriz
        driver.findElement(By.cssSelector("img[src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']"));
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();

        // 8 Best Seller bolumunden ilk urunu tiklayin
      List<WebElement> bestSellerbolumu= driver.findElements(By.cssSelector("img[alt='Amazon.com eGift Card']"));
      bestSellerbolumu.get(0).click();

      //  9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("span[id='a-autoid-28']")).click();

      //  10-Urun ucretinin 25$ oldugunu test edin
     WebElement testucret=   driver.findElement(By.cssSelector("span[id='gc-live-preview-amount']"));
     if (testucret.getText().equals("$25.00")){
         System.out.println("testucret passed");
     }else{
         System.out.println("testucret failed");
     }


    }
}
