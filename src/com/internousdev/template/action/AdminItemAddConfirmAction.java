package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class AdminItemAddConfirmAction extends ActionSupport{

	private static final long serialVersionUID = 7206194886200296827L;
	private String itemName;
	private String itemPrice;
	private String itemStock;
	private String errorMessage;

	public String execute(){
		System.out.println("AdminItemAddConfirmAction------------");
		return SUCCESS;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public String getItemPrice() {
		return itemPrice;
	}



	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}



	public String getItemStock() {
		return itemStock;
	}



	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}



	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}
