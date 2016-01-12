package com.cddstudio.java.basic.collection;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		 
	       // Tạo một đối tượng HashMap lữu trữ mã số nhân viên và tiền lương.
	       // String key: Mã số nhân viên
	       // Float value: Tiền lương.
	       HashMap<String, Float> salaryMap = new HashMap<String, Float>();
	    
	 
	       salaryMap.put("E01", 1000f);
	       salaryMap.put("E02", 12000f);
	       salaryMap.put("E03", 12300f);
	       salaryMap.put("E04", 1000f);
	       salaryMap.put("E05", 300.5f);
	        
	       // Lấy ra tiền lương của nhân viên 'E02'
	       Float salary= salaryMap.get("E01");
	       System.out.println("Salary of employee E01 = "+ salary);
	        
	       // Thay đổi tiền lương cho nhân viên 'E05'
	       salaryMap.put("E05", 400f);
	        
	       System.out.println("Salary of employee E05 = "+ salaryMap.get("E05"));
	        
	   }
	 

}
