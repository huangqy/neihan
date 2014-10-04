package com.north.neihan.util;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.north.neihan.bean.ImageData;
import com.north.neihan.bean.JokeData;

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
	
	public static JokeData parseJokeJson(String json) {
		try {
			JSONObject jsonObject = new JSONObject(json);
			if ("success".equals(jsonObject.getString("message"))) {
				JSONObject data = jsonObject.getJSONObject("data");
				Gson gson = new Gson();
				return gson.fromJson(data.toString(), JokeData.class);
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
