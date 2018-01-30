package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;

	private String loginPassword;

	private String userName;

	public Map<String,Object> session;

	public String errorMessage;

	/**
	 * ユーザー情報登録処理
	 */
	public String execute() throws SQLException {
		UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
		boolean isUserExists=userCreateCompleteDAO.isUserExists(session.get("loginUserId").toString());
		System.out.println("ユーザー存在チェック："+ isUserExists);
		if(!isUserExists){
			System.out.println("ユーザー存在チェック：存在していない");
			userCreateCompleteDAO.cerateUser(session.get("loginUserId").toString(),
			session.get("loginPassword").toString(),
			session.get("userName").toString());
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


}
