package stepRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/LoginHRM.feature",
        glue={"stepDefination"},
        dryRun = false
)



public class Runner {
}
