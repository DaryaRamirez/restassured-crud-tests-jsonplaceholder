
package stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/positive_scenarios.feature",
        glue = "stepdefs",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags = "@positive"
)
public class PositiveTestRunner extends AbstractTestNGCucumberTests {
}
