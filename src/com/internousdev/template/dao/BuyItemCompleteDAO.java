package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class BuyItemCompleteDAO {


	/**
	 * 商品購入情報登録メソッド
	 *
	 * @param item_transaction_id
	 * @param user_master_id
	 * @param total_price
	 * @param total_count
	 * @param pay
	 * @throws SQLException
	 */
	public int insertUserBuyItemTransaction(String itemTransactionId, String totalPrice, String totalCount, String userMasterId, String pay) throws SQLException {
		int count=0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "insert into user_buy_item_transaction (item_transaction_id, total_price, total_count, user_master_id, pay, insert_date) VALUES(?, ?, ?, ?, ?, NOW())";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemTransactionId);
			ps.setString(2, totalPrice);
			ps.setString(3, totalCount);
			ps.setString(4, userMasterId);
			ps.setString(5, pay);
			count=ps.executeUpdate();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return count;
	}
}
