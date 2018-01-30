
package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.AdminBuyItemDAO;
import com.internousdev.template.dto.AdminCartDTO;
import com.internousdev.template.dto.AdminItemInfoTransactionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminHomeAction extends ActionSupport implements SessionAware{

	private String id;
	private String itemName;
	private String itemPrice;
	private String itemStock;

	private String loginUserId;
	private String userMasterId;
	/**
	 * アイテム購入個数
	 */
	private String count;

	/**
	 * 支払い方法
	 */
	private String pay;

	/**
	 * アイテム情報を格納
	 */
	public Map<String,Object> session;

	private List<AdminCartDTO> cartList=new ArrayList<AdminCartDTO>();

	private Collection<String>checkList;

	private List<AdminItemInfoTransactionDTO> itemInfoTransactionList=new ArrayList<AdminItemInfoTransactionDTO>();

	private String errorMessage;

	/**
	 * 商品情報取得メソッド
	 *
	 *
	 */
	public String execute(){
		String result=SUCCESS;

			AdminBuyItemDAO adminbuyItemDAO = new AdminBuyItemDAO();
			itemInfoTransactionList = adminbuyItemDAO.getItemInfoTransactionList();
			return SUCCESS;



//		session.put("total_price", intCount * intPrice);
//		String payment;
//
//		if(pay.equals("1")) {
//
//			payment = "現金払い";
//			session.put("pay", payment);
//		} else {
//
//			payment = "クレジットカード";
//			session.put("pay", payment);
//		}

	}



	public List<AdminItemInfoTransactionDTO> getItemInfoTransactionList() {
		return itemInfoTransactionList;
	}



	public void setItemInfoTransactionList(List<AdminItemInfoTransactionDTO> itemInfoTransactionList) {
		this.itemInfoTransactionList = itemInfoTransactionList;
	}



	public String getErrorMessage() {
		return errorMessage;
	}



	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	public Collection<String> getCheckList() {
		return checkList;
	}



	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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



	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public List<AdminCartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(List<AdminCartDTO> cartList) {
		this.cartList = cartList;
	}

	public String getUserMasterId() {
		return userMasterId;
	}

	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	}

