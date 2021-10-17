package sprint2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
 
@CucumberOptions(features="C:\\Users\\kshailes\\eclipse-workspace\\RedBus\\src\\test\\resources\\Features\\BookaTicket.feature",
glue= {"sprint2"},monochrome=true,
plugin = {"pretty","html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
"json:target/JSONReports/report.json"} )		
 

public class TestRunner1 {

}
