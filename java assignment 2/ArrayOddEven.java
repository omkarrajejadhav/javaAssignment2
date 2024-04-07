package javaassignmentclassroom;

import java.util.Scanner;

public class ArrayOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[],size,odd=0,even=0;
		System.out.println("enter the size of array");
		size=sc.nextInt();
	
		arr=new int[size];
		System.out.println("enter the array");
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    
	    for(int i=0;i<size;i++) {
	    	if(arr[i]%2==0)
	    		even++;
	    	else
	    		odd++;
	    }
	    for(int i=0;i<size;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
	    System.out.println("\ncount of even number in arr:"+even+"\ncount of odd number in arr:"+odd);
	}

}
