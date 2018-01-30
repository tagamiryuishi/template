package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class ProductListCompleteAction extends ActionSupport{

	private static final long serialVersionUID = 7014436694781507271L;
	private String id;
	private String productName;
	private String productDescription;
	private String totalPrice;
	private String imageFilePath;
	private boolean check;

	public String execute(){
		String ret=ERROR;
		ret=SUCCESS;

		System.out.println(id);
		System.out.println(productName);
		System.out.println(productDescription);
		System.out.println(totalPrice);
		System.out.println(imageFilePath);
		System.out.println(check);

		return ret;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}


}