package com.eddie.testmap;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "A forbidden fruit");
		dictionary.put("banana", "A yellow fruit that can be peeled");
		dictionary.put("cantaloupe","A melon fruit that has an orange flesh");
		System.out.println(dictionary);
		
		//getting a value from map using a key
		String key="apple";
		String value = dictionary.get(key);
		System.out.println("The value for the key: " + key +" is " + value);
		
		//defining a TreeMap
		TreeMap<String, String> sortedDict = new TreeMap<>();
		sortedDict.putAll(dictionary);
		System.out.println(sortedDict);
		
		//adding another element
		sortedDict.put("beets", "An actual vegetable");
		System.out.println(sortedDict);
		
		sortedDict.put("beets", "An better explanation");
		System.out.println(sortedDict);//the previous definition is updated
		//to this one
		
		Set<String> keys = sortedDict.keySet();
		
		for (String s :keys) {
			System.out.println("key: "+ s);
		}
	}
}
