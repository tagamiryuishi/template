package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = -6886328457029464184L;

	private String loginUserId;

	private String loginPassword;

	private String userName;

	public Map<String,Object> session;

	public String errorMessage;

	/**
	 * ユーザー情報登録処理
	 */
	public String execute() throws SQLException {

		System.out.println("ID   :"+loginUserId);
		System.out.println("NAME :"+userName);
		System.out.println("PASS :"+loginPassword);

		UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
		boolean isUserExists=userCreateCompleteDAO.isUserExists(loginUserId);

//		boolean isUserExists=userCreateCompleteDAO.isUserExists(session.get("loginUserId").toString());
		System.out.println("ユーザー存在チェック："+ isUserExists);
		if(!isUserExists){
			System.out.println("ユーザー存在チェック：存在していない");
			System.out.println("ID   :"+loginUserId);
			System.out.println("NAME :"+userName);
			System.out.println("PASS :"+loginPassword);
			userCreateCompleteDAO.cerateUser(loginUserId,userName,loginPassword);
			return SUCCESS;
		}else{
			System.out.println("ユーザー存在チェック：存在している");
			errorMessage="すでに登録されています";
			System.out.println(errorMessage);
			return ERROR;
		}
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}




}