package com.bb.testcases;


import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bb.base.Page;
import com.bb.pages.AccountPage;
import com.bb.pages.CountryPage;
import com.bb.pages.HomePage;
import com.bb.pages.SignInPage;
import com.bb.utilities.Utilities;

public class CreateAccountTest extends Page {
	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		
		CountryPage cp = new CountryPage();
		HomePage hp = cp.selectCountry();		
		SignInPage sp = hp.goToAccount();
		AccountPage accountPage = sp.gotoNewAccount();
		accountPage.createNewAccount(data);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(isElementPresent(By.partialLinkText("Hi,")));
		
		
	}

}