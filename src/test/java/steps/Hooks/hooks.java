package steps.Hooks;

import Utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before()
    public void beforeScenario() {

        Driver.getDriver();

    }


    @After()
    public void afterScenario() {
    }


}
