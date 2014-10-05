package com.north.neihan.bean;

import java.io.Serializable;

public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;
	private long user_id;
	private String description;
	private String text;
	private long comment_id;
	private int digg_count;
	private boolean user_verified;
	private String platform_id;
	private String avatar_url;
	private long create_time;

	private int is_digg;
	private String user_name;
	private String user_profile_image_url;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getComment_id() {
		return comment_id;
	}

	public void setComment_id(long comment_id) {
		this.comment_id = comment_id;
	}

	public int getDigg_count() {
		return digg_count;
	}

	public void setDigg_count(int digg_count) {
		this.digg_count = digg_count;
	}

	public boolean isUser_verified() {
		return user_verified;
	}

	public void setUser_verified(boolean user_verified) {
		this.user_verified = user_verified;
	}

	public String getPlatform_id() {
		return platform_id;
	}

	public void setPlatform_id(String platform_id) {
		this.platform_id = platform_id;
	}

	public String getAvatar_url() {
		return avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}

	public int getIs_digg() {
		return is_digg;
	}

	public void setIs_digg(int is_digg) {
		this.is_digg = is_digg;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_profile_image_url() {
		return user_profile_image_url;
	}

	public void setUser_profile_image_url(String user_profile_image_url) {
		this.user_profile_image_url = user_profile_image_url;
	}

	@Override
	public String toString() {
		return "Comment [user_id=" + user_id + ", description=" + description
				+ ", text=" + text + ", comment_id=" + comment_id
				+ ", digg_count=" + digg_count + ", user_verified="
				+ user_verified + ", platform_id=" + platform_id
				+ ", avatar_url=" + avatar_url + ", create_time=" + create_time
				+ ", is_digg=" + is_digg + ", user_name=" + user_name
				+ ", user_profile_image_url=" + user_profile_image_url + "]";
	}
}
