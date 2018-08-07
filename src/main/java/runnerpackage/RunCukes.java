package runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/createlead/CreateLead.feature",glue="steps",monochrome=true,tags="@sanity")
public class RunCukes {

}
