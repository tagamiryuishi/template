package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	/**
	 * ログイン情報を格納
	 */
	public Map<String, Object> session;

	private String userMasterId;

	 // 削除フラグ
	String deleteFlg;

	private String message;

//	 // マイページ情報格納DTO
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	/**
	 * 商品履歴取得メソッド
	 *
	 * @author internous
	 */
	public String execute() throws SQLException {
		String result=ERROR;
		userMasterId=String.valueOf((userMasterId.split(", ", 0))[0]);
		System.out.println("------MyPageAction");
		System.out.println("USERMASTERID:"+userMasterId);
		System.out.println("------------------");
//		// マイページ情報取得DAO
		MyPageDAO myPageDAO = new MyPageDAO();
		if(userMasterId==null){
			message="ログインしていません。";
			return ERROR;
		}
//		if (!session.containsKey("id")) {
//			return ERROR;
//		}
//
//		// 商品履歴を削除しない場合
		if(deleteFlg == null) {
			myPageList = myPageDAO.getMyPageList(userMasterId);
//
//			Iterator<MyPageDTO> iterator = myPageList.iterator();
//			if (!(iterator.hasNext())) {
//				myPageList = null;
//			}
//		// 商品履歴を削除する場合
		} else if(deleteFlg.equals("1")) {
			delete();
		}

		result = SUCCESS;
		return result;
	}

	/**
	 * 商品履歴削除
	 *
	 * @throws SQLException
	 */
	public String delete() throws SQLException {
		String result=ERROR;
		userMasterId=String.valueOf((userMasterId.split(", ", 0))[0]);
		System.out.println("------MyPageAction");
		System.out.println("USERMASTERID:"+userMasterId);
		System.out.println("------------------");
//		String item_transaction_id = session.get("id").toString();
//		String user_master_id = session.get("login_user_id").toString();
//		// マイページ情報取得DAO
		MyPageDAO myPageDAO = new MyPageDAO();
		if(userMasterId==null){
			message="ログインしていません。";
			return ERROR;
		}
		int res = myPageDAO.deleteMyPageList(userMasterId);

		if(res > 0) {
			myPageList = null;
			message="商品情報を正しく削除しました。";
			result=SUCCESS;
		} else if(res == 0) {
			message="商品情報の削除に失敗しました。";
			result=ERROR;
		}
		return result;
	}



	public String getUserMasterId() {
		return userMasterId;
	}

	public ArrayList<MyPageDTO> getMyPageList() {
		return myPageList;
	}

	public void setMyPageList(ArrayList<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}

	public void setUserMasterId(String userMasterId) {
		this.userMasterId = userMasterId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
