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

	/**
	 * 获取内涵段子图片列表内容
	 * 
	 * @param queue
	 *            Volley请求队列
	 * @param categoryType
	 *            要获取的参数类型
	 * @param itemCount
	 *            请求的条目数
	 * @param responseListener
	 *            响应监听器,用于下载网络数据
	 * @see TestActivity#CATEGORY_TEXT
	 * @see TestActivity#CATEGORY_IMAGE
	 */
	public static void getList(RequestQueue queue, int categoryType,
			int itemCount, Response.Listener<String> responseListener) {
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
