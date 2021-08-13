package com.herbalife.corecollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
	public static void main(String[] args) {
		HashSet<String> hlist = new HashSet<>();
		hlist.add("MECHANICAL");
		hlist.add("ELECTRICAL");
		hlist.add("CS");
		hlist.add("ELECTRICAL");
		hlist.add("ENTC");
		hlist.add("PETROLIUM");
		hlist.add("AERONAUTICAL");
		hlist.add("MECHANICAL");
		hlist.add("CIVIL");
		hlist.remove("AERONAUTICAL");
		//hlist.forEach(System.out::println);
		hlist.forEach((dips)->System.out.println(dips));
		/*Iterator<String> sk = hlist.iterator();
		while(sk.hasNext()){
			System.out.println(sk.next());
		}*/
	}

}
