package steps;

/**
 * Created by guru on 1/02/18.
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "/Users/guru/Documents/Projects/TestAutomation/Domain_Test_Auto_Project/src/test/java/steps",
        format = {
                "json:target/cucumber/wikipedia.json",
                "html:target/cucumber/wikipedia.html",
                "pretty"
        },
        features="src/test/java/features"
)
public class CucumberRunner {


}