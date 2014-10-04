package com.north.neihan.bean;

public class ImageUrl {

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
