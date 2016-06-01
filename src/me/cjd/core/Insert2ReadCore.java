package me.cjd.core;

import java.util.ArrayList;
import java.util.List;
import me.cjd.inter.Insert2ReadRuner;

/**
 * 对容器的插入以及读取效率进行测试的方法
 * @author Mr.cjd
 * @param <T>
 */
public class Insert2ReadCore<T> {
	
	public void fire(Insert2ReadRuner<T> runer){
		List<T> list = new ArrayList<>();
		for (int i = 0; i < 10000; i ++) {
			list.add(
				runer.onInsert(i, "名字" + i)
			);
		}
		
		for (int i = 0 ; i < list.size(); i ++) {
			runer.onRead(list.get(i));
		}
	}
	
}
