import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnePage {

    public static void main(String[] args){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tenforce.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("EHS Software for Safety, Compliance & Operational Risk | TenForce"));

        // Locator
        WebElement career = driver.findElement(By.xpath("//a[@href='/career/']"));
        career.click();

        wait.until(ExpectedConditions.titleIs("Сareer | TENFORCE"));

























    }



}
