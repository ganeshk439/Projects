package com.ganesh.test;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ganesh.Address;
import com.ganesh.Student;

public class Test {

	public static void main(String[] args) {
		try {
			Address  adr=new Address();
			adr.setHno("1-152 main street laxmipuram");
			adr.setDist("srikakulam");
			adr.setState("andhrapradesh");
			
			Map<String,Integer> map=new HashMap<String,Integer>();
			map.put("mat", 98);
			map.put("eng", 90);
			map.put("sci", 95);
			map.put("soc", 98);
			
			
			Student std=new Student();
			std.setSid(100);
			std.setSname("ganesh");
			std.setSfee(10000);
			std.setAdr(adr);
			std.setMap(map);
			ObjectMapper om=new ObjectMapper();
			String str= om.writeValueAsString(std);
			System.out.println(str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
