package com.juaracoding.main;

import java.util.Scanner;

public class CobaExceptionHandling {
	public static void main(String [] args) {
//		method1();
//		methodPenggunaanFinally();
//		penggunaanThrow(10);
		
//		try {
//			eksekusi();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
//		masKoswara();
		
//		masKoswaraDua();
		
//		masKoswaraTiga();
		
//		masKoswaraEmpat();
		
		validasi();
	}
	
	static void method1() {
		try {
			int x = 1/0;
			System.out.println("Statement :");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	static void methodPenggunaanCatch() {

		try {
			int x = 1/0;
			System.out.println("Statement :");
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
		}
	}
	
	
	static void methodPenggunaanFinally() {
		try {
			int x = 1/0;
			System.out.println("Statement : ");
		}
		catch(Exception e) {
			System.err.println("Terjadi Kesalahan");
		}
		finally {
			System.out.println("Program kembali dijalankan");
		}
	}
	
	
	static void penggunaanThrow(int age) {
		if(age < 14) {
			throw new ArithmeticException("Umur tidak Valid");
		}
		else {
			System.out.println("Umur valid");
		}
	}
	
	
	static void eksekusi() throws ArithmeticException, NullPointerException, NumberFormatException{
		throw new NullPointerException();
	}
	
	static void masKoswara() {
		try {
			String a = "aab";
			String b = "Budi";
			String c = null;
			
			System.out.println("Nama ke 1 = "+a);
			System.out.println("Nama ke 2 = "+b);
			System.out.println("Nama ke 3 = "+c);
			System.out.println("Gabung kata = "+c.concat(b));
		}
		catch(NullPointerException e) {
			System.out.println("Saya adalah null pointer exceptions");
		}
	}
	
	static void masKoswaraDua() {
		try {
			int data[] = {4,6,8,10,12};
			System.out.println(data[5]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
	
	
	//Uncheck Multiple Exception
	static void masKoswaraTiga() {
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch (ArithmeticException e) {
			System.out.println("Ini exception 1");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ini exception 2");
		}
		catch (Exception e) {
			System.out.println("Ini exception 3");
		}
	}
	
	
	//Try Bersarang
	static void masKoswaraEmpat() {
		try {
			try {
				System.out.println("Pembagian 0");
				int hasil = 1000/0;
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				System.out.println("Array null");
				int data[] = {4,6,8,10,12};
				System.out.println(data[5]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
//			System.out.println(e);
			System.out.println("Exception Parent");
		}
		
	}
	
	static void validasi() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan data usia : ");
		int usia = scan.nextInt();
		
		if(usia < 19) {
			throw new ArithmeticException("Belum cukup usia");
		}
		else {
			System.out.print("GAS UDEH MASUK CEPET!!");
		}
	}
	
}
