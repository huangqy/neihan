package com.north.neihan.test;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.north.neihan.R;
import com.north.neihan.bean.ImageData;
import com.north.neihan.bean.ImageDetail;
import com.north.neihan.bean.ImageGroup;
import com.north.neihan.bean.ImageItem;
import com.north.neihan.bean.ImageUrl;
import com.north.neihan.bean.JokeData;
import com.north.neihan.client.ClientAPI;
import com.north.neihan.util.DataParseUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * 这个文件是测试入口，所有测试代码都写在这
 * 
 * @author North
 *
 */

public class TestActivity extends Activity implements Response.Listener<String> {

	public static final String TAG = "TestActivity";
	// 文本ID
	public static final int CATEGORY_TEXT = 1;
	// 图片ID
	public static final int CATEGORY_IMAGE = 2;
	
	private int itemCount = 0;
	private RequestQueue mQueue;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		
		mQueue = Volley.newRequestQueue(this);
		
		ClientAPI.getList(mQueue, CATEGORY_TEXT, itemCount, this);
	}
	
	@Override
	public void onResponse(String response) {
		// TODO Auto-generated method stub
		
		JokeData jokeData = DataParseUtils.parseJokeJson(response);
		System.out.println(jokeData.getData().size());
		System.out.println(jokeData.getData().toString());
		
//		ImageData imageData = DataParseUtils.parseImageJson(response);
//		System.out.println(imageData.getTip() + " || " + imageData.getMin_time());
//		List<ImageItem> data = imageData.getData();
//		System.out.println(data.size());
//		
//		ImageItem imageItem = data.get(0);
//		ImageGroup group = imageItem.getGroup();
//		ImageDetail large_image = group.getLarge_image();
//		List<ImageUrl> url_list = large_image.getUrl_list();
//		for (int i = 0; i < url_list.size(); i++) {
//			System.out.println(url_list.get(i).getUrl());
//		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
