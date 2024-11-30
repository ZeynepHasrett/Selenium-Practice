package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_SeleniumTest {

    public static void main(String[] args) {

        /*
              1-Driver oluşturalim
              2-Java class'imiza chromedriver.exe i tanitalim
              3-Driver'in tum ekranı kaplamasini saglayalim
              4-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklemesini
                söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
              5-"https://www.testotomasyonu.com" adresine gidelim
              6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
              7-Title'ın Test ve url inin testotomasyonu kelimesini içerip icermedigini kontrol edelim
              8-Ardindan "https://wisequarter.com/" adresine gidip
              9-Bu adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
              10-Bir onceki web sayfamiza geri donelim
              11-Sayfayı yenileyelim
              12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
              13- En son adim olarak butun sayfalarimizi kapatmis olalim
        */

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        String expectedTitleIcerik = "Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title testi PASSED");
        } else System.out.println("Title testi FAILED");

        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Url testi PASSED");
        } else System.out.println("Url testi FAILED");

        driver.navigate().to("https://wisequarter.com/");

        String expectedWiseTitleIcerik = "Quarter";
        String actualWiseTitle = driver.getTitle();

        if (actualWiseTitle.contains(expectedWiseTitleIcerik)) {
            System.out.println("Wise Title testi PASSED");
        } else System.out.println("Wise Title testi FAILED");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.navigate().forward();

        driver.quit();

    }

}
