package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Test1 {

    public static void main(String[] args) throws InterruptedException {

        /*
            1- https://babayigit.net/test/index.html adresine gidin
            2- Arama kutusuna 12 Kızgın yazıp search butonuna tıklayın
            3- Arama sonuçlarında sonuç sayısını kaydedip yazdırın
        */

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://babayigit.net/test/index.html");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement aramaKutusu = driver.findElement(By.id("search"));
        aramaKutusu.sendKeys("12 Kızgın");

        driver.findElement(By.xpath("//input[@value='Search']"))
                .click();

        driver.findElement(By.id("hdtb-tls"))
                .click();

        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@id='result-stats']"));

        String sonucSayisiStr = sonucSayisi.getText();

        List<String> aramaSonucSayisiList = new ArrayList<>(Arrays.asList(sonucSayisiStr.split(" ")));

        System.out.println("Arama sonuc sayisi : " + aramaSonucSayisiList.get(1));

        driver.quit();

    }

}
