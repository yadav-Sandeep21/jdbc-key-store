package com.ty.keystore.service;

import com.ty.keystore.dao.KeyStoreDao;
import com.ty.keystore.dto.KeyStore;

public class KeyStoreService {
	KeyStoreDao keyStoreDao=new KeyStoreDao();
	public int saveKey(KeyStore keyStore,int uid) {
		return keyStoreDao.saveKey(keyStore, uid);
	}
}
