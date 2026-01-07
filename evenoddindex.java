import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE SIZE OF AN ARRAY:");
		int n=sc.nextInt();
		
		int even_sum=0;
		int odd_sum=0;
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    
		    if(i%2==0)
		    {
		        even_sum=even_sum+a[i];
		    }
		    else{
		        odd_sum=odd_sum+a[i];
		    }
		}
		
		System.out.println("RESULT="+(odd_sum-even_sum));
		
	}
}
