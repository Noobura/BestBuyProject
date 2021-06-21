package com.bb.pages;
import com.bb.base.Page;

public class CountryPage extends Page{
	
	
	public HomePage selectCountry() {
		
		click("country_XPATH");
		return new HomePage();
	}

}
