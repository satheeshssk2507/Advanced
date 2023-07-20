package org.tcs.test.login;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

//set
public class Demo  {
public static void main(String[] args) {
	
	LinkedHashMap<String,Sample> m = new LinkedHashMap<>();
	//1st employee
	Sample s = new Sample();
	s.setId(12);
	s.setName("profenaa");
	s.setSalary(12.123456f);
	s.setStatus(true);
	
	//2nd employee
	Sample s1 = new Sample();
	s1.setId(23);
	s1.setName("tech");
	s1.setSalary(15.123456f);
	s.setStatus(false);
	
	//3rd employee
	Sample s2 = new Sample();
	s2.setId(56);
	s2.setName("java");
	s2.setSalary(45.123456f);
	s2.setStatus(false);
	
	m.put("1st employee", s);
	m.put("2nd employee", s1);
	m.put("3rd employee", s2);
	
	Set<Entry<String, Sample>> d = m.entrySet();
	for (Entry<String, Sample> x : d) {
		System.out.println(x.getKey());
		System.out.println(x.getValue().getId());
		System.out.println(x.getValue().getName());
		System.out.println(x.getValue().getSalary());
		System.out.println(x.getValue().isStatus());
		
		
		
		
		
		
	}
}
}
