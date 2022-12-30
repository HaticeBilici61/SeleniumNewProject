package Day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class odev {
    public static void main(String[] args) {
        /*
    -Amazon sayfasına gidiniz
    -Arama kutusunu locate ediniz
    -Arama kutusunun tagName'inin input olduğunu test ediniz
    -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
     -Sayfayı kapatınız
   */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // -Amazon sayfasına gidiniz
        driver.get(" https://www.amazon.com/");

        // -Arama kutusunu locate ediniz
      WebElement aramakutusu=  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        //-Arama kutusunun tagName'inin input olduğunu test ediniz
       String actualTagName = aramakutusu.getTagName();
       String expectedTagName="input";
       if (actualTagName.equals(expectedTagName)){
          System.out.println("test passed");
       }else System.out.println("test failed");


     // -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
       String actualAttribut=aramakutusu.getAttribute("name");
       String expectedAttribut="field-keywords";
       if (actualAttribut.equals(expectedAttribut)){
           System.out.println("Attribut testi passed");
       }else{
           System.out.println("Attribut testi failed");
       }


}
}