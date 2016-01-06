package com.cddstudio.java.oop;

public class People {
	private long id;
	private String name;
	private boolean isSex;
	private int age;
	
	public People(long id, String name, boolean isSex, int age){}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return isSex;
	}
	public void setSex(boolean isSex) {
		this.isSex = isSex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	};
	
	
}
