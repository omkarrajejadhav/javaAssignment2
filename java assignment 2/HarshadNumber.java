package javaassignmentclassroom;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		int n,temp,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
		r=n%10;
		sum+=r;
		n/=10;
		}
		
		if(temp%sum==0) {
			System.out.println(temp+" number is hardhad");
		}
		else  
            System.out.println(temp + " is not a harshad number");  
	}

}
