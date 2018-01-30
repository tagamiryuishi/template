package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.internousdev.template.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	private String id;
	private String itemTransactionId;
	private String itemName;
	private String itemPrice;
	private String totalCount;
	private String totalPrice;
	private String itemStock;
	/**
	 * アイテム購入個数
	 */
	private String count;
	private String loginUserId;
	private String userMasterId;

	/**
	 * 支払い方法
	 */
	private String pay;
	public Map<String,Object> session;


	/**
	 * 商品購入情報登録メソッド
	 *
	 * @author internous
	 */
	public String execute() throws SQLException {
		String result=ERROR;

		System.out.println("------BuyItemConfirmAction");
		System.out.println("ID               :"+id);
		System.out.println("ITEMTRANSACTIONID:"+itemTransactionId);
		System.out.println("ITEMNAME         :"+itemName);
		System.out.println("ITEMPRICE        :"+itemPrice);
		System.out.println("ITEMSTOCK        :"+itemStock);
		System.out.println("COUNT            :"+count);
		System.out.println("TOTALPRICE       :"+totalPrice);
		System.out.println("TOTALCOUNT       :"+totalCount);
		System.out.println("USERMASTERID     :"+userMasterId);
		System.out.println("PAY              :"+pay);

		String[] idList=id.split(", ", 0);
		String[] itemTransactionIdList=itemTransactionId.split(", ", 0);
//		String[] itemNameList=itemName.split(", ",0);
//		String[] itemPriceList=itemPrice.split(", ", 0);
//		String[] itemStockList=itemStock.split(", ", 0);
//		String[] countList=count.split(", ", 0);
		String[] totalPriceList=totalPrice.split(", ", 0);
		String[] totalCountList=totalCount.split(", ", 0);
		String[] userMasterIdList=userMasterId.split(", ", 0);

		int c=0;
		BuyItemCompleteDAO dao = new BuyItemCompleteDAO();
		for(int i=0; i<idList.length;i++){
			String val1=String.valueOf(itemTransactionIdList[i]);
			String val2=String.valueOf(totalCountList[i]);
			String val3=String.valueOf(totalPriceList[i]);
			String val4=String.valueOf(userMasterIdList[i]);
			String val5=pay;
			c+=dao.insertUserBuyItemTransaction(val1,val2,val3,val4,val5);
		}
		System.out.println(c+"件、商品購入履歴テーブルに追加されました。");
		if(c>0){
			result=SUCCESS;
		}else{
			result=ERROR;
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