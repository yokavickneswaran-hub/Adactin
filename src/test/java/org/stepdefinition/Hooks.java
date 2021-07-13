package org.stepdefinition;

import java.io.IOException;

import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  extends BaseClass{
	
	@Before
	public void beforeScenario() {
		launchBrowser();
		System.out.println("browser launched---------------");
	}
	
	@After
	public void afterScenario(Scenario s) throws IOException {
		 String name = s.getName();
		 System.out.println(name);
	takesnap(name);
	CloseBrowser(); 
	System.out.println("closed=======================");
	    
}
	@Before("@smoke")
	private void beforeSmokeScenario() {
System.out.println("before smoke  scenario...");
	}
	@After("@smoke")
	private void afterSmokeScenario() {
System.out.println("...afte smoke scenario	");
	}
	@Before("@sanity")
	private void beforeSanityScenario() {
System.out.println("before sanity  scenario...");
	}
	@After("@sanity")
	private void afterSanityScenario() {
System.out.println("...afte sanity scenario	");
	}
}
