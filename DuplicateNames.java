package duplicateElemtOperations;

import java.util.Scanner;

public class DuplicateNames 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = s.nextInt();
		String arr[] = new String [size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.next();
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(arr[j].equals(arr[i]))
					System.out.println(arr[j]);
			}
		}
	}
}
