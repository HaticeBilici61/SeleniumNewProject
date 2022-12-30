package day02_DriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementveLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon safasina gidelim
        driver.get("https://amazon.com");

        //search bolumunu locate edelim
      WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));

        //Search bolumunde iphone aratalim.
        aramakutusu.sendKeys("iphone", Keys.ENTER);

        /*
        Eger bir web elementi(web sayfasindaki her bir buton yada text/yazi) locate(konumunu belirleme)
         etmek istersek once  manuel web sayfasini acip sayfa uzerinde sag clik yapip incele 'ye tiklariz.
         Karsimiza cikan HTML code larindan locater'lardan (Konum belirleyiciler) essiz seceriz.
         Genellikle ID Attribute 'u kullanilir ve Sectigimiz Attribute degerini find element () metodu icine
         findelement(By.id(Attribute degeri) seklinde yazariz
         */

        //Amazon sayfasindaki input ve a tag larinin sayisini yazdiriniz.
       List<WebElement> inputTags= driver.findElements(By.tagName("a"));
        System.out.println( "inputTag sayisi =" +inputTags.size());

        List<WebElement> linklerlist=driver.findElements(By.tagName("a"));
        System.out.println( "link sayisi =" +linklerlist.size());

        for (WebElement w:linklerlist){
            System.out.println(w.getText());
        }

        }
    }

