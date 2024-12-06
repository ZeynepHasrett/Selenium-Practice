package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05 {

    public static void main(String[] args) {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2- https://www.testotomasyonu.com adresine gidin
        driver.get("https://www.testotomasyonu.com");

        // 3- urun arama kutusunu locate edin
        WebElement aramaKutusuElementi = driver.findElement(By.id("global-search"));

        // 4- arama kutusuna “shoe” yazdirin
        aramaKutusuElementi.sendKeys("shoe");

        // 5- arama islemini yapabilmek icin ENTER tusuna basin
        aramaKutusuElementi.submit();

        // Sayfayi kapatin
        driver.quit();

    }

}