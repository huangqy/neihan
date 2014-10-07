package com.north.neihan.client;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.north.neihan.test.TestActivity;

/**
 * 所有和服务器接口对接的方法，全部在这个类里
 * 
 * @author North
 *
 */

public class ClientAPI {

	public static final String CATEGORY_LIST_API = "http://ic.snssdk.com/2/essay/zone/category/data/";
	public static final String COMMENT_LIST_API = "http://isub.snssdk.com/2/data/get_essay_comments/";

	/**
	 * 获取内涵段子图片列表内容
	 * 
	 * @param queue
	 *            Volley请求队列
	 * @param categoryType
	 *            要获取的参数类型
	 * @param minTime
	 *            用于分页或者下拉刷新，代表上一次服务器返回信息的时间。 0表示不分页
	 * @param itemCount
	 *            请求的条目数
	 * @param responseListener
	 *            响应监听器,用于下载网络数据
	 * @see TestActivity#CATEGORY_TEXT
	 * @see TestActivity#CATEGORY_IMAGE
	 */
	public static void getList(RequestQueue queue, int categoryType,
			long minTime, int itemCount,
			Response.Listener<String> responseListener) {
		String categoryParam = "category_id=" + categoryType;
		String countParam = "count=" + itemCount;
		String acParam = "ac=wifi";
		String deviceTypeParam = "device_type=KFTT";
		String openudidParam = "openudid=b90ca6a3a19a78d6";
		String url = ClientAPI.CATEGORY_LIST_API
				+ "?"
				+ categoryParam
				+ "&"
				+ countParam
				+ "&"
				+ acParam
				+ "&"
				+ deviceTypeParam
				+ "&"
				+ openudidParam
				+ "&level=6&iid=2337593504&device_id=2757969807&channel=wandoujia&aid=7&app_name=joke_essay&version_code=302&device_platform=android&os_api=15&os_version=4.0.3";

		if (minTime > 0)
			url = url + "&min_time=" + minTime;

		StringRequest request = new StringRequest(Request.Method.GET, url,
				responseListener, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {
						// TODO Auto-generated method stub

					}
				});

		queue.add(request);
	}

	public static void getCommentList(RequestQueue queue, int count,
			long group_id, long offset,
			Response.Listener<String> responseListener) {
		String acParam = "ac=wifi";
		String deviceTypeParam = "device_type=KFTT";
		String openudidParam = "openudid=b90ca6a3a19a78d6";
		String url = ClientAPI.COMMENT_LIST_API
				+ "?group_id="
				+ group_id
				+ "&count="
				+ count
				+ "&offset="
				+ offset
				+ "&"
				+ acParam
				+ "&"
				+ deviceTypeParam
				+ "&"
				+ openudidParam
				+ "&device_id=2757969807&channel=wandoujia&aid=7&app_name=joke_essay&version_code=302&device_platform=android&os_api=15&os_version=4.0.3";
		StringRequest request = new StringRequest(Request.Method.GET, url,
				responseListener, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {
						// TODO Auto-generated method stub

					}
				});

		queue.add(request);
	}

}
