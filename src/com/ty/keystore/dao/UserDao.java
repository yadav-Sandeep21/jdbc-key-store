package com.ty.keystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.keystore.dto.User;
import com.ty.keystore.util.ConnectionObject;

public class UserDao {
	public int saveUser(User user) {
		String query="Insert into user values(?,?,?,?)";
		Connection connection=ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, user.getUid());
			preparedStatement.setString(2, user.getUser_name());
			preparedStatement.setString(3,user.getEmail());
			preparedStatement.setString(4,user.getPassword());
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return 0;
	}
}
