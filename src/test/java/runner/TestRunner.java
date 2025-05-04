package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = { "utility","stepDefinition" },
       // plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
         plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}


//io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm
)
public class TestRunner {
}
