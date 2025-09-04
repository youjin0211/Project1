/**
 * 
 */
package com.beakseok;

import java.util.HashSet;

/**
 * 
 */
public class Sample003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> bookSet = new HashSet<String>();
		bookSet.add("책100");
		bookSet.add("책2");
		bookSet.add("책3");
		bookSet.add("책3");
		
		for (String b : bookSet) {
			System.out.println(b);
		}

	}

}
