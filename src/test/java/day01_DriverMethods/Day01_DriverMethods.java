package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("sayfa basligi :"+driver.getTitle());
        System.out.println("sayfa URL 'I :" +driver.getCurrentUrl());
      //  System.out.println(driver.getPageSource()); // sayfanin tum icerigini kaynagi gosteriyor
        System.out.println(driver.getWindowHandle()); //pencereler arasi gecis yapmak ici.bize o windows a ait hasch degerini verir.biz bu hasch
                                                      //deger ile pencereler arasi gecis yapabiliyoruz







    }

}
