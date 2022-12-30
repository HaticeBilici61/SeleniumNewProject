package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        //techproeducation sayfasina gudelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://techproeducation.com");

        //Tekrar Amazon sayfasina donelim
        driver.navigate().back();//bir geri sayfaya gidiyoruz yani Amazon sayfasina geri doner

        //Tekrar Hepsiburada sayfasija gidelim
        driver.navigate().forward();//bir sonraki sayfaya gidiyoruz YAni tekrar Techpro ya gider

        //son sayfada sayfayi yenileyelim(refresch)
        driver.navigate().refresh();

        //ve sayfayi kapatalim
        driver.close();


    }
}
