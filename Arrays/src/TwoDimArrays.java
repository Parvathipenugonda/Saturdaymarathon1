import java.util.Scanner;

public class TwoDimArrays {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter number of games:");
	int [][]arr=new int[scan.nextInt()][];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter games of players"+i);
		arr[i]=new int[scan.nextInt()];
		
	}
	
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("enter game "+i+" player score is "+j);
			arr[i][j]=scan.nextInt();
		}
	}
	System.out.println("array contents are:");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
