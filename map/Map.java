package map;

import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Map {

	void hashMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int number = 0;
		try {
			number = scan.nextInt();

		} catch (InputMismatchException exception) {
			// TODO: handle exception
		}

		for (int charindex = 0; charindex < number; charindex++) {
			System.out.println("Enter the Keys");
			System.out.println("Enter the Values");
			map.put(scan.next(), scan.nextInt());
		}
		System.out.println("Mapping:" + map);

		System.out.println("Enter the specific key :" + map.containsKey(scan.next()));

		System.out.println("Enter the specific values :" + map.containsValue(scan.nextInt()));

	}

	void linkedHashMap() {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Dhoni", 150);
		map.put("Sachin", 100);
		map.put("Jadeja", 89);
		System.out.println("The Score is :" + map);
		System.out.println("Enter the key :" + map.keySet());
		// displays only key values
		System.out.println("Enter the values:" + map.values());
		System.out.println("Final mapping is:" + map.entrySet());
	}

	void treeMap() {
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>(Collections.reverseOrder());
		map1.put("C", 1999);
		map1.put("C++", 1980);
		map1.put("Java", 1996);
		System.out.println("Programs are found in the year :" + map1);
	}
}
