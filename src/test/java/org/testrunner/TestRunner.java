package org.testrunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile\\FirstProject.feature", 
glue = "org.stepdefinition" ,dryRun=false,strict=false,monochrome=true,
plugin= {"pretty","html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\output.json",
		"junit:src\\test\\resources\\Reports\\adactin.xml",
//		"rerun:src\\test\\resources\\Rerun"
//		tags= {"@smoke"}xx
		})
public class TestRunner {
	@AfterClass
	public static void javaReportGenerator() {
//JvmReports.generateJvmReport(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\output.json");
	}
		
}
