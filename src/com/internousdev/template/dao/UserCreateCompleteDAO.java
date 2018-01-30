package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class UserCreateCompleteDAO {



	public void cerateUser(String loginUserId,String userName, String loginUserPassword) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		DateUtil dateUtil = new DateUtil();

		String sql = "INSERT INTO login_user_transaction (login_id, login_pass, user_name, insert_date) VALUES(?, ? ,?, ?)";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, dateUtil.getDate());

			preparedStatement.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

	public boolean isUserExists(String loginUserId) {
		boolean result=false;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT count(login_id) as count FROM login_user_transaction where login_id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);

			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				if((rs.getInt("count")) > 0){
					result=true;
				}else{
					result=false;
				}
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}



}