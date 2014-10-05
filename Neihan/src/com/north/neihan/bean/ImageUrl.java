package com.north.neihan.bean;

import java.io.Serializable;

public class ImageUrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private String url;

	public ImageUrl(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ImageUrl [url=" + url + "]";
	}

}
