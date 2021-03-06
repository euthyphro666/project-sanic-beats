package com.sanicbeats;

import java.io.IOException;
import java.lang.Math;


public class Runtime {
	
	
	public static void main(String[] args) throws IOException{
		try
		{
			System.out.println("Beginning Test...");
			//Create another class for any methods you want to test and call them from here.
			
			
//			System.out.println("\n\nTylers...");
//			TestTylers();
			System.out.println("\n\nTrevors...");
			TestTrevors();

			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			//Cleanup code if needed
			

			System.out.println();
			System.out.println("Test Complete.\nPress enter to exit.");
			System.in.read();
			
		}

	}

//	public static void TestTylers() {
//		int [] a = new int [10];
//			
//		for (int i = 0; i < a.length; i ++) {
//			a[i] = (int)(Math.random()*100);
//			System.out.print(a[i] + "  " );
//		}
//		
//		System.out.println();
//		
//		int [] b = Util.average(a,6);
//		
//		for (int i = 0; i < b.length; i ++) {
//			
//			System.out.print(b[i] + "  " );
//		}
//	}

	public static void TestTrevors() {
			
		byte[] testybytes = {120,120,67,34,2,35,40,4,120,4,67,34,2,35,40,4,120,4,67,34,2,35,40,4,120,4,67,34,2,35,40,4,120,4,67,34,2,35,40,4,120,4,67,34,2,35,40,4,120,4,67,34,2,35,40,4,120,4,67,34,2,35,40,4};
		//byte[] testybytes = {120,4,67,34,2,35,40,4};
//		System.out.println("nothing:");
//		transform5(testybytes);
//		System.out.println();
//		System.out.println("reverse:");
//		transform1Complex(testybytes);
//		System.out.println();
//		System.out.println("average2:");
//		transform2Complex(testybytes);
//		System.out.println();
//		System.out.println("average(5):");
//		transform3Complex(testybytes);
//		System.out.println();
//		System.out.println("random:");
//		transform4Complex(testybytes);

		ComplexNumber[] comps = FFT.iterativeFFT(testybytes);
		FFT.reverseIterativeFFT(comps);
	}
	
//#region With FFT
	//Tyler's method 1: reverse
	public static byte[] transform1Complex(byte[] bytes) {
		ComplexNumber[] comps = FFT.iterativeFFT(bytes);
		comps = ComplexUtil.reverse(comps);
		return FFT.reverseIterativeFFT(comps);
	}
	//Tyler's method 2: average of 2
	public static byte[] transform2Complex(byte[] bytes) {
		ComplexNumber[] comps = FFT.iterativeFFT(bytes);
		comps = ComplexUtil.average(comps,2);
		return FFT.reverseIterativeFFT(comps);
	}
	//Tyler's method 3: average of n(5)
	public static byte[] transform3Complex(byte[] bytes) {
		ComplexNumber[] comps = FFT.iterativeFFT(bytes);
		comps = ComplexUtil.average(comps, 10);		
		return FFT.reverseIterativeFFT(comps);
	}
	//Tyler's method 4: random
	public static byte[] transform4Complex(byte[] bytes) {
		ComplexNumber[] comps = FFT.iterativeFFT(bytes);
		comps = ComplexUtil.random(comps);
		return FFT.reverseIterativeFFT(comps);
	}

//#endregion

//#region Without FFT
	//Tyler's method 1: reverse
	public static byte[] transform1(byte[] bytes) {
		return Util.reverse(bytes);
	}
	//Tyler's method 2: average of 2
	public static byte[] transform2(byte[] bytes) {
		return Util.average(bytes, 2);
	}
	//Tyler's method 3: average of n(100)
	public static byte[] transform3(byte[] bytes) {
		return Util.average(bytes, 10);		
	}
	//Tyler's method 4: random
	public static byte[] transform4(byte[] bytes) {
		return Util.random(bytes);
	}

//#endregion

}
