package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01 {

    public static void main(String[] args) throws InterruptedException {

        /*
            1. https://www.testotomasyonu.com/ sayfasina gidin
            2. Sayfanin konumunu ve boyutlarini yazdirin
            3. Sayfayi simge durumuna getirin
            4. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
            5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
            6. Sayfayi fullscreen yapin
            7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
            8. Sayfayi kapatin
         */

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/");

        // 2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Acilista sayfanin konumu : " + driver.manage().window().getPosition());
        System.out.println("Acilista sayfanin boyutu : " + driver.manage().window().getSize());

        // 3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        // 4. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfa maximize durumdayken konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfa maximize durumdayken boyutu : " + driver.manage().window().getSize());

        // 6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfa fullscreen durumdayken konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfa fullscreen durumdayken boyutu : " + driver.manage().window().getSize());

        // 8. Sayfayi kapatin
        driver.quit();

    }

}
