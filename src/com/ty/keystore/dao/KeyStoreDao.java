package com.ty.keystore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.keystore.dto.KeyStore;
import com.ty.keystore.util.ConnectionObject;

public class KeyStoreDao {
	public int saveKey(KeyStore keyStore,int uid) {
		String query="insert into keystores values (?,?,?,?,?,?)";
		Connection connection=ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, keyStore.getPid());
			preparedStatement.setString(2,keyStore.getKey());
			preparedStatement.setString(3,keyStore.getValue());
			preparedStatement.setString(4,keyStore.getDescription());
			preparedStatement.setString(5,keyStore.getComment());
			preparedStatement.setInt(6, uid);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}
}
