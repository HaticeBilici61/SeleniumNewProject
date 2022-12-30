package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//bu sayfadaki her bir web elemntin bekleme suresi

        //  Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");
        //  Amazon soyfasina gidelim. https://www.amazon.com/

            Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com");

        // Tekrar YouTube’sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();

        //   Yeniden Amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //Sayfayi Refresh(yenile) yapalim
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Sayfayi kapatalim
        driver.close();






       // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));

      //   Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());//sayfa konumu
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());//sayfa boyutu

     // Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin

        driver.manage().window().setPosition(new Point(80,10));
        driver.manage().window().setSize(new Dimension(800,600));

     //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
     Point p=new Point(80,10);
        System.out.println("Sayfanin yeni konumu = " + p);
     Dimension s=new Dimension(800,300);
        System.out.println("sayfanin yeni boyutu = " + s);

        if (p.x==10 && p.y==10){
            System.out.println("konum testi passed");
        }else{
            System.out.println("konum testi failed");
        }

        if (s.width==800 && s.height==300){
            System.out.println("boyut testi passed");
        }else{
            System.out.println("Boyut tedsti failed");
        }
        System.out.println("Sayfanin yeni konumu = " + p);
        System.out.println("sayfanin yeni boyutu = " + s);

     // Sayfayi kapatin
        driver.close();












    }
}
