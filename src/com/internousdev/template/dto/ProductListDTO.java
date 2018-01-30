package com.internousdev.template.dto;

public class ProductListDTO {

	/**
	 * ���iID
	 */
	private String id;

	/**
	 * ���i��
	 */
	private String productName;

	/**
	 * ���i�ڍ�
	 */
	private String productDescription;

	/**
	 * �l�i
	 */
	private int totalPrice;

	/**
	 * �摜�t�@�C���̃p�X
	 */
	private String imageFilePath;



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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

}