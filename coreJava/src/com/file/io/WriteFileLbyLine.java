package com.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteFileLbyLine {
	public static void main(String args[]) throws IOException{
		System.out.println("MAIN METHOD FILE WRITE LINE BY LINE >>>");
		writeFile1();
		writeFile2();
		writeFile3();
		writeFile4();
	}
	public static void writeFile1() throws IOException {
		File fout = new File("D:\\FILES\\EclipseIDE\\FileIO\\txtFile\\out1.txt");//D:\FILES\EclipseIDE\FileIO
		System.out.println("1. FileOutputStream >> "+fout);
		FileOutputStream fos = new FileOutputStream(fout);
	 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 		for (int i = 0; i < 10; i++) {
			bw.write("something");
			bw.newLine();
		}
	 		bw.close();
	}
	public static void writeFile2() throws IOException {
		FileWriter fw = new FileWriter("D:\\FILES\\EclipseIDE\\FileIO\\txtFile\\out2.txt");
		System.out.println("2. FileWriter >> "+fw);
		for (int i = 0; i < 10; i++) {
			fw.write("something");
		}
			fw.close();
	}
	public static void writeFile3() throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\FILES\\EclipseIDE\\FileIO\\txtFile\\out3.txt"));
		System.out.println("3. PrintWriter >> "+pw);
		for (int i = 0; i < 10; i++) {
			pw.write("something");
		}
	 		pw.close();
	}
	public static void writeFile4() throws IOException {
		File fout = new File("D:\\FILES\\EclipseIDE\\FileIO\\txtFile\\out4.txt");
		System.out.println("4. OutputStreamWriter >> "+fout);
		FileOutputStream fos = new FileOutputStream(fout);
	 		OutputStreamWriter osw = new OutputStreamWriter(fos);
	 
		for (int i = 0; i < 10; i++) {
			osw.write("something");
		}
	 		osw.close();
	}
}
