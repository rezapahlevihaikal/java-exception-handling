package com.juaracoding.main;

import java.util.Scanner;

public class Latihan {
	public static void main (String [] args) {
		method();
	}
	
	
	static void method() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Masukkan Jenis Kelamin Ketik L/P :");
		String jk = scan.next(); 
		System.out.println("Masukkan Status Pernikahan Ketik :");
		String st = scan.next();
		
		if(jk == "L" && st == "single") {
			throw new ArithmeticException("Kena pajak 10%");
		}
		else if(jk == "L" && st == "menikah") {
			throw new ArithmeticException("Kena pajak 5%");
		}
		else if (jk == "P" && st == "single") {
			throw new ArithmeticException("Kena pajak 7%");
		}
		else if (jk == "P" && st == "menikah"){
			throw new ArithmeticException("Kena pajak 3%");
		}
		
	}
}
