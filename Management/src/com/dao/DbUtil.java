package com.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class DbUtil {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/products?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "0000";
	
	// 데이터베이스 연결 과정 추상화
	public static Connection getConnection() {
		try {
			//JDBC 드라이버를 메모리에 로드
			Class.forName(DRIVER); 
			// 데이터베이스 연결 설정
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			throw new RuntimeException("DB Connection fail", e);
		}
	}
}