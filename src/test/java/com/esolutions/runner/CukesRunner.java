package com.esolutions.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
        },
        features="src/test/resources/features",
        glue="com/esolutions/stepDefs",
        dryRun = false,
        tags="@smoke",
        publish = true
)
public class CukesRunner {
}
