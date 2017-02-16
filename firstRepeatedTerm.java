import java.util.*;
import java.lang.*;
import java.io.*;

public class Test {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter number of elements in array");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			if(a[i]<0)
				a[i]=a[i]*-1;
		}
	
		int i=0,j;
		int count=0;
		for(j=0;j<n;j++){
			for(i=j+1;i<n;i++){
				if(a[j]==a[i]){
					count++;
					break;
				}
				}
			if(count == 1){
				break;
			}
		}
		if(j==i){
			System.out.println("No repeated terms");
		}
		else
			System.out.println(a[j] + " is the number to be repeated first ");
	}