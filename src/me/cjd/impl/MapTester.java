package me.cjd.impl;

import java.util.HashMap;
import java.util.Map;
import me.cjd.core.Insert2ReadCore;
import me.cjd.inter.Insert2ReadRuner;
import me.cjd.inter.Tester;

public class MapTester implements Tester {
	
	@Override
	public String getName() {
		return "Map测试用例";
	}
	
	@Override
	public void run() {
		new Insert2ReadCore<Map<String, Object>>().fire(new Insert2ReadRuner<Map<String, Object>>() {
			@Override
			public int getCount() {
				return 10000;
			}

			@Override
			public Map<String, Object> onInsert(int id, String name) {
				Map<String, Object> map = new HashMap<>();
				map.put("id", id);
				map.put("name", name);
				return map;
			}

			@Override
			public void onRead(Map<String, Object> model) {
			}
		});
	}
	
}
