package com.north.neihan.bean;

import java.io.Serializable;
import java.util.List;

public class JokeItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private long online_time;
	private long display_time;
	private JokeGroup group;
	private AdDetail ad;
	private List<Comment> comments;
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

	public JokeGroup getGroup() {
		return group;
	}

	public void setGroup(JokeGroup group) {
		this.group = group;
	}

	public AdDetail getAd() {
		return ad;
	}

	public void setAd(AdDetail ad) {
		this.ad = ad;
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
		return "JokeItem [online_time=" + online_time + ", display_time="
				+ display_time + ", group=" + group + ", ad=" + ad
				+ ", comments=" + comments + ", type=" + type + "]";
	}

}
