package me.cjd.impl;

import me.cjd.core.Insert2ReadCore;
import me.cjd.inter.Insert2ReadRuner;
import me.cjd.inter.Tester;
import me.cjd.model.Something;

public class ModelTester implements Tester {

	@Override
	public String getName() {
		return "Model模型测试用例";
	}

	@Override
	public void run() {
		new Insert2ReadCore<Something>().fire(new Insert2ReadRuner<Something>() {
			@Override
			public int getCount() {
				return 10000;
			}

			@Override
			public Something onInsert(int id, String name) {
				return new Something(id, name);
			}

			@Override
			public void onRead(Something model) {
			}
		});
	}
	
}
