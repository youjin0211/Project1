/**
 * 
 */
package com.beakseok;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.FileOutputStream;


/**
 * 
 */
public class Sample008 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
		
		in = new FileInputStream(new File(args[0]));
		out = new FileOutputStream(new File(args[1]));
		
		int i = in.read();
		while(i != -1) {
			out.write(i);
			i = in.read();
	    }
		
		in.close();
		out.close();
	}
}
