package practice;

import java.util.Scanner;

public class Calculator {
	Scanner sc=new Scanner(System.in);
	
public void addition() {
	System.out.println("enter values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Adding"+a+"and"+b+"for finding addition"+(a+b));
}
public void subtraction() {
	System.out.println("enter values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("subtract"+a+"and"+b+"for finding differecnce"+(a-b));
	}
public void multiplication() {
	System.out.println("enter values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("multiply"+a+"and"+b+"for finding multiplication"+(a*b));
}
public void division() {
	System.out.println("enter values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("division"+a+"and"+b+"for finding division"+(a/b));
}
public void mod() {
	System.out.println("enter values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("mod"+a+"and"+b+"for finding remainder"+(a%b));
}
public void square() {
	System.out.println("enter values:");
	int a=sc.nextInt();
	
	System.out.println("square"+a+"for finding square"+(a*a));
			
	
}
}


