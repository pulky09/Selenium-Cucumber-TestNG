import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty"},features = {"src/test/java/features"},glue = {"steps","hooks"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
