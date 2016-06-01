package me.cjd.inter;

/**
 * 测试器接口
 * @author Mr.cjd
 */
public interface Tester {
	
	/**
	 * 返回本测试器的名称
	 */
	public String getName();
	
	/**
	 * 运行本测试器的执行方法
	 */
	public void run();
	
}
