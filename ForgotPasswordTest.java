package com.bb.testcases;

import org.testng.annotations.Test;

import com.bb.base.Page;
import com.bb.pages.CountryPage;
import com.bb.pages.ForgotPasswordPage;
import com.bb.pages.HomePage;
import com.bb.pages.SignInPage;

public class ForgotPasswordTest extends Page {
	@Test
	public void forgotPasswordTest() {
	CountryPage cp = new CountryPage();
	HomePage hp = cp.selectCountry();		
	SignInPage sp = hp.goToAccount();
	ForgotPasswordPage fp =sp.clickForgotPassword();
	fp.forgotPassword();
	}

}
