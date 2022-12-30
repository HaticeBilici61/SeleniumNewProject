package Day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

       // 2- Add Element butonuna basin
        Thread.sleep(3000);
     // WebElement addbutonu=driver.findElement(By.xpath("/*[@onclick='addElement()']"));//ister bu sekil
        WebElement addbutonuT=driver.findElement(By.xpath("[text()='Add Element']"));//ister bu sekil
        //xpath kullaniminda locate edecegimiz web element text e sahipse yukaridaki sekildede kullanabiliriz
       addbutonuT.click();

       // 3 Delete butonu’nun gorunur oldugunu test edin
        WebElement deletebutponu=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deletebutponu.isDisplayed()){ //bir web elementin gorunur olup olmadiginiisDplayed methodu ile bakariy
            System.out.println("delete butonu passed");
        }else{
            System.out.println("test failed");
        }
       // 4 Delete tusuna basin
        Thread.sleep(3000);
        deletebutponu.click();

        // 5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElementYazisi= driver.findElement(By.xpath("//h3"));
        if (addRemoveElementYazisi.isDisplayed()){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }


    }
}
