package CucumberOptions;





import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\features\\login.Feature" ,glue = {"StepDefination"},
        tags= { "@MobileTest,  @WebTest"}, //dryRun = true,
        strict=true,
        monochrome=true,
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"}
)
public class TestRunner {





}
