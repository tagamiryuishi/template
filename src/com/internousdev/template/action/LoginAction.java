package com.internousdev.template.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemDAO;
import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.ItemInfoTransactionDTO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internous
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */
public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * ログインID
	 */
	private String loginUserId;

	/**
	 * ログインパスワード
	 */
	private String loginPassword;

	private String errorMessage;

	/**
	 * ログイン情報を格納
	 */
	private Map<String, Object> session;

	private List<ItemInfoTransactionDTO> itemInfoTransactionList = new ArrayList<ItemInfoTransactionDTO>();

	/**
	 * 実行メソッド
	 */
	public String execute() {
		String result = ERROR;
		LoginDAO dao = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();

		int count=dao.existsLoginUserInfo(loginUserId, loginPassword);
		if(count<=0){
			errorMessage="ログインに失敗しました。";
			return ERROR;
		}else{
			// ログイン実行
			loginDTO = dao.getLoginUserInfo(loginUserId, loginPassword);
//			session.put("loginUser", loginDTO);

			// ログインされていれば、LoginFlgはtrue
			if(loginDTO.getLoginFlg()){

//		// ログイン情報を比較
//			if(((LoginDTO) session.get("loginUser")).getLoginFlg()) {

				// ログインフラグがtrueならば、商品情報を取得する
				BuyItemDAO buyItemDAO = new BuyItemDAO();
				itemInfoTransactionList = buyItemDAO.getItemInfoTransactionList();

	//			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
	//			session.put("login_user_id", loginDTO.getLoginId());
	//			session.put("id", buyItemDTO.getId());
	//			session.put("buyItem_name", buyItemDTO.getItemName());
	//			session.put("buyItem_price", buyItemDTO.getItemPrice());
				result = SUCCESS;
				return result;
			}
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



	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<ItemInfoTransactionDTO> getItemInfoTransactionList() {
		return itemInfoTransactionList;
	}

	public void setItemInfoTransactionList(List<ItemInfoTransactionDTO> itemInfoTransactionList) {
		this.itemInfoTransactionList = itemInfoTransactionList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
