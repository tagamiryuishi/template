package com.internousdev.template.dao;
//
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class FavoriteCompleteDAO{

	private DBConnector dbConnector=new DBConnector();

	private Connection connection=dbConnector.getConnection();

	private DateUtil dateUtil=new DateUtil();

private String sql="INSERT INTO user_favorite_transaction(product_name,total_price,insert_date)VALUES(?,?,?)";

public void favorite(String productName,String totalPrice)throws SQLException{

	try{
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,productName);
		preparedStatement.setString(2,totalPrice);
		preparedStatement.setString(3, dateUtil.getDate());

		preparedStatement.execute();

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		connection.close();
	}
}

}
