package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Q6 {

    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        Actions actions = new Actions(driver);
        Thread.sleep(1);

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //3- Category bolumundeki elementleri locate edin
        List<WebElement> categoryElementleri = driver.findElements(By.xpath("//*[@class='panel panel-default']"));

        //4- Category bolumunde 3 element oldugunu test edin
        int expectedCategoryElementiSayisi = 3;
        int actualCategoryElementiSayisi = categoryElementleri.size();

        if (actualCategoryElementiSayisi == expectedCategoryElementiSayisi){
            System.out.println("Category Testi PASSED");
        }else System.out.println("Category Testi FAILED");

        //5- Category isimlerini yazdirin
        for (WebElement each:categoryElementleri){
            System.out.println(each.getText());
        }

        //6- Sayfayi kapatin
        driver.quit();

    }

}
