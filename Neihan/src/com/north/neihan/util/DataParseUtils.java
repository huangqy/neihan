package com.north.neihan.util;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.north.neihan.bean.CommentData;
import com.north.neihan.bean.ImageData;
import com.north.neihan.bean.EssayData;

public class DataParseUtils {

	public static ImageData parseImageJson(String json) {
		try {
			JSONObject jsonObject = new JSONObject(json);
			if ("success".equals(jsonObject.getString("message"))) {
				JSONObject data = jsonObject.getJSONObject("data");
				Gson gson = new Gson();
				return gson.fromJson(data.toString(), ImageData.class);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static EssayData parseEssayJson(String json) {
		try {
			JSONObject jsonObject = new JSONObject(json);
			if ("success".equals(jsonObject.getString("message"))) {
				JSONObject data = jsonObject.getJSONObject("data");
				Gson gson = new Gson();
				return gson.fromJson(data.toString(), EssayData.class);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static CommentData parseCommentJson(String json) {
		try {
			JSONObject jsonObject = new JSONObject(json);
			if ("success".equals(jsonObject.getString("message"))) {
				Gson gson = new Gson();
				return gson.fromJson(json, CommentData.class);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
