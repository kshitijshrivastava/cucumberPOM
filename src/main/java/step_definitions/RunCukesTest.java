package step_definitions;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import org.w3c.dom.views.AbstractView;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\kshitij.shrivastava\\workspace\\cucumberPOM\\src\\test\\resources\\features\\BrowserCommands.feature",
		plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
		glue="C:\\Users\\kshitij.shrivastava\\workspace\\cucumberPOM\\src\\main\\java\\step_definitions\\BrowserCommands.java",
		tags = {}
		)
public class RunCukesTest{
	
}