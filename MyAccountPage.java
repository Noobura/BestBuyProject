package com.bb.pages;

import com.bb.base.Page;

public class MyAccountPage extends Page{
	
	public void viewOrderHistory() {
		click("orderHistoryFS_XPATH");		
	}
	
	public void addPaymentMethod() {
		click("paymentMethodFS_XPATH");
	}
	
	public void addShippingAddress() {
		click("shippingAddressFS_XPATH");
	}
	public void addPersonalDetail() {
		click("personalDetailFS_XPATH");
	}

}
