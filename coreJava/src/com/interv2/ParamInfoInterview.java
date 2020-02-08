package com.interv2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ParamInfoInterview {

	public static void main(String[] args) {
		MapListGetValue.mapListValue();
		ValuePrint.method1();
		ValuePrint.method2();
		
	}

}
 class ValuePrint {
	public static void method1() {
		int a=3;
		System.out.println("value :: "+a);
		System.out.println("print value 1.0/0 = "+1.0/0);
		System.out.println("print value 0/1 =  "+0/1);
	}
	public static int method2() {
		int a =1;
		return a;
	}
}

 final class MapListGetValue{
	public static void mapListValue() {
		System.out.println('A'+'B'+'C'+'D');
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Harendra", 100);
		hm.put("Suraj", 244);
		hm.put("Piyush", 30);
		hm.put("Raju", 94);
		hm.put("Dinesh", 50);
		System.out.println("hashMap ::: "+hm);
		
		//if you don't know value how get value using list 
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("List in only value  "+hm.values());
		
		list.addAll(hm.values());
		System.out.println("addAll Value :: "+list);
		Collections.sort(list);
		System.out.println("after sort :: "+list);
		
		for (Integer integer : list) {
			System.out.println("integer :: "+integer);
		}
		
		
		//if don't Know Key then how to get Key list2
		List<String> list2 = new ArrayList<String>();
		hm.keySet();
		System.out.println("List of Key name in HashMap :: "+hm.keySet());
		list2.addAll(hm.keySet());
		System.out.println("list2 :: "+list2);
		
		for(String obj:list2) {
			System.out.println("obj list2 :: "+obj);
		}
		Collections.sort(list2);
		System.out.println("Sorting key :: "+list2);
		
	}
		
}
