package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.internousdev.template.dto.ProductListConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductListConfirmAction extends ActionSupport {

	private static final long serialVersionUID = 1687915451184173510L;
	private String id;
	private String productName;
	private String productDescription;
	private String totalPrice;
	private String imageFilePath;
	private Collection<String> checkList;

	private List<ProductListConfirmDTO> productListConfirmList = new ArrayList<ProductListConfirmDTO>();

	public String execute(){
		String ret=ERROR;
		System.out.println(id);
		System.out.println(productName);
		System.out.println(productDescription);
		System.out.println(totalPrice);
		System.out.println(imageFilePath);
		System.out.println(checkList);

		String[] idList = id.split(",", 0);
		String[] productNameList = productName.split(",",0);
		String[] productDescriptionList = productDescription.split(",",0);
		String[] totalPriceList = totalPrice.split(",",0);
		String[] imageFilePathList = imageFilePath.split(",",0);

		for(int i=0; i<idList.length;i++){
			ProductListConfirmDTO dto = new ProductListConfirmDTO();
			productListConfirmList.add(dto);
			productListConfirmList.get(i).setId(idList[i].toString());
			productListConfirmList.get(i).setProductName(productNameList[i].toString());
			productListConfirmList.get(i).setProductDescription(productDescriptionList[i].toString());
			productListConfirmList.get(i).setTotalPrice(totalPriceList[i].toString());
			productListConfirmList.get(i).setImageFilePath(imageFilePathList[i].toString());
			productListConfirmList.get(i).setCheck(false);

		}

		for(String check:checkList){
			int checkId = Integer.parseInt(check);
			productListConfirmList.get(checkId-1).setCheck(true);
		}

		for(int i=0;i<productDescriptionList.length;i++){
			System.out.println("------------------- ¤•iƒŠƒXƒg["+i+"]");
			System.out.println(productListConfirmList.get(i).getId());
			System.out.println(productListConfirmList.get(i).getProductName());
			System.out.println(productListConfirmList.get(i).getProductDescription());
			System.out.println(productListConfirmList.get(i).getTotalPrice());
			System.out.println(productListConfirmList.get(i).getImageFilePath());
			System.out.println(productListConfirmList.get(i).isCheck());
		}


		ret=SUCCESS;
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

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public List<ProductListConfirmDTO> getProductListConfirmList() {
		return productListConfirmList;
	}

	public void setProductListConfirmList(List<ProductListConfirmDTO> productListConfirmList) {
		this.productListConfirmList = productListConfirmList;
	}



}