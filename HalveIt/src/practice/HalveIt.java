package practice;

import java.util.Scanner;

public class HalveIt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		System.out.println(halveTheNumber(num));
	}
	public static double halveTheNumber(double num) {
		return num/2;
	}
	
}
