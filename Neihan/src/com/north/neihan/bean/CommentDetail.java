package com.north.neihan.bean;

import java.io.Serializable;

public class CommentDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	private int uid;
	private String text;
	private long create_time;
	private int user_digg;
	private long id;
	private int user_bury;
	private String user_profile_url;
	private long user_id;
	private int bury_count;
	private String description;
	private int digg_count;
	private boolean user_verified;
	private String platform;
	private String user_name;
	private String user_profile_image_url;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}

	public int getUser_digg() {
		return user_digg;
	}

	public void setUser_digg(int user_digg) {
		this.user_digg = user_digg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getUser_bury() {
		return user_bury;
	}

	public void setUser_bury(int user_bury) {
		this.user_bury = user_bury;
	}

	public String getUser_profile_url() {
		return user_profile_url;
	}

	public void setUser_profile_url(String user_profile_url) {
		this.user_profile_url = user_profile_url;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public int getBury_count() {
		return bury_count;
	}

	public void setBury_count(int bury_count) {
		this.bury_count = bury_count;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
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
		return "Comment [uid=" + uid + ", text=" + text + ", create_time="
				+ create_time + ", user_digg=" + user_digg + ", id=" + id
				+ ", user_bury=" + user_bury + ", user_profile_url="
				+ user_profile_url + ", user_id=" + user_id + ", bury_count="
				+ bury_count + ", description=" + description + ", digg_count="
				+ digg_count + ", user_verified=" + user_verified
				+ ", platform=" + platform + ", user_name=" + user_name
				+ ", user_profile_image_url=" + user_profile_image_url + "]";
	}

}
