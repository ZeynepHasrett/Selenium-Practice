package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C06_Test {

    public static void main(String[] args) {

        // Navigate to https://testpages.herokuapp.com/styled/index.html
        // Click on Calculater under Micro Apps
        // Type any number in the first input
        // Type any number in the second input
        // Click on Calculate
        // Get the result
        // Print the result

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        driver.findElement(By.xpath("//a[@id='calculatetest']"))
                .click();

        WebElement birinciKutu = driver.findElement(By.id("number1"));
        birinciKutu.sendKeys("100");

        WebElement ikinciKutu = driver.findElement(By.id("number2"));
        ikinciKutu.sendKeys("200");

        driver.findElement(By.id("calculate"))
                .click();

        WebElement sonuc = driver.findElement(By.id("answer"));

        String sonucStr = sonuc.getText();

        System.out.println("Result : " + sonucStr);

        driver.quit();

    }

}
