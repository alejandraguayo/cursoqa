package com.Aleja.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.Aleja.stepDefinitions", "com.Aleja.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
