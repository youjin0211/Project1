/**
 * 
 */
package com.beakseok;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 */
public class Sample007 {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url;
		try {
			url = new URL("www.naver.com");
			System.out.println(url);
		} catch (MalformedURLException e) {
			System.out.println("URL형식이 잘못되었습니다");
			e.printStackTrace();
		}
		
	}

}
