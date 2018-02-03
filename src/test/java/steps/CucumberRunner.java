package steps;

/**
 * Created by guru on 1/02/18.
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "/Users/guru/Documents/Projects/TestAutomation/Sel_Java_Cuc/src/test/java/steps",
        format = {
                "json:target/cucumber/wikipedia.json",
                "html:target/cucumber/wikipedia.html",
                "pretty"
        },
        features="src/test/java/features"
)
public class CucumberRunner {


}