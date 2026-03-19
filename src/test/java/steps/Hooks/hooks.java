package steps.Hooks;

import org.openqa.selenium.WebDriver;
import utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before()
    public void beforeScenario() {

        Driver.getDriver();

    }


    @After()
    public void afterScenario() {

        Driver.quitDriver();

    }


}
