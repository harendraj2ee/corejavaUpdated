package com.collection.harendra;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class HashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		hashMap();
		linkedhashMap();
		hashMapTest();
		identitiyHashMap();
		hashMapTest1();
		weakHashMap();
		treeMap();
	}
	public static void hashMap(){
		HashMap m = new HashMap();
		m.put("chiranjeevi", 700);
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
		System.out.println("HashMap Map >> "+m);//{k=v,k=v,...}
		System.out.println(m.put("chiranjeevi", 1000));
		Set s = m.keySet();
		System.out.println(" HashMap Set Map s >> "+s);//[k,k,....]
		Collection c = m.values();
		System.out.println(" HashMap Collection >> "+c);
		Set s1 = m.entrySet();
		System.out.println("HashMap set s1 >> "+s1);//[k=v,k=v,..]
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() +" .... "+m1.getValue());
			if(m1.getKey().equals("nagarjuna"))
			{
				m1.setValue(10000);
			}
		}
		System.out.println("HashMap m1 setvalue >> "+m);
	}
	
	// LinkedHashMap
	public static void linkedhashMap(){
		LinkedHashMap m = new LinkedHashMap();
		m.put("chiranjeevi", 700);
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
		System.out.println("LinkedHashMap Map >> "+m);//{k=v,k=v,...}
		System.out.println(m.put("chiranjeevi", 1000));
		Set s = m.keySet();
		System.out.println("LinkedHashMap Set Map s >> "+s);//[k,k,....]
		Collection c = m.values();
		System.out.println("LinkedHashMap Collection >> "+c);
		Set s1 = m.entrySet();
		System.out.println("LinkedHashMap set s1 >> "+s1);//[k=v,k=v,..]
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() +" .... "+m1.getValue());
			if(m1.getKey().equals("nagarjuna"))
			{
				m1.setValue(10000);
			}
		}
		System.out.println("LinkedHashMap m1 setvalue >> "+m);
	}
	public static void hashMapTest(){
		HashMap m = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "pawan");
		m.put(i2, "kalyan");
		System.out.println(" HashMap Map >> "+m);//{k=v,k=v,...}
	}
	//identityHashmap
	public static void identitiyHashMap(){
		IdentityHashMap m = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "pawan");
		m.put(i2, "kalyan");
		System.out.println("IndentityHashMap Map >> "+m);//{k=v,k=v,...}
	}
	public static void hashMapTest1() throws InterruptedException{
		HashMap m = new HashMap();
		Temp1 t = new Temp1();
		m.put(t, "durga");
		System.out.println("HashMap temp1 >> "+m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("after sleep Temp1 >> "+m);
	}
	//Weakhaspmap
	public static void weakHashMap() throws InterruptedException{
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "durga");
		System.out.println("weakHashMap temp >> "+m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println("after sleep Temp >> "+m);
	}
	//TreeMap
	public static void treeMap() throws InterruptedException{
		TreeMap m = new TreeMap();
		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101, "XXX");
		m.put(104, 106);
		//m.put("FFF", "XXX");//RE:CCE
		//m.put(null, "XXX");//RE:NPE
		System.out.println("TreeMap m Default sorting >> "+m);
		
		//Comparator
		TreeMap m1 = new TreeMap(new MyComparator());
		m1.put("XXX", 10);
		m1.put("AAA", 20);
		m1.put("ZZZ", 30);
		m1.put("LLL", 40);
		System.out.println("TreeMap m1 custom sotring >> "+m1);
	}	
}

class Temp1{
	public String toString(){
		return "temp1";
	}
	public void finalize(){
		System.out.println("Finalize Method called Temp1..");
	}
}
class Temp{
	public String toString(){
		return "temp";
	}
	public void finalize(){
		System.out.println("Finalize Method called Temp..");
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}