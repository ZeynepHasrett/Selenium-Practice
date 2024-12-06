package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {

    public static void main(String[] args) throws InterruptedException {

    /*
        1. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        2. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        doğru URL'yi yazdırın.
        3. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
        4. Youtube sayfasina geri donun
        5. Sayfayi yenileyin
        6. Testotomasyonu sayfasina donun
        7. Sayfayi tamsayfa yapin
        8. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        9. Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin,
        degilse doğru URL'yi yazdırın
        10. Sayfayi kapatin
     */

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        //    eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");

        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
            System.out.println(actualTitle);
        }

        // 2. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        //    içermiyorsa doğru URL'yi yazdırın.
        String expectedUrlIcerik = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url testi FAILED");
            System.out.println(actualUrl);
        }

        // 3. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
        driver.navigate().to("https://www.testotomasyonu.com/");

        // 4. Youtube sayfasina geri donun
        driver.navigate().back();

        // 5. Sayfayi yenileyin
        driver.navigate().refresh();

        // 6. Testotomasyonu sayfasina donun
        driver.navigate().forward();

        // 7. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        // 8. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin,
        //  Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedTestOtoTitleIcerik = "Test";
        String actualTestOtoTitle = driver.getTitle();

        if (actualTestOtoTitle.contains(expectedTestOtoTitleIcerik)) {
            System.out.println("Test Otomasyon title testi PASSED");
        } else {
            System.out.println("Test Otomasyon title testi FAILED");
            System.out.println(actualTestOtoTitle);
        }

        // 9. Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin,
        //    degilse doğru URL'yi yazdırın
        String expectedTestOtoUrl = "https://www.testotomasyonu.com/";
        String actualTestOtoUrl = driver.getCurrentUrl();

        if (actualTestOtoUrl.equals(expectedTestOtoUrl)) {
            System.out.println("Test Otomasyon url testi PASSED");
        } else {
            System.out.println("Test Otomasyon url testi FAILED");
            System.out.println(actualTestOtoUrl);
        }

        // 10. Sayfayi kapatin
        driver.quit();

    }

}
