package com.bb.pages;

import org.testng.Assert;

import com.bb.base.Page;

public class ForgotPasswordPage extends Page{
	
	public void forgotPassword() {
		type("Email_ID","nfdfhgfam@gmail.com");
		click("sendLink_XPATH");
		Assert.assertEquals(driver.getTitle(), "Please check your email.");
	}

}
