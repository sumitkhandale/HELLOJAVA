package com.herbalife.corecollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		hm.put("ID", "179");
		hm.put("NAME", "SUMIT");
		hm.put("ADDRESS", "PUNE");
		hm.put("SALARY", "971254.82");
		hm.put(null, "SKK");
		hm.put(null, "SUMIT");
		hm.put(null, "DEEPIKA");
		hm.put("COMPANY", null);
		hm.put("JOINING DATE", null);
		/*
		 * for (Map.Entry<String, String> sumit : hm.entrySet()) {
		 * System.out.println("Key= " + sumit.getKey() + ":" + "Value= " +
		 * sumit.getValue()); }
		 */
		for (Map.Entry<String, String> sumit : hm.entrySet()) {
			System.out.println(sumit.getKey() + ": " + sumit.getValue());
		}

	}

}
