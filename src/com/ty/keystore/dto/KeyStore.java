package com.ty.keystore.dto;

public class KeyStore {
	private int pid;
	private String key;
	private String value;
	private String description;
	private String comment;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "KeyStore [pid=" + pid + ", key=" + key + ", value=" + value + ", description=" + description
				+ ", comment=" + comment + "]";
	}
}
