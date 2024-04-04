package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.domain.Product;

public class ProductDAO {
	public static void main(String[] args) {
		
	}
	public List<Product> finaAll() {
		
		List<Product> products = new ArrayList<Product>();
		String sql = "SELECT * FROM products";
		
		try (Connection con = DbUtil.getConnection();
			 PreparedStatement stmt = con.prepareStatement(sql);
			 ResultSet rs = stmt.executeQuery();){
			
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getFloat("price"));
				product.setQuantity(rs.getInt("quantity"));
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return null;
		
		
	}
}

