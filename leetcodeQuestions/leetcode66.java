package test;

import java.math.BigInteger;

public class cla {
	   static int count =0;
	    public  static int[] plusOne(int[] nums) {
	       
	    StringBuilder sb = new StringBuilder("");
	    for(int i=0 ;i<nums.length;i++)
	    {
	        sb.append(nums[i]+"");
	    }
	    BigInteger bg = new BigInteger(sb+"");
	    BigInteger bg1= new BigInteger("1");
	       String s= (bg.add(bg1))+"";
	      System.out.println("s is "+s);

	     int arr[] = new int [s.length()];
	     for( int i=0 ; i< s.length();i++){
	        arr[i]=((int)s.charAt(i))-48;
	     }
	     return arr;
	        
	    }
	    public static void main(String[] args) {
	    int[] arr= {9,9,9};
	      int brr[]=  plusOne(arr);
	    for(int i : brr) {
	    	System.out.print(i+" ");
	    }
			
		}

}
