import java.util.Scanner;

public class BasicSearch {

	
	 static int searchNumber(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				return i;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a= {11,12,32,5,21,76,44,30,99};
		int n=a.length;
		System.out.println("Size of array: "+n);
		
		for (int i = 0; i < n; i++) 
		{
			System.out.print("a["+i+"]= "+a[i]+", ");		
		}
		System.out.println("\nEnter element to be searched for: ");
		int b=sc.nextInt();
		System.out.println(b+" found at "+searchNumber(a,b));
		
		
		

	}

}
