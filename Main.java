import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t!=0)
		{
			int n = sc.nextInt();
			int c = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			//--------------------------------------------------
			
			Arrays.sort(arr);
		
		int low = 0;
		int high = arr[n-1]-arr[0];
		int ans = -1;
		while(low<=high)
		{
		    int mid = low+(high-low)/2;
		    boolean flag = check(mid,arr,c);
		  //  System.out.println(check(mid,arr,c));
		    if(flag==true)
		    {
		        ans = mid;
		      //  System.out.println(mid);
		        low = mid+1;
		    }else{
		        high = mid-1;
		    }
		}
	
	    System.out.println(ans);
			
			t--;
		}
	}
	public static boolean check(int target,int[]arr,int c)
	{
	   
	    int lastval = arr[0];
	    int count = 1;
	    for(int i=1;i<arr.length;i++)
	    {
	        if(arr[i]-lastval>=target)
	        {
	            lastval = arr[i];
	            count++;
	        }
	    }
	     //System.out.println(c+" "+count);
	    if(count>=c)
	    {
	        // System.out.println("yes true");
	        return true;
	    }
	    return false;
	}
	
	
	
	
	
}
