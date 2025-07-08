
package stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/negative_scenarios.feature",
        glue = "stepdefs",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags = "@negative"
)
public class NegativeTestRunner extends AbstractTestNGCucumberTests {
}
