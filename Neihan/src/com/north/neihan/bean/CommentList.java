package com.north.neihan.bean;

import java.io.Serializable;
import java.util.List;

public class CommentList implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<CommentDetail> recent_comments;
	private List<CommentDetail> top_comments;

	public List<CommentDetail> getRecent_comments() {
		return recent_comments;
	}

	public void setRecent_comments(List<CommentDetail> recent_comments) {
		this.recent_comments = recent_comments;
	}

	public List<CommentDetail> getTop_comments() {
		return top_comments;
	}

	public void setTop_comments(List<CommentDetail> top_comments) {
		this.top_comments = top_comments;
	}

	@Override
	public String toString() {
		return "Comment [recent_comments=" + recent_comments
				+ ", top_comments=" + top_comments + "]";
	}
}
