package me.cjd.inter;

public interface Insert2ReadRuner<T> {
	
	public int getCount();
	
	public T onInsert(int id, String name);
	
	public void onRead(T model);
	
}
