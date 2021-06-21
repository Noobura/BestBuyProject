package com.bb.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bb.base.Page;
import com.bb.pages.CountryPage;
import com.bb.pages.HomePage;
import com.bb.pages.SignInPage;

public class SignIntest extends Page {
	@Test
	public void SignInTest() {
		CountryPage cp = new CountryPage();
		HomePage hp = cp.selectCountry();		
		SignInPage sp = hp.goToAccount();
		sp.getSignIn();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(isElementPresent(By.partialLinkText("Hi,")));
	}
}
