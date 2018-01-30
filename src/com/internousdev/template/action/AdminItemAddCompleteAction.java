package com.internousdev.template.action;

import com.internousdev.template.dao.AdminItemAddDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminItemAddCompleteAction extends ActionSupport{

	private static final long serialVersionUID = 7206194886200296827L;
	private String itemName;
	private String itemPrice;
	private String itemStock;
	private String errorMessage;

	public String execute(){
		System.out.println("AdminItemAddCompleteAction------------");
		String result=ERROR;

		AdminItemAddDAO dao=new AdminItemAddDAO();
		int count = dao.insertItemInfoTransaction(itemName,itemPrice,itemStock);
		if(count > 0){
			result=SUCCESS;
			System.out.println("è§ïiìoò^äÆóπ------------------");
		}else{
			result=ERROR;
			System.out.println("è§ïiìoò^é∏îs------------------");
		}
		return result;
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
