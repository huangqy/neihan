package com.north.neihan.bean;

public class User {

	private long user_id;
	private String name;
	private String avatar_url;
	private boolean user_verified;

	public User(long user_id, String name, String avatar_url,
			boolean user_verified) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.avatar_url = avatar_url;
		this.user_verified = user_verified;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public boolean isUser_verified() {
		return user_verified;
	}

	public void setUser_verified(boolean user_verified) {
		this.user_verified = user_verified;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", avatar_url="
				+ avatar_url + ", user_verified=" + user_verified + "]";
	}
}
