package me.cjd.model;

/**
 * 测试容器 - 实体
 * @author Mr.cjd
 */
public class Something {

	private int id;
	private String name;
	
	public Something(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}