package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featuresfiles/OpenNinja.feature",
				 glue="ninjaSteps",
				 monochrome=true,
				plugin= {"pretty","html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerClassTest {	
	
}
