package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Page {

    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    @FindBy(xpath = "//a[@href='/career/']")
    public WebElement career;

    public void careerPageCheck(){
        wait.until(ExpectedConditions.titleIs("EHS Software for Safety, Compliance & Operational Risk | TenForce"));
    }

    @FindBy (xpath = "")
    public WebElement life_At_Tenforce;




























}
