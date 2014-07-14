package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testgit {

	
	@Test
	public void test123(){
		WebDriver driver=new FirefoxDriver();
		driver.quit();
	}
}
