package com.ivan.dataStructures;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intArray = new ArrayList<Integer>();
		intArray.add(1); //0(1)
		intArray.add(2);
		intArray.add(3);
		intArray.add(4);
		intArray.remove(intArray.size() -1); //0(1)
		intArray.remove(1); //0(n)
		intArray.set(1, 30); // 0(n)
		System.out.println(intArray);
		
		List<String> stringArray = new ArrayList<String>();
		stringArray.add("Hello");
		stringArray.add("Dear");
		stringArray.remove(stringArray.size() -1);
		stringArray.add("Interviewer");
		stringArray.add(1, "Dear");
		stringArray.add("!");
		stringArray.set(3, ":)");
		System.out.println(stringArray);
	}

}
