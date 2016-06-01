package me.cjd.core;

import me.cjd.impl.FastJsonTester;
import me.cjd.impl.MapTester;
import me.cjd.impl.ModelTester;
import me.cjd.inter.Tester;

public class TesterCore {
	
	public static void runTest(Tester tester){
		System.out.println("【" + tester.getName() + "】效率测试开始！");
		long start = System.currentTimeMillis();
		tester.run();
		long end = System.currentTimeMillis();
		System.out.println("【" + tester.getName() + "】效率测试结束，耗时：" + (end - start) + "毫秒。");
	}
	
	public static void main(String[] args) {
		runTest(new MapTester());
		runTest(new FastJsonTester());
		runTest(new ModelTester());
	}

}