package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/reports/cucumber.json", "json:target/reports/cucumber.cucumber",
        "pretty"}, features = {"src/test/resources/hellocucumber/"}, glue = {"stepdefinitions"})


public class RunCucumber {
}
