package com.wip.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= {"src/test/Resources"},
		glue= {"com.wip.test"},
		tags={"@tag2,@tag1"},
		monochrome=true,
		plugin= {"pretty","html:target/cucumber"}
)
public class RunnerFile {

}
