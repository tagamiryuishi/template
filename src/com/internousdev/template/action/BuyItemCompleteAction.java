package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemCompleteAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = -8314276024685310415L;
	public Map<String,Object> session;

	/**
	 * ���i�w�����o�^�������\�b�h
	 *
	 * @author RYUICHI TAGAMI
	 */
	public String execute() {

		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}