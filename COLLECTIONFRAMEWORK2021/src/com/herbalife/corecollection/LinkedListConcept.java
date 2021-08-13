package com.herbalife.corecollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {
	public static void main(String[] args) {
		List<String> llist = new LinkedList<>();
		llist.add("MECHANICAL");
		llist.add("IT");
		llist.add("CS");
		llist.add("MECHANICAL");
		llist.add("ELECTRONICS");
		llist.add("IT");
		llist.add("ELECTRICAL");
		llist.add("CHEMICAL");
		llist.add("AERONOTICAL");
		llist.add("PETROLIUM");
		llist.add("FOOD TECHNOLOGY");
		llist.add("ARTIFICAL INTELLIGENCE");
		llist.add("AUTOMOBILE");
		llist.add(3, "SCIENCE");
		llist.remove(5);
		//llist.forEach(System.out::println);
		//llist.forEach((sumit)->System.out.println(sumit));
		Iterator<String> itr = llist.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
	

}
