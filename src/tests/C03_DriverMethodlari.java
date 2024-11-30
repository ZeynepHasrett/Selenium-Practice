package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        /*
             Create a new class with main method
             Set Path
             Create a chrome driver
             Maximize window
             Open google home page https://www.google.com
             On the same class, navigate to wisequarter home page https://www.wisequarter.com and navigate back to google
             Wait about 4 sn
             Navigate forward to wisequarter
             Refresh page
             Close/quit the browser
             And Last step print "All is well" on console
    */

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.navigate().to("https://www.wisequarter.com");

        driver.navigate().back();

        Thread.sleep(4000);

        driver.navigate().to("https://www.wisequarter.com");

        driver.navigate().refresh();

        driver.quit();

        System.err.println("All is well");

    }

}
