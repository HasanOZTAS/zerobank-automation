package com.zerobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports"
        },
        features = "src/test/resources/features",       // Location of feature file
        glue = "com/zerobank/stepdefinitions",          // Location of step definitions files
        dryRun = true,                                 // Checks if there is missing step
        tags = "@wip"                                   // Which scenario will be run
)
public class CukesRunner {


}
