package com.north.neihan.bean;

import java.util.List;

public class ImageData {

	private long min_time;
	private boolean has_more;
	private String tip;
	private List<ImageItem> data;
	private long max_time;

	public ImageData(long min_time, boolean has_more, String tip,
			List<ImageItem> data, long max_time) {
		super();
		this.min_time = min_time;
		this.has_more = has_more;
		this.tip = tip;
		this.data = data;
		this.max_time = max_time;
	}

	public long getMin_time() {
		return min_time;
	}

	public void setMin_time(long min_time) {
		this.min_time = min_time;
	}

	public boolean isHas_more() {
		return has_more;
	}

	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public List<ImageItem> getData() {
		return data;
	}

	public void setData(List<ImageItem> data) {
		this.data = data;
	}

	public long getMax_time() {
		return max_time;
	}

	public void setMax_time(long max_time) {
		this.max_time = max_time;
	}

	@Override
	public String toString() {
		return "ImageEntity [min_time=" + min_time + ", has_more=" + has_more
				+ ", tip=" + tip + ", data=" + data + ", max_time=" + max_time
				+ "]";
	}
}
