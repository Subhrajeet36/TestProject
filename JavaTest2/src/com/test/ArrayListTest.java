package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListTest {
	 
	public void declare() {
		 
		List<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(12);
		arrayList.add(34);
		arrayList.add(44);
		arrayList.add(34);
		arrayList.add(33);
		
		List<Integer> greaterThan = arrayList.stream().distinct().map(x->x*2).collect(Collectors.toList());
		
		int sum = arrayList.stream().reduce(0, (x,y)->(x*y));		
		//greaterThan.forEach(x -> System.out.println(x));
		
		System.out.println(greaterThan);
		 
		
	}

}
