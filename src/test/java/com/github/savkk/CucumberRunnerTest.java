package com.github.savkk;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/features")
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
    public CucumberRunnerTest() {
    }
}
