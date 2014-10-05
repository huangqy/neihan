package com.north.neihan.bean;

import java.io.Serializable;
import java.util.List;

public class ImageDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private String uri;
	private List<ImageUrl> url_list;

	public ImageDetail(int width, int height, String uri,
			List<ImageUrl> url_list) {
		super();
		this.width = width;
		this.height = height;
		this.uri = uri;
		this.url_list = url_list;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public List<ImageUrl> getUrl_list() {
		return url_list;
	}

	public void setUrl_list(List<ImageUrl> url_list) {
		this.url_list = url_list;
	}

	@Override
	public String toString() {
		return "ImageEntity [width=" + width + ", height=" + height + ", uri="
				+ uri + ", url_list=" + url_list + "]";
	}
}
