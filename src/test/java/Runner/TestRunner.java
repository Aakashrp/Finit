package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "E:\\My Projects\\All Projects\\Finti_UI_TestAutomation\\src\\test\\java\\Feature",
        glue = {"StepDefinition"},
        plugin={"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports.html",
        },
//        tags="@Smokeone",
        stepNotifications= true,
        monochrome=true
        //dryRun = true
        //  "json:target/cucumber-reports/cucumber.json"
        //"html:target/cucumber-reports.html"
)

public class TestRunner {
}
