package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featuresfiles/OpenNinja.feature",glue="ninjaSteps",monochrome=true)
public class RunnerClassTest {	
}
