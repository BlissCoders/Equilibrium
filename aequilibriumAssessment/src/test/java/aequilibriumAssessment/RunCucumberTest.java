package aequilibriumAssessment;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber.json","html:target/html/","junit:target/cucumber-results.xml"})
public class RunCucumberTest {

}
