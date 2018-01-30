package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.ItemInfoTransactionDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {

	/**
	 * 商品情報取得メソッド
	 *
	 * @return BuyItemDTO
	 */
	public ItemInfoTransactionDTO getBuyItemInfo() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ItemInfoTransactionDTO itemInfoTransactionDTO = new ItemInfoTransactionDTO();
		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				itemInfoTransactionDTO.setId(resultSet.getString("id"));
				itemInfoTransactionDTO.setItemName(resultSet.getString("item_name"));
				itemInfoTransactionDTO.setItemPrice(resultSet.getString("item_price"));
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return itemInfoTransactionDTO;
	}

	public List<ItemInfoTransactionDTO> getItemInfoTransactionList() {
		List<ItemInfoTransactionDTO> itemInfoTransactionList = new ArrayList<ItemInfoTransactionDTO>();

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT * FROM item_info_transaction";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ItemInfoTransactionDTO dto=new ItemInfoTransactionDTO();
				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getString("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdateDate(rs.getString("update_date"));
				itemInfoTransactionList.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return itemInfoTransactionList;
	}

	public List<ItemInfoTransactionDTO> getItemInfoTransactionListByCategory(String category) {
		List<ItemInfoTransactionDTO> itemInfoTransactionList = new ArrayList<ItemInfoTransactionDTO>();

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT * FROM item_info_transaction where category=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ItemInfoTransactionDTO dto=new ItemInfoTransactionDTO();
				dto.setId(rs.getString("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getString("item_stock"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdateDate(rs.getString("update_date"));
				itemInfoTransactionList.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return itemInfoTransactionList;
	}
}