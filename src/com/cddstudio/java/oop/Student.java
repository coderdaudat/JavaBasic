package com.cddstudio.java.oop;

public class Student extends People{
	
	private String mAddress;
	private String mClassName;

	public Student(long id, String name, boolean isSex, int age) {
		super(id, name, isSex, age);
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String name, boolean isSex, int age, String mAddress, String mClassName) {
		super(id, name, isSex, age);
		this.mAddress = mAddress;
		this.mClassName = mClassName;
	}

	public String getAddress() {
		return mAddress;
	}

	public void setAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public String getClassName() {
		return mClassName;
	}

	public void setClassName(String mClassName) {
		this.mClassName = mClassName;
	}
	
	
	
	
	
}
