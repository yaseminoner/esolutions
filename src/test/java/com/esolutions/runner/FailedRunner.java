package com.esolutions.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/esolutions/stepDefs",
        features = "@target/rerun.txt"
)
public class FailedRunner {
}
