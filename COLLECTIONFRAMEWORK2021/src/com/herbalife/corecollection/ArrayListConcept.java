package com.herbalife.corecollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListConcept {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("MECHANICAL");
		al.add("IT");
		al.add("CS");
		al.add("MECHANICAL");
		al.add("ELECTRONICS");
		al.add("IT");
		al.add("ELECTRICAL");
		al.add(2, "MATHEMATICS");
		al.add(4, "CSIT");
		al.add("CHEMICAL");
		al.add("AERONOTICAL");
		al.add("PETROLIUM");
		al.add("FOOD TECHNOLOGY");
		al.add("ARTIFICAL INTELLIGENCE");
		al.add("AUTOMOBILE");
		al.remove(3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the branch name: ");
		String deepika1 = sc.nextLine();
		//System.out.println(al);
		for (String deepika : al) {
			if(deepika1.equalsIgnoreCase("IT")){
				System.out.println("Available");
			}
			else{
				System.out.println("Not Available");
			}


		}
		/*ListIterator<String> itlist = al.listIterator();
		while(itlist.hasNext()){
			System.out.println(itlist.next());
		}
		*/
		/*Iterator<String> deepika = al.iterator();
		while (deepika.hasNext()) {
			System.out.println(deepika.next()); 
			
		}*/
		/*for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}*/
		//al.forEach(System.out::println);
		//al.forEach(deepika->System.out.println(deepika));
		//al.stream().forEach((deepika)->System.out.println(deepika));
	}

}
