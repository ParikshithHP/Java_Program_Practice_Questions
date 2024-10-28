package org.testing.project.cucumberBDDFrameworkQuestions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//defines cucumber should be used as test runner
@CucumberOptions(//tells the junit to run with cucumber " Defines path for features steps and
        tags = "@Test",
        features = "src/test/resources/featurefiles",
        glue = "src/test/resources/StepDefinitions",
        plugin = {"pretty","html:/taget/cucumber-reports.html"}
        //monochrome = true
        //publish = true
        )

public class TestRunner {
}
