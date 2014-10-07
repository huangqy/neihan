package com.north.neihan.bean;

import java.io.Serializable;

public class CommentData implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean has_more;
	private String message;
	private long group_id;
	private CommentList data;
	private long total_number;
	
	public boolean isHas_more() {
		return has_more;
	}
	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getGroup_id() {
		return group_id;
	}
	public void setGroup_id(long group_id) {
		this.group_id = group_id;
	}
	public CommentList getData() {
		return data;
	}
	public void setData(CommentList data) {
		this.data = data;
	}
	public long getTotal_number() {
		return total_number;
	}
	public void setTotal_number(long total_number) {
		this.total_number = total_number;
	}

	@Override
	public String toString() {
		return "CommentData [has_more=" + has_more + ", message=" + message
				+ ", group_id=" + group_id + ", data=" + data
				+ ", total_number=" + total_number + "]";
	}
}
