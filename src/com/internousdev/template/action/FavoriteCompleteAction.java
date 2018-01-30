package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FavoriteCompleteAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = -3559172736249589696L;
	public Map<String,Object> session;

	/**
	 * お気に入り情報登録完了メソッド
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