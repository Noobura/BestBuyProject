package com.bb.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.bb.base.Page;

public class SignInPage extends Page {
    public MyAccountPage getSignIn() {
    	type("user_ID","amirsamkavin@gmail.com");
    	type("password_ID","Sameera*1");
    	click("signIn_btn_XPATH");
    	return new MyAccountPage();
		
	}
	public AccountPage gotoNewAccount() {
		System.out.println("Inside SignInPage");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click("newAccount_XPATH");
		return new AccountPage();
		
	}
	public ForgotPasswordPage clickForgotPassword() {
		click("forgotPW_XPATH");
		return new ForgotPasswordPage();
	}

}
