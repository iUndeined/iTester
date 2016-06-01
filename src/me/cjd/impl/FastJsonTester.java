package me.cjd.impl;

import com.alibaba.fastjson.JSONObject;

import me.cjd.core.Insert2ReadCore;
import me.cjd.inter.Insert2ReadRuner;
import me.cjd.inter.Tester;

public class FastJsonTester implements Tester {

	@Override
	public String getName() {
		return "Fastjson JsonObject 测试用例";
	}

	@Override
	public void run() {
		new Insert2ReadCore<JSONObject>().fire(new Insert2ReadRuner<JSONObject>() {
			@Override
			public int getCount() {
				return 10000;
			}

			@Override
			public JSONObject onInsert(int id, String name) {
				JSONObject json = new JSONObject();
				json.put("id", id);
				json.put("name", name);
				return json;
			}

			@Override
			public void onRead(JSONObject model) {
			}
		});
	}
	
}
