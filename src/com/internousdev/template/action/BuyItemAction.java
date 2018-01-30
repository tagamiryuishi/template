
package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dto.CartDTO;
import com.internousdev.template.dto.ItemInfoTransactionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

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
	public Map<String, Object>  session;

	private List<CartDTO> cartList = new ArrayList<CartDTO>();

	private Collection<String> checkList;

	private List<ItemInfoTransactionDTO> itemInfoTransactionList=new ArrayList<ItemInfoTransactionDTO>();

	private String errorMessage;

	/**
	 * 商品情報取得メソッド
	 *
	 * @author internous
	 */
	public String execute() {
		String result = ERROR;
		System.out.println("------BuyItemAction");
		System.out.println(id);
		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(itemStock);
		System.out.println(count);
		System.out.println(pay);

		String[] idList=id.split(", ", 0);
		String[] itemNameList=itemName.split(", ",0);
		String[] itemPriceList=itemPrice.split(", ", 0);
		String[] itemStockList=itemStock.split(", ", 0);
		String[] countList=count.split(", ", 0);


		if(checkList==null){
			errorMessage="商品が選択されていません。";
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			itemInfoTransactionList = buyItemDAO.getItemInfoTransactionList();
			return ERROR;
		}
		for(String check : checkList){
			System.out.println(check);
		}

		for(String check : checkList){
			int checkedId=(Integer.parseInt(check))-1;
			CartDTO dto=new CartDTO();
			dto.setId(String.valueOf(idList[checkedId]));
			dto.setItemTransactionId(String.valueOf(idList[checkedId]));
			dto.setItemName(String.valueOf(itemNameList[checkedId]));
			int totalCount=Integer.parseInt(countList[checkedId]);
			int price=Integer.parseInt(itemPriceList[checkedId]);
			dto.setItemPrice(String.valueOf(price));
			dto.setItemStock(String.valueOf(itemStockList[checkedId]));
			dto.setCount(String.valueOf(countList[checkedId]));
			int total=price * totalCount;
			dto.setTotalPrice(String.valueOf(total));
			dto.setTotalCount(String.valueOf(countList[checkedId]));
			dto.setUserMasterId(userMasterId);
			dto.setPay(pay);

			System.out.println("---カート情報["+checkedId+"]---");
			System.out.println("ID               :"+dto.getId());
			System.out.println("ITEMTRANSACTIONID:"+dto.getItemTransactionId());
			System.out.println("ITEMNAME         :"+dto.getItemName());
			System.out.println("ITEMPRICE        :"+dto.getItemPrice());
			System.out.println("ITEMSTOCK        :"+dto.getItemStock());
			System.out.println("COUNT            :"+dto.getCount());
			System.out.println("TOTALPRICE       :"+dto.getTotalPrice());
			System.out.println("TOTALCOUNT       :"+dto.getTotalCount());
			System.out.println("USERMASTERID     :"+dto.getUserMasterId());
			System.out.println("PAY              :"+dto.getPay());
			System.out.println("------------------");
			cartList.add(dto);
		}


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
		result=SUCCESS;
		return result;
	}



	public List<ItemInfoTransactionDTO> getItemInfoTransactionList() {
		return itemInfoTransactionList;
	}



	public void setItemInfoTransactionList(List<ItemInfoTransactionDTO> itemInfoTransactionList) {
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

	public List<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(List<CartDTO> cartList) {
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
