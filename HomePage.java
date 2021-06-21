package com.bb.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.bb.base.Page;

public class HomePage extends Page {
	
		public SignInPage goToAccount(){
			System.out.println("Inside HomePage");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			click("account_XPATH");
			
			return new SignInPage();
		}
		
	}


