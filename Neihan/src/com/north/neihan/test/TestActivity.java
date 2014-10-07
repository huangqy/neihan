package com.north.neihan.test;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.north.neihan.R;
import com.north.neihan.bean.CommentData;
import com.north.neihan.bean.ImageData;
import com.north.neihan.bean.ImageDetail;
import com.north.neihan.bean.ImageGroup;
import com.north.neihan.bean.ImageItem;
import com.north.neihan.bean.ImageUrl;
import com.north.neihan.bean.EssayData;
import com.north.neihan.bean.EssayItem;
import com.north.neihan.client.ClientAPI;
import com.north.neihan.util.DataParseUtils;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

	private int itemCount = 30;
	private RequestQueue mQueue;
	
	private Button refreshBtn;
	private SharedPreferences mSharedPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);

		mQueue = Volley.newRequestQueue(this);
		mSharedPreferences = getPreferences(MODE_PRIVATE);
		
//		refreshBtn = (Button) this.findViewById(R.id.refresh_btn);
//		refreshBtn.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				long minTime = mSharedPreferences.getLong("minTime", 0);
//				Toast.makeText(TestActivity.this, "-->>" + minTime, 1).show();
//				ClientAPI.getList(mQueue, CATEGORY_TEXT, minTime, itemCount, TestActivity.this);
//				
//			}
//		});
//		ClientAPI.getList(mQueue, CATEGORY_TEXT, 0, itemCount, TestActivity.this);
		ClientAPI.getCommentList(mQueue, 20, 3551461874L, 20, TestActivity.this);
	}
	
	@Override
	public void onResponse(String response) {
		// TODO Auto-generated method stub
		CommentData commentData = DataParseUtils.parseCommentJson(response);
		Log.i(TAG, "--->>" + commentData.isHas_more());
		Log.i(TAG, "--->>" + commentData.getTotal_number());
		Log.i(TAG, "--->>" + commentData.getData().toString());
	}

	// 获取段子，图片列表的回调方法
	public void ListOnResponse(String response) {
		// TODO Auto-generated method stub

		response = response.replaceAll("\"package\"", "\"packageName\"");
		
		EssayData jokeData = DataParseUtils.parseEssayJson(response);
		
		Log.i(TAG, "--Has_more->>" + jokeData.isHas_more());
		if (jokeData.isHas_more()) {
		
			long lastTime = jokeData.getMin_time();
			Editor editor = mSharedPreferences.edit();
			editor.putLong("minTime", lastTime);
			editor.commit();

			Log.i(TAG, "--min_time->>" + lastTime);

			List<EssayItem> list = jokeData.getData();
			int len = list.size();
			Log.i(TAG, "--段子条数->>" + len);
		} else {
			Log.i(TAG, "--Tip->>" + jokeData.getTip());
		}
		
//		for (int i = 0; i < len; i++) {
//
//			System.out.println(i + " --->> " + list.get(i).getType());
//		}

		// ImageData imageData = DataParseUtils.parseImageJson(response);
		// System.out.println(imageData.getTip() + " || " +
		// imageData.getMin_time());
		// List<ImageItem> data = imageData.getData();
		// System.out.println(data.size());
		//
		// ImageItem imageItem = data.get(0);
		// ImageGroup group = imageItem.getGroup();
		// ImageDetail large_image = group.getLarge_image();
		// List<ImageUrl> url_list = large_image.getUrl_list();
		// for (int i = 0; i < url_list.size(); i++) {
		// System.out.println(url_list.get(i).getUrl());
		// }
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
