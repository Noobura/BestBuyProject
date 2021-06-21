package com.bb.pages;


import java.util.Hashtable;
import com.bb.base.Page;

public class AccountPage extends Page{
	
	public void setAccountInfo(Hashtable data) {
		// Set Firstname, Lastname, email, Password 
		 type("firstName_ID", (data.get("firstname")).toString());
	     type("lastName_ID",(data.get("lastname")).toString());
		 type("email_ID",(data.get("email")).toString());
		 type("password_ID",(data.get("password")).toString());
		 click("newletter_Checkbx_XPATH");
		 		
	}
	public MyAccountPage createNewAccount(Hashtable data) {
		System.out.println("Inside AccountPage");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setAccountInfo(data);
		
		click("creatAcctBtn_XPATH");
		System.out.println("AccountCreated");
		return  new MyAccountPage();
	}
	public SignInPage signIn() {
		click("signInLink_XPATH");
		return new SignInPage();
	}

}
