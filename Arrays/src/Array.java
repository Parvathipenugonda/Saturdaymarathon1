import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean arr[]=new boolean[n];
		System.out.println("enter array elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("is person"+i+"married");
			 arr[i]= scan.nextBoolean();
		}
		System.out.println("results are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			 System.out.print(arr[i]+" ");
		}
	}

}
