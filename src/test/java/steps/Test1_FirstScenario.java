package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CommonPage;
import utility.Driver;

public class Test1_FirstScenario {

    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage(driver);

    @Given("I have open URL")
    public void i_have_open_url(){
        String url= "https://www.tenforce.com/";
        commonPage.openURL(url);
        commonPage.homePageCheck();

    }

    @And("I go on Career page")
    public void iGoOnCareerPage() {
        commonPage.javaScriptFullPageScroll();
        commonPage.careerFooter();
        commonPage.careerPageCheck();

    }


    @And("I go on Life at Tenforce session")
    public void iGoOnLifeAtTenforceSession() {
        commonPage.lifeAtTenforceTab();


    }

    @And("I Open \"Life of two interns\" article")
    public void iOpenLifeOfTwoInternsArticle() {
        commonPage.articleOpen();
        commonPage.articlePageCheck();
    }


    @And("I scroll through the article")
    public void iScrollThroughTheArticle() {
        commonPage.javaScriptFullPageScroll();

    }

    @When("I go back to Job openings")
    public void iGoBackToJobOpenings() {
        commonPage.navigateBack();
        commonPage.selectJobOpening();

    }


    @Then("I make sure there is the text “Feel free to send your CV to job”")
    public void iMakeSureThereIsTheTextFeelFreeToSendYourCVToJob() {
        commonPage.verifyJobOpeningText();
    }
}
