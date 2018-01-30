package com.internousdev.template.action;

import java.util.ArrayList;

import com.internousdev.template.dao.ProductListDAO;
import com.internousdev.template.dto.ProductListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductListAction extends ActionSupport {

	private static final long serialVersionUID = -8007906305380800423L;
	/**
	 * ���i�ꗗ���X�g
	 */
	private ArrayList<ProductListDTO> productListDTOList = new ArrayList<ProductListDTO>();




	public String execute() {
		String result = ERROR;
		// ���i���
		ProductListDAO productListDAO = new ProductListDAO();
		productListDTOList = productListDAO.selectAll();

		if(productListDTOList.size() > 0) {
			result = SUCCESS;

		} else {
			result = ERROR;
		}

		return result;
	}

	public ArrayList<ProductListDTO> getProductListDTOList() {
		return productListDTOList;
	}

	/**
	 * @param productListDTOL �Z�b�g����
	 */
	public void setProductListDTOList(ArrayList<ProductListDTO> productListDTOList) {
		this.productListDTOList = productListDTOList;
	}

}