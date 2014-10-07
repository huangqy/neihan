package com.north.neihan.bean;

import java.io.Serializable;

public class ImageItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private long online_time;
	private long display_time;
	private ImageGroup group;
	private CommentData comment;
	private int type;

	public long getOnline_time() {
		return online_time;
	}

	public void setOnline_time(long online_time) {
		this.online_time = online_time;
	}

	public long getDisplay_time() {
		return display_time;
	}

	public void setDisplay_time(long display_time) {
		this.display_time = display_time;
	}

	public ImageGroup getGroup() {
		return group;
	}

	public void setGroup(ImageGroup group) {
		this.group = group;
	}

	public CommentData getComment() {
		return comment;
	}

	public void setComment(CommentData comment) {
		this.comment = comment;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ImageItem [online_time=" + online_time + ", display_time="
				+ display_time + ", group=" + group + ", comment=" + comment
				+ ", type=" + type + "]";
	}

}
