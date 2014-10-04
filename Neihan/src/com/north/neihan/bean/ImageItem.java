package com.north.neihan.bean;

import java.util.List;

public class ImageItem {

	private long online_time;
	private long display_time;
	private ImageGroup group;
	private List<Comment> comments;
	private int type;

	public ImageItem(long online_time, long display_time, ImageGroup group,
			List<Comment> comments, int type) {
		super();
		this.online_time = online_time;
		this.display_time = display_time;
		this.group = group;
		this.comments = comments;
		this.type = type;
	}

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
		return "ImageItem [online_time=" + online_time + ", display_time="
				+ display_time + ", group=" + group + ", comments=" + comments
				+ ", type=" + type + "]";
	}
}
