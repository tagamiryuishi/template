package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.AdminLoginDTO;
import com.internousdev.template.util.DBConnector;

public class AdminLoginDAO {

	public int existsAdminLoginUserInfo(String loginUserId,String loginPassword){
		int count=0;
		DBConnector db =new DBConnector();
		Connection con =db.getConnection();
		String sql="SELECT count(login_id) as count FROM admin_login_user_transaction where login_id=? AND login_pass=?";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1,loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				count=rs.getInt("count");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return count;
	}
public AdminLoginDTO getAdminLoginUserInfo(String loginUserId, String loginPassword){

	DBConnector db = new DBConnector();
	Connection con=db.getConnection();
	AdminLoginDTO adminLoginDTO = new AdminLoginDTO();
	String sql="SELECT * FROM admin_login_user_transaction where login_id=? AND login_pass=?";

	try{
		PreparedStatement preparedStatement=con.prepareStatement(sql);
		preparedStatement.setString(1,loginUserId );
		preparedStatement.setString(2, loginPassword);

		ResultSet resultSet = preparedStatement.executeQuery();

		if(resultSet.next()){
			adminLoginDTO.setLoginId(resultSet.getString("login_id"));
			adminLoginDTO.setLoginPassword(resultSet.getString("login_pass"));
			adminLoginDTO.setUserName(resultSet.getString("user_name"));

			if(!(resultSet.getString("login_id").equals(null))){
				adminLoginDTO.setLoginFlg(true);
			}
		}

	}catch(Exception e){
		e.printStackTrace();
	}

	return adminLoginDTO;
			}
		}
