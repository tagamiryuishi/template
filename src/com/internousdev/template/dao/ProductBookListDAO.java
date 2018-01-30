package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.ProductListDTO;
import com.internousdev.template.util.DBConnector;

public class ProductBookListDAO {

	public ArrayList<ProductListDTO> productList = new ArrayList<ProductListDTO>();

	/**
	 * Product_ListDTOの中身を全て取得
	 * @return productListDTOList
	 */
	public ArrayList<ProductListDTO> selectAll() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM product_List";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ProductListDTO dto = new ProductListDTO();
				dto.setId(rs.getString("id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setTotalPrice(rs.getInt("total_price"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				productList.add(dto);

			}

		} catch(SQLException e) {
			e.printStackTrace();

		}

		try {
			con.close();

		} catch(SQLException e) {
			e.printStackTrace();

		}

		return productList;
	}
	}