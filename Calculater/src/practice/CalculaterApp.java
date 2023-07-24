package practice;

import java.util.Scanner;

public class CalculaterApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Calculator c=new Calculator();
	System.out.println("Hello welcome to kodnest calculator");
    
	while(true)
	{
		System.out.println("'+'====>for addition");
		System.out.println("'-'====> subration");
		System.out.println("'*'====> multiplication");
		System.out.println("'/'====> division");
		System.out.println("'%'====> mod");
		System.out.println("'^'====> square");
		System.out.println("'!'====> to stop");
		System.out.println("enter your choice:");
		char ch=sc.next().charAt(0);
	switch(ch) {
	case '+':
		c.addition();break;
	case '-':
		c.subtraction();break;
	case '*':
		c.multiplication();break;
	case'/':
		c.division();break;
	case'%':
		c.mod();break;
	case'^':
		c.square();break;
	case'!':
		System.out.println("stop");break; 
	default:
		System.out.println("bye bye!");
			
		
	}
	}
}
}
