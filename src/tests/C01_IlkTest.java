package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.babayigit.net");

        driver.quit();

    }

}
