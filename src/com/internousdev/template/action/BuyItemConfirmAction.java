package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dto.ItemInfoTransactionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = -7787951498734562406L;
	private String id;
	private String itemTransactionId;
	private String itemName;
	private String itemPrice;
	private String totalCount;
	private String totalPrice;
	private String itemStock;
	private Collection<String> checkList;
	/**
	 * アイテム購入個数
	 */
	private String count;
	private String loginUserId;
	private String userMasterId;
	private String errorMessage;

	/**
	 * 支払い方法
	 */
	private String pay;
	public Map<String,Object> session;

//	private List<ItemInfoTransactionDTO> itemInfoTransactionList=new ArrayList<ItemInfoTransactionDTO>();
	private List<ItemInfoTransactionDTO> itemInfoTransactionList=new ArrayList<ItemInfoTransactionDTO>();

	/**
	 * 商品購入情報登録メソッド
	 *
	 * @author RYUICHI TAGAMI
	 */
	public String execute() throws SQLException {
		String result = ERROR;
		System.out.println("------BuyItemConfirmAction");


			System.out.println(id);
			System.out.println(itemName);
			System.out.println(itemPrice);
			System.out.println(itemStock);
			System.out.println(count);
			System.out.println(pay);
			System.out.println(loginUserId);
			System.out.println(userMasterId);


			String[] idList=id.split(", ", 0);
			String[] itemNameList=itemName.split(", ",0);
			String[] itemPriceList=itemPrice.split(", ", 0);
			String[] itemStockList=itemStock.split(", ", 0);
			String[] countList=count.split(", ", 0);


			if(checkList==null){
				errorMessage="商品が選択されていません。";
				BuyItemDAO dao = new BuyItemDAO();
				itemInfoTransactionList = dao.getItemInfoTransactionList();
				return ERROR;
			}
			for(String check : checkList){
				System.out.println(check);
			}


			for(int i=0;i<idList.length;i++){

				for(String check : checkList){
					int checkedId=(Integer.parseInt(check))-1;
					ItemInfoTransactionDTO dto=new ItemInfoTransactionDTO();
					dto.setId(String.valueOf(idList[i]));
					dto.setItemTransactionId(String.valueOf(idList[i]));
					dto.setItemName(String.valueOf(itemNameList[i]));
					int totalCount=Integer.parseInt(countList[i]);
					int price=Integer.parseInt(itemPriceList[i]);
					dto.setItemPrice(String.valueOf(price));
					dto.setItemStock(String.valueOf(itemStockList[i]));
					dto.setCount(String.valueOf(countList[i]));
					int total=price * totalCount;
					dto.setTotalPrice(String.valueOf(total));
					dto.setTotalCount(String.valueOf(countList[i]));
					dto.setUserMasterId(userMasterId);
					dto.setPay(pay);

					System.out.println("---カート情報["+i+"]---");
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
					itemInfoTransactionList.add(dto);
				}
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<ItemInfoTransactionDTO> getItemInfoTransactionList() {
		return itemInfoTransactionList;
	}

	public void setItemInfoTransactionList(List<ItemInfoTransactionDTO> itemInfoTransactionList) {
		this.itemInfoTransactionList = itemInfoTransactionList;
	}



}