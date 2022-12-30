package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
        En temel haliyle otomasyon yapmak icin class imiza otomasyon icin gerekli olan WeBdriver in yerini gostermemiz gerekir.
        Bunun icin Java kutuphanesinden System.setproperty() methodunun icine ilk olarak Driver 'I yazariz.2.olarak Driver
        in fiziki yolunu kopyalariz

         */

        WebDriver driver=new ChromeDriver();
         driver.get("https://www.techproeducation.com");

    }

}
