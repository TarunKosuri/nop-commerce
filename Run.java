package TestRun;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
					features="Features", 
					glue="stepdef", 
					dryRun=false,
					plugin= {"pretty", "html:test-output"}
				)

public class Run 
{

}


