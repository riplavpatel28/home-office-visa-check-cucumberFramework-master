package gov.uk.check.visa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/**
 * Created by Jay Vaghani
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/gov/uk/check/visa/resources/featurefile",
        glue ="gov/uk/check/visa",
        tags = "@Sanity",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}

)
public class Sanity {


}
