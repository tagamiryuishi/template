package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 6438949214620879001L;

	/**
	 * ���O�C�������i�[
	 */
	public Map<String, Object> session;

	private String loginUserId;

	private String userMasterId;

	 // �폜�t���O
	String deleteFlg;

	private String message;

//	 // �}�C�y�[�W���i�[DTO
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	/**
	 * ���i�����擾���\�b�h
	 *
	 * @author RYUICHI TAGAMI
	 */
	public String execute() throws SQLException {
		String result=ERROR;

		if(loginUserId!=null){
			userMasterId = loginUserId;
		}else{
			userMasterId=String.valueOf((userMasterId.split(", ", 0))[0]);
		}
		System.out.println("------MyPageAction");
		System.out.println("USERMASTERID:"+userMasterId);
		System.out.println("------------------");
//		// �}�C�y�[�W���擾DAO
		MyPageDAO myPageDAO = new MyPageDAO();
		if(userMasterId==null){
			message="���O�C�����Ă��܂���B";
			return ERROR;
		}
//		if (!session.containsKey("id")) {
//			return ERROR;
//		}
//
//		// ���i�������폜���Ȃ��ꍇ
		if(deleteFlg == null) {
			myPageList = myPageDAO.getMyPageList(userMasterId);
//
//			Iterator<MyPageDTO> iterator = myPageList.iterator();
//			if (!(iterator.hasNext())) {
//				myPageList = null;
//			}
//		// ���i�������폜����ꍇ
		} else if(deleteFlg.equals("1")) {
			delete();
		}

		result = SUCCESS;
		return result;
	}

	/**
	 * ���i�����폜
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
//		// �}�C�y�[�W���擾DAO
		MyPageDAO myPageDAO = new MyPageDAO();
		if(userMasterId==null){
			message="���O�C�����Ă��܂���B";
			return ERROR;
		}
		int res = myPageDAO.deleteMyPageList(userMasterId);

		if(res > 0) {
			myPageList = null;
			message="���i���𐳂����폜���܂����B";
			result=SUCCESS;
		} else if(res == 0) {
			message="���i���̍폜�Ɏ��s���܂����B";
			result=ERROR;
		}
		return result;
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