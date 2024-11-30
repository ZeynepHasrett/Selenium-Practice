package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02 {

    public static void main(String[] args) {

        /*
            1. https://www.testotomasyonu.com/ sayfasina gidin
            2. Sayfanin konumunu ve boyutlarini yazdirin
            3. Sayfanin konumunu pixel olarak (50,50)’ye getirin
            4. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
            5. Sayfanin istenen konum ve boyuta geldigini test edin
            6. Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/");

        // 2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Acilista sayfanin konumu : " + driver.manage().window().getPosition());
        System.out.println("Acilista sayfanin boyutu : " + driver.manage().window().getSize());

        // 3. Sayfanin konumunu pixel olarak (50,50)’ye getirin
        driver.manage().window().setPosition(new Point(50, 50));

        // 4. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
        driver.manage().window().setSize(new Dimension(1000, 500));

        // 5. Sayfanin istenen konum ve boyuta geldigini test edin
        String expectedKonum = String.valueOf("(50, 50)");
        String actualKonum = String.valueOf(driver.manage().window().getPosition());

        if (actualKonum.equals(expectedKonum)) {
            System.out.println("Konum testi PASSED");
        } else System.out.println("Konum testi FAILED");

        String expectedBoyut = String.valueOf("(1000, 500)");
        String actualBoyut = String.valueOf(driver.manage().window().getSize());

        if (actualBoyut.equals(expectedBoyut)) {
            System.out.println("Boyut testi PASSED");
        } else System.out.println("Boyut testi FAILED");

        // 6. Sayfayi kapatin
        driver.quit();

    }

}
