package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author RYUICHI TAGAMI
 *
 */
public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 4636980259732163580L;

	private String loginUserId;

	private String loginPassword;

	private String userName;

	public Map<String,Object> session;

	private String result;

	private String errorMessage;

	/**
	 * ���͏��i�[����
	 */
	public String execute() {

		result = SUCCESS;

		if(!(loginUserId.equals("")) && !(loginPassword.equals("")) && !(userName.equals(""))) {
//			session.put("loginUserId", loginUserId);
//			session.put("loginPassword", loginPassword);
//			session.put("userName", userName);
			System.out.println("���[�U�[�o�^---->���̓`�F�b�NOK");
		} else {
			System.out.println("���[�U�[�o�^---->���̓`�F�b�NNG");
			setErrorMessage("�����͂̍��ڂ�����܂��B");
			result = ERROR;
		}

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
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