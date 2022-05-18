package com.ty.keystore.controller;

import com.ty.keystore.dto.KeyStore;
import com.ty.keystore.service.KeyStoreService;

public class TestKeyStore {

	public static void main(String[] args) {
		KeyStore keyStore=new KeyStore();
		keyStore.setPid(2);
		keyStore.setKey("Instagram");
		keyStore.setValue("insta@123");
		keyStore.setDescription("www.instagram.com");
		keyStore.setComment("Hey, This is instagram");
		
		KeyStoreService keyStoreService=new KeyStoreService();
		int res=keyStoreService.saveKey(keyStore, 1);
		if(res>0) 
			System.out.println("Key And Values saved");
			else
			System.out.println("Not Saved");
	}
}
