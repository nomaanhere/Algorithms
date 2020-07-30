/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {5,4,3,2,1};
		int n = arr.length;
		for(int i =0;i<n-1;i++){
		    int minIndex = i;
		    for(int j=i;j<n;j++){
		        if(arr[j]>arr[minIndex]){
		            minIndex=j;
		        }
		        int temp=arr[j];
		        arr[j]=arr[minIndex];
		        arr[minIndex] = temp;
		    }
		}
		for(int i: arr){
		    System.out.print(i+ " ");
		}
	}
}
