package com.bb.testcases;



import org.testng.annotations.AfterSuite;

import com.bb.base.Page;

public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		Page.quit();
		
	}

}