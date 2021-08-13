package com.herbalife.corecollection;

import java.util.TreeSet;

public class TreeSetConcept {
	public static void main(String[] args) {

		TreeSet<String> tt = new TreeSet<>();
		tt.add("MECHANICAL");
		tt.add("IT");
		tt.add("CS");
		tt.add("MECHANICAL");
		tt.add("ELECTRONICS");
		tt.add("IT");
		tt.add("ELECTRICAL");
		tt.add("AERONOTIC");
		tt.add("PETROLIUM");
		tt.add("FOOD TECHNOLOGY");
		tt.add("ARTIFICtt INTELLIGENCE");
		tt.add("AUTOMOBILE");
		//tt.forEach(System.out::println);
		tt.forEach(deepika->System.out.println(deepika));
	}

}
