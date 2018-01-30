package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dto.ItemInfoTransactionDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoHomeAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -3709671532362794301L;
	/**
	 * ���O�C��ID
	 */
	private String loginUserId;

	/**
	 * ���O�C���p�X���[�h
	 */
	private String loginPassword;

	private String errorMessage;

	/**
	 * ���O�C�������i�[
	 */
	private Map<String, Object> session;

	private List<ItemInfoTransactionDTO> itemInfoTransactionList = new ArrayList<ItemInfoTransactionDTO>();

	public String execute() {
		String result = ERROR;
		System.out.println("GoHomeAction----------");
		System.out.println(loginUserId);
		System.out.println(loginPassword);
		System.out.println("----------------------");
//
//		LoginDAO dao = new LoginDAO();
//		LoginDTO loginDTO = new LoginDTO();
//
//		int count=dao.existsLoginUserInfo(loginUserId, loginPassword);
//		if(count<=0){
//			errorMessage="���O�C���Ɏ��s���܂����B";
//			return ERROR;
//		}else{
//			// ���O�C�����s
//			loginDTO = dao.getLoginUserInfo(loginUserId, loginPassword);
////			session.put("loginUser", loginDTO);
//
//			// ���O�C������Ă���΁ALoginFlg��true
//			if(loginDTO.getLoginFlg()){

//		// ���O�C�������r
//			if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {

				// ���O�C���t���O��true�Ȃ�΁A���i�����擾����
				BuyItemDAO buyItemDAO = new BuyItemDAO();
				itemInfoTransactionList = buyItemDAO.getItemInfoTransactionList();

	//			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
	//			session.put("login_user_id", loginDTO.getLoginId());
	//			session.put("id", buyItemDTO.getId());
	//			session.put("buyItem_name", buyItemDTO.getItemName());
	//			session.put("buyItem_price", buyItemDTO.getItemPrice());
				result = SUCCESS;
//				return result;
//			}
//		}
		return result;

	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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