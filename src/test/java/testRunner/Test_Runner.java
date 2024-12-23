package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features/login1.feature"},glue= {"StepDefination"},plugin= {
		"pretty", "html:reports/myreport1.html"} )
public class Test_Runner {

}
