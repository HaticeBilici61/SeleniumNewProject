package day02_DriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test01 {
    public static void main(String[] args) {
           System.setProperty("webdriver.chrome.drive","src/resources/drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- https://www.amazon.com/ adresine gidin
        driver.get(" https://www.amazon.com");
        //3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4-Sayfayi "refresh" yapin
        driver.navigate().refresh();
        //5-"Salesforce Apex Questions Bank" icin arama yapiniz
         driver.findElement(By.name("field-keywords")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);
        //6- Kac sonuc bulundugunu yaziniz
      WebElement aramasonucu= driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramasonucu.getText());
        //7-Sayfayi kapatin
        driver.close();

    }
}
