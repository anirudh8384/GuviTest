import java.util.*;
import java.lang.*;
import java.io.*;


public class Test {
    private int[] array ;
	private int length;
	
	public static void main(String[] args) {
		int counter =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter number of elements in array");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Test simIndex = new Test();
		simIndex.findIndex(a,n);
		
	}
	
	public void findIndex(int[] a, int n){
	    this.array = a;
		this.length = n;
		for(int k=0;k<n;k++){
			if(a[k]==k){
				System.out.println(a[k]+" is the number with index" + k + " ");
			}	
		}
	
	}
	
}