package com.north.neihan.bean;

import java.io.Serializable;
import java.util.List;

public class ImageGroup implements Serializable {

	private static final long serialVersionUID = 1L;
	private long create_time;
	private int favorite_count;
	private int go_detail_count;
	private int user_favorite;
	private int bury_count;
	private String share_url;
	private int label;
	private String content;
	private int comment_count;
	private int user_bury;
	private int status;
	private int has_comments;
	private ImageDetail large_image;
	private String description;
	private String status_desc;
	private User user;
	private int user_digg;
	private long group_id;
	private int level;
	private int repin_count;
	private int digg_count;
	private int has_hot_comments;
	private int image_status;
	private int user_repin;
	private int category_id;
	private ImageDetail middle_image;
	private List<Comment> comments;
	private int type;

	public long getCreate_time() {
		return create_time;
	}

	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}

	public int getFavorite_count() {
		return favorite_count;
	}

	public void setFavorite_count(int favorite_count) {
		this.favorite_count = favorite_count;
	}

	public int getGo_detail_count() {
		return go_detail_count;
	}

	public void setGo_detail_count(int go_detail_count) {
		this.go_detail_count = go_detail_count;
	}

	public int getUser_favorite() {
		return user_favorite;
	}

	public void setUser_favorite(int user_favorite) {
		this.user_favorite = user_favorite;
	}

	public int getBury_count() {
		return bury_count;
	}

	public void setBury_count(int bury_count) {
		this.bury_count = bury_count;
	}

	public String getShare_url() {
		return share_url;
	}

	public void setShare_url(String share_url) {
		this.share_url = share_url;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}

	public int getUser_bury() {
		return user_bury;
	}

	public void setUser_bury(int user_bury) {
		this.user_bury = user_bury;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getHas_comments() {
		return has_comments;
	}

	public void setHas_comments(int has_comments) {
		this.has_comments = has_comments;
	}

	public ImageDetail getLarge_image() {
		return large_image;
	}

	public void setLarge_image(ImageDetail large_image) {
		this.large_image = large_image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus_desc() {
		return status_desc;
	}

	public void setStatus_desc(String status_desc) {
		this.status_desc = status_desc;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUser_digg() {
		return user_digg;
	}

	public void setUser_digg(int user_digg) {
		this.user_digg = user_digg;
	}

	public long getGroup_id() {
		return group_id;
	}

	public void setGroup_id(long group_id) {
		this.group_id = group_id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getRepin_count() {
		return repin_count;
	}

	public void setRepin_count(int repin_count) {
		this.repin_count = repin_count;
	}

	public int getDigg_count() {
		return digg_count;
	}

	public void setDigg_count(int digg_count) {
		this.digg_count = digg_count;
	}

	public int getHas_hot_comments() {
		return has_hot_comments;
	}

	public void setHas_hot_comments(int has_hot_comments) {
		this.has_hot_comments = has_hot_comments;
	}

	public int getImage_status() {
		return image_status;
	}

	public void setImage_status(int image_status) {
		this.image_status = image_status;
	}

	public int getUser_repin() {
		return user_repin;
	}

	public void setUser_repin(int user_repin) {
		this.user_repin = user_repin;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public ImageDetail getMiddle_image() {
		return middle_image;
	}

	public void setMiddle_image(ImageDetail middle_image) {
		this.middle_image = middle_image;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ImageGroup [create_time=" + create_time + ", favorite_count="
				+ favorite_count + ", go_detail_count=" + go_detail_count
				+ ", user_favorite=" + user_favorite + ", bury_count="
				+ bury_count + ", share_url=" + share_url + ", label=" + label
				+ ", content=" + content + ", comment_count=" + comment_count
				+ ", user_bury=" + user_bury + ", status=" + status
				+ ", has_comments=" + has_comments + ", large_image="
				+ large_image + ", description=" + description
				+ ", status_desc=" + status_desc + ", user=" + user
				+ ", user_digg=" + user_digg + ", group_id=" + group_id
				+ ", level=" + level + ", repin_count=" + repin_count
				+ ", digg_count=" + digg_count + ", has_hot_comments="
				+ has_hot_comments + ", image_status=" + image_status
				+ ", user_repin=" + user_repin + ", category_id=" + category_id
				+ ", middle_image=" + middle_image + ", comments=" + comments
				+ ", type=" + type + "]";
	}
}
