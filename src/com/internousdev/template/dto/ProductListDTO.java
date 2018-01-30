package com.internousdev.template.dto;

public class ProductListDTO {

	/**
	 * 商品ID
	 */
	private String id;

	/**
	 * 商品名
	 */
	private String productName;

	/**
	 * 商品詳細
	 */
	private String productDescription;

	/**
	 * 値段
	 */
	private int totalPrice;

	/**
	 * 画像ファイルのパス
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