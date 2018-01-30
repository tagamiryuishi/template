package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;

public class AdminItemAddDAO {

	public int insertItemInfoTransaction(String itemName, String itemPrice, String itemStock) {
		int count=0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "insert into item_info_transaction (item_name, item_price, item_stock, insert_date) VALUES(?, ?, ?, NOW())";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setString(2, itemPrice);
			ps.setString(3, itemStock);
			count=ps.executeUpdate();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

}
