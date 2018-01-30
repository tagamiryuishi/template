package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dao.AdminLoginDAO;
import com.internousdev.template.dto.ItemInfoTransactionDTO;
import com.internousdev.template.dto.AdminLoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = -2557817529693712245L;

private String loginUserId;

private String loginPassword;

private String errorMessage;

private Map<String,Object> session;

private List<ItemInfoTransactionDTO> itemInfoTransactionList = new ArrayList<ItemInfoTransactionDTO>();


public String execute(){
	String result=ERROR;
	AdminLoginDAO dao=new AdminLoginDAO();
	AdminLoginDTO adminLoginDTO=new AdminLoginDTO();

	int count=dao.existsAdminLoginUserInfo(loginUserId,loginPassword);
	if(count<=0){
		errorMessage="ログインに失敗しました";
		System.out.println("ERROR");
		return ERROR;
	}else{
		//ログイン実行
		adminLoginDTO=dao.getAdminLoginUserInfo(loginUserId, loginPassword);

		if(adminLoginDTO.getLoginFlg()){

		BuyItemDAO buyItemDAO = new BuyItemDAO();
		itemInfoTransactionList=buyItemDAO.getItemInfoTransactionList();
		System.out.println("SUCCESS");
		result=SUCCESS;
		return result;
		}
	}
	return result;
}

public String getLoginUserId(){
	return loginUserId;
}
public void setLoginUserId(String loginUserId){
	this.loginUserId=loginUserId;
}

public String getLoginPassword(){
	return loginPassword;
}
public void setLoginPassword(String loginPassword){
	this.loginPassword=loginPassword;
}

public String getErrorMessage(){
	return errorMessage;
}
public void setErrorMessage(String errorMessage){
	this.errorMessage=errorMessage;
}

public List<ItemInfoTransactionDTO> getItemInfoTransactionList(){
	return itemInfoTransactionList;
}
public void setItemInfoTransactionList(List<ItemInfoTransactionDTO> itemInfoTransactionList){
	this.itemInfoTransactionList=itemInfoTransactionList;
}

public Map<String,Object>getSession(){
	return session;
}

@Override
public void setSession(Map<String,Object>session){
	this.session=session;

}
}