import java.util.*;
import java.lang.*;
import java.io.*;

public class Test {
	private int[] array;
    private int[] tempArray;
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
		Test sortArray = new Test();
		sortArray.sort(a);
		int j=0;
		while(j+1 < n){
			if(a[j] == a[j+1] && a[j]!=a[j+2]){
				j=j+2;
			}
			else {
				break;
			}
		}
		System.out.println(a[j] + " is the number " + j + " index in the sorted array");
	}
	
	public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempArray = new int[length];
        mergeSort(0, length - 1);
    }
 
    private void mergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
 
            mergeSort(lowerIndex, middle);
 
            mergeSort(middle + 1, higherIndex);
 
            merge(lowerIndex, middle, higherIndex);
        }
    }
 
    private void merge(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArray[i] >= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
 
    }
}