package com.herbalife.corecollection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {
	public static void main(String[] args) {
		Map<String, String> tp = new TreeMap<>();
		tp.put("ID", "168");
		tp.put("NAME", "SUMIT");
		tp.put("ADDRESS", "PUNE");
		tp.put("SALARY", "971254.82");
		tp.put("JDK", null);
		tp.put("CORE JAVA", null);
		//tp.put(null, "DEEPIKA");
		/*
		 * tp.put("COMPANY",null ); tp.put("JOINING DATE", null);
		 */
		for (Map.Entry<String, String> deepika : tp.entrySet()) {
			System.out.println(deepika.getKey() + ": " + deepika.getValue());
		}
	}

}
