package pages;

import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonPage extends BasePage {

    WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(CommonPage.class);


    public CommonPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Step 1: URL Open
    public void openURL(String url){
        //url = "https://www.tenforce.com/";
        driver.get(url);
        logger.info("URL Opened");
    }

    // Step 2: Home Page Title check
    public void homePageCheck(){
        String homePageTitle = "EHS Software for Safety, Compliance & Operational Risk | TenForce";
        waitUntilTitleCheck(homePageTitle);
        logger.info("Home Page assertion passed");



    }

    // Career Page Title check
    public void careerPageCheck(){
        String careerPageTitle = "Сareer | TENFORCE";
        waitUntilTitleCheck(careerPageTitle);
        logger.info("Career Page assertion passed");
    }

    // Career Page: Life at tenforce
    @FindBy (xpath = "//div[contains(@class,'post-content')]//a[contains(text(),'Life at TenForce')]")
    private WebElement life_At_Tenforce;

    public void lifeAtTenforceTab()
    {
        life_At_Tenforce.click();
        logger.info("Tab clicked correctly");
    }

    // Step 4: article Open
    @FindBy (xpath = "//span[normalize-space()='Life of two interns']")
    private WebElement internTile;

    @FindBy (xpath = "//span[normalize-space()='Life of two interns']/ancestor::a")
    private WebElement internalTileBox;

    public void articleOpen(){

        javaScriptToElement(internalTileBox);
        internTile.click();
        logger.info("article opened correctly");
    }

    public void articlePageCheck(){
        String articlePageTitle = "Life of two interns | TENFORCE";
        waitUntilTitleCheck(articlePageTitle);
        logger.info("article page checked correctly");
    }

    // Step 5: JavaScript scrolling full page.


    // Step 6: Navigating back to career Page
    public void pageNavigateBack() {
        navigateBack();
        logger.info("Navigation backed correctly");
    }

    // Step 7: Job Opening section click and get text from it.

    @FindBy (xpath = "//div[contains(@class,'post-content')]//a[contains(text(),'Job Openings')]")
    private WebElement jobOpenings;

    public void selectJobOpening(){
        jobOpenings.click();
        logger.info("Job Opening Tab backed correctly");
    }

    @FindBy (xpath = "//a[@href='mailto:jobs@tenforce.com']//div[@class='h4']")
    private WebElement jobOpeningText;

    public void verifyJobOpeningText(){
        // System.out.println(jobOpeningText.getText());
        String expectedText = "Feel free to send your CV to jobs";
        //Assertions.assertEquals(expectedText, jobOpenings.getText());
        Assertions.assertTrue(jobOpeningText.getText().contains(expectedText));
        logger.info(jobOpeningText.getText());
        logger.info("Text matched passed correctly");





    }










































}
