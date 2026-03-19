package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.CommonPage;

public class Driver {

    private static final Logger logger = LoggerFactory.getLogger(Driver.class);
    private static WebDriver driver;

    public static WebDriver getDriver() {

       if(driver == null) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       }
        return  driver;
    }

    public static void quitDriver(){
        if (driver!=null){
            driver.quit();
        }



    }

}
