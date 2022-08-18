package Simple.Program;
/*@Ganesha c
 * java program to print common elements in two arrays  
 * */
import java.util.*;
import static java.lang.System.*;
public class SimilarElements {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		out.println("enter the size of an array");
		int n=sc.nextInt();// reading array size
		out.println("enter the array 1st  elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++) 	
		{
			 a[i]=sc.nextInt();//reading 1st array elements
		}
		out.println("enter the array 2nd  elements");
		int b[]=new int[n];
		for(int i=0;i<n;i++) 	
		{
			 b[i]=sc.nextInt();//reading 2nd array elements
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
		{
			if(a[i] == (b[j]))// comparing 2 array elements and print
			{
				out.println("common elements is "+a[i]);
			}
		
	
		}
		}
		sc.close();// closing scanner
	}

}
