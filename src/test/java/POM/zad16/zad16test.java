package POM.zad16;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/zad16.feature",
        plugin = {"pretty","html:out"})
public class zad16test {
}




