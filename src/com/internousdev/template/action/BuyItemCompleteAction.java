package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemCompleteAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = -8314276024685310415L;
	private String id;
	private String itemTransactionId;
	private String itemName;
	private String itemPrice;
	private String totalCount;
	private String totalPrice;
	private String itemStock;
	private Collection<String> checkList;
	/**
	 * ÉAÉCÉeÉÄçwì¸å¬êî
	 */
	private String count;
	private String loginUserId;
	private String userMasterId;
	private String errorMessage;

	/**
	 * éxï•Ç¢ï˚ñ@
	 */
	private String pay;
	public Map<String,Object> session;

	/**
	 * è§ïiçwì¸èÓïÒìoò^äÆóπÉÅÉ\ÉbÉh
	 *
	 * @author RYUICHI TAGAMI
	 */
	public String execute() {

		String result = SUCCESS;
		System.out.println("BuyItemCompleteAction-----------");

			userMasterId=String.valueOf((userMasterId.split(", ", 0))[0]);
			loginUserId=userMasterId;

		System.out.println(userMasterId);
		System.out.println(loginUserId);
		System.out.println("--------------------------------");

		BuyItemCompleteDAO dao = new BuyItemCompleteDAO();
		try {
			int c = dao.insertUserBuyItemTransaction(itemTransactionId, totalPrice, totalCount, userMasterId, pay);
			if(c>0){
				result=SUCCESS;
			}else{
				result=ERROR;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemTransactionId() {
		return itemTransactionId;
	}

	public void setItemTransactionId(String itemTransactionId) {
		this.itemTransactionId = itemTransactionId;
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

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getUserMasterId() {
		return userMasterId;
	}

	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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