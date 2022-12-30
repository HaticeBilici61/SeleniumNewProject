package day02_DriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {

        /*
        ilk once browser i maximal yapalim sonra tum sayfa icin maksimum bekleme suresi olarak 15 saniye belirtelim
        Sirasiyla Amazon ,Facebook ve Youtube sayfalarina gidelim.
        Amazon sayfasina tekrar donelim.
        Amazon sayfasinin Url inin https://www.amazon.com/ adresine esit oldugunu test edelim
        Sayfanin konumunu ve pozisyonunu yazdiralim
        Sayfanin konumunu ve size ini istedigimiz sekilde ayarlayalim.
        Ve istedigimiz sekilde oldugunu test edelim
        ve sayfayi kapatalim
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //ilk once browser i maximal yapalim sonra tum sayfa icin maksimum bekleme suresi olarak 15 saniye belirtelim
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // Sirasiyla Amazon ,Facebook ve Youtube sayfalarina gidelim.
        driver.get(" https://www.amazon.com");
        driver.get(" https://www.facebook.com");
        driver.get(" https://www.youtube.com");

       // Amazon sayfasina tekrar donelim.
        driver.navigate().back();//face e donecek
        driver.navigate().back();

        // Amazon sayfasinin Url inin https://www.amazon.com/ adresine esit oldugunu test edelim

      String actualUrl=  driver.getCurrentUrl();
      String expectedUrl="https://www.amazon.com/ ";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url test Passed");
        }else{
            System.out.println("Url testi Failed");
        }

     // Sayfanin konumunu ve pozisyonunu yazdiralim
        System.out.println("sayfanin size i = " + driver.manage().window().getSize());
        System.out.println("sayfanin konumu= " + driver.manage().window().getPosition());

       // Sayfanin konumunu ve size ini istedigimiz sekilde ayarlayalim.
     driver.manage().window().setSize(new Dimension(600,600));
     driver.manage().window().setPosition(new Point(50,50));
        System.out.println("sayfanin yenisize i = " + driver.manage().window().getSize());
        System.out.println("sayfanin yenikonumu= " + driver.manage().window().getPosition());

     //  Ve istedigimiz sekilde oldugunu test edelim
        Dimension actualYeniSize= driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("YeniSize testi Passed");
        }else{
            System.out.println("Yenisize testi Failed");
        }

       Point actualYeniPosition= driver.manage().window().getPosition();
      if (actualYeniPosition.getX()==50 && actualYeniPosition.getY()==50){
        System.out.println("YeniSize testi Passed");
    }else{
        System.out.println("Yenisize testi Failed");
    }
   // ve sayfayi kapatalim
        driver.close();

    }
}
