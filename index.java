package TestPK;
import java.util.*;
public class Aman
{
	public static int removedup(int a[],int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		// unique element
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[n-1];
		for(int i=0;i<j;i++)
		{
			a[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[50];
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter element");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		size = removedup(a,size);
		System.out.println("After removing dublicate:");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}


