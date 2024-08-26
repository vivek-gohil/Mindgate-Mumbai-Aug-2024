package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsMain {

	public static void main(String[] args) {
		System.out.println("1. ArrayList");
		// ArrayList<Integer> numbersList = new ArrayList<Integer>();
		List<Integer> numbersList = new ArrayList<Integer>();
		System.out.println("Default size of List = " + numbersList.size());
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(10);
		numbersList.add(20);
		System.out.println("After adding elements, size of List = " + numbersList.size());
		System.out.println(numbersList);
		for (Integer i : numbersList) {
			System.out.println(i);
		}
		System.out.println("remove element");
		numbersList.remove(0);
		System.out.println("After remove element, size of List = " + numbersList.size());
		System.out.println(numbersList);
		System.out.println("remove element");
		Integer x = 10;
		numbersList.remove(x);
		System.out.println("After remove element, size of List = " + numbersList.size());
		System.out.println(numbersList);

		System.out.println("-------------------------------------------");
		System.out.println("2. HashSet");
		Set<String> nameSet = new HashSet<String>();
		System.out.println("Default size of Set = " + nameSet.size());
		System.out.println(nameSet.add("Adarsh"));
		System.out.println(nameSet.add("Nirav"));
		System.out.println(nameSet.add("Suman"));
		System.out.println(nameSet.add("Adarsh"));
		System.out.println(nameSet.add("Nirav"));
		System.out.println(nameSet.add("Suman"));

		System.out.println("After adding elements, size of Set = " + nameSet.size());
		System.out.println(nameSet);
		for (String s : nameSet) {
			System.out.println(s);
		}
		System.out.println("remove element");
		nameSet.remove("Suman");
		System.out.println("After remove element, size of Set = " + nameSet.size());
		System.out.println(nameSet);
		System.out.println("remove element");
		System.out.println(nameSet);
		System.out.println("-------------------------------------------");
		System.out.println("3. TreeSet");
		nameSet = new TreeSet<String>();
		System.out.println("Default size of Set = " + nameSet.size());
		System.out.println(nameSet.add("a"));
		System.out.println(nameSet.add("A"));
		System.out.println(nameSet.add("aa"));
		System.out.println(nameSet.add("AA"));
		System.out.println(nameSet.add("b"));
		System.out.println(nameSet.add("B"));
		System.out.println(nameSet.add("Adarsh"));
		System.out.println(nameSet.add("Nirav"));
		System.out.println(nameSet.add("Suman"));
		System.out.println(nameSet.add("Adarsh"));
		System.out.println(nameSet.add("Nirav"));
		System.out.println(nameSet.add("Suman"));
		System.out.println(nameSet.add("Shivam"));
		System.out.println(nameSet.add("Akshay"));
		System.out.println("After adding elements, size of Set = " + nameSet.size());
		System.out.println(nameSet);
		for (String s : nameSet) {
			System.out.println(s);
		}
		System.out.println("remove element");
		nameSet.remove("Suman");
		System.out.println("After remove element, size of Set = " + nameSet.size());
		System.out.println(nameSet);
		System.out.println("remove element");
		System.out.println(nameSet);
		System.out.println("-------------------------------------------");
		System.out.println("4. HashMap");
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		System.out.println("Default size of Map = " + nameSet.size());
		employeeMap.put(1, "Akshay");
		employeeMap.put(102, "Nirav");
		employeeMap.put(13, "Adarsh");
		employeeMap.put(14542, "Suman");
		employeeMap.put(159, null);
		employeeMap.put(null, null);
		employeeMap.put(null, null);
		System.out.println("After adding elements, size of Map = " + employeeMap.size());
		System.out.println(employeeMap);
		for (Integer i : employeeMap.keySet()) {
			System.out.println("Key =  " + i + " Value = " + employeeMap.get(i));
		}
		System.out.println("remove element");
		System.out.println(employeeMap.remove(104));
		System.out.println(employeeMap.remove(110));
		System.out.println("After remove element, size of Map = " + employeeMap.size());
		System.out.println(employeeMap);
		System.out.println("-------------------------------------------");
		System.out.println("4. HashMap");
		employeeMap = new TreeMap<Integer, String>();
		System.out.println("Default size of Map = " + nameSet.size());
		employeeMap.put(1, "Akshay");
		employeeMap.put(102, "Nirav");
		employeeMap.put(13, "Adarsh");
		employeeMap.put(14542, "Suman");
		employeeMap.put(14, null);
		System.out.println("After adding elements, size of Map = " + employeeMap.size());
		System.out.println(employeeMap);
		for (Integer i : employeeMap.keySet()) {
			System.out.println("Key =  " + i + " Value = " + employeeMap.get(i));
		}
		System.out.println("remove element");
		System.out.println(employeeMap.remove(104));
		System.out.println(employeeMap.remove(110));
		System.out.println("After remove element, size of Map = " + employeeMap.size());
		System.out.println(employeeMap);

	}

}
