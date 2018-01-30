package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class GoAdminItemAddAction extends ActionSupport{

	private static final long serialVersionUID = 5349218167057331307L;

	public String execute(){
		System.out.println("GoAdminItemAddAction--------");
		String result=ERROR;;
		result=SUCCESS;
		return result;
}
}
