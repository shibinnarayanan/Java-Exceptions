package com.svv.exceptions;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class ThrowsEx1 {
	
	public static void writeToFile() throws IOException{
	    BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
	    bw.write("Test");
	    bw.close();
	}
	
	public static void main(String[] args) {

			try {
				writeToFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
