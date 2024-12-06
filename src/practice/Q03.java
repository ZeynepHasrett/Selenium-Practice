package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {

    public static void main(String[] args) {

    /*
        1. ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
        yazdirin.
        2. Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        “actual” URL’i yazdirin.
        3. https://www.walmart.com/ sayfasina gidin.
        4. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        5. Tekrar “facebook” sayfasina donun
        6. Sayfayi yenileyin
        7. Sayfayi tam sayfa (maximize) yapin
        8. Browser’i kapatin
     */

        // 1. ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //    (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin
        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com");
        String expectedBaslik = "facebook";
        String actualBaslik = driver.getTitle();

        if (actualBaslik.equals(expectedBaslik)) {
            System.out.println("Baslik testi PASSED");
        } else System.out.println(expectedBaslik);

        // 2. Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //    “actual” URL’i yazdirin.
        String expectedUrlIcerik = "facebook";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Url testi PASSED");
        } else System.out.println(actualUrl);

        // 3. https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        // 4. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitleIcerik = "Walmart.com";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");

        // 5. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        // 6. Sayfayi yenileyin
        driver.navigate().refresh();

        // 7. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        // 8. Browser’i kapatin
        driver.quit();

    }

}
