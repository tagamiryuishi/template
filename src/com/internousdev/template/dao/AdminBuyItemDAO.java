
package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.template.dto.AdminItemInfoTransactionDTO;
import com.internousdev.template.util.DBConnector;

public class AdminBuyItemDAO{


	/**
	 * 商品情報取得メソッド
	 */
	public AdminItemInfoTransactionDTO getBuyItemInfo(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		AdminItemInfoTransactionDTO itemInfoTransactionDTO= new AdminItemInfoTransactionDTO();
		String sql="SELECT id, item_name, item_price FROM item_info_transaction";

	try{
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();

		if(resultSet.next()){
			itemInfoTransactionDTO.setId(resultSet.getInt("id"));
			itemInfoTransactionDTO.setItemName(resultSet.getString("item_name"));
			itemInfoTransactionDTO.setItemPrice(resultSet.getString("item_price"));
		}

	}catch(Exception e){
		e.printStackTrace();
	}

	return itemInfoTransactionDTO;
}
	public List<AdminItemInfoTransactionDTO> getItemInfoTransactionList(){
		List<AdminItemInfoTransactionDTO>itemInfoTransactionList =new ArrayList<AdminItemInfoTransactionDTO>();

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT * FROM item_info_transaction";
		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();


		while(rs.next()){
			AdminItemInfoTransactionDTO dto=new AdminItemInfoTransactionDTO();
			dto.setId(rs.getInt("id"));
			dto.setItemName(rs.getString("item_name"));
			dto.setItemPrice(rs.getString("item_price"));
			dto.setItemStock(rs.getString("item_stock"));
			dto.setInsertDate(rs.getString("insert_date"));
			dto.setUpdateDate(rs.getString("update_date"));
			itemInfoTransactionList.add(dto);
		}
		}catch(Exception e){
		e.printStackTrace();
		}
		return itemInfoTransactionList;
	}
}
