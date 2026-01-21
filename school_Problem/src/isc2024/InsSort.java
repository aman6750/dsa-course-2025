package isc2024;

import java.util.Scanner;

public class InsSort {
	
	int[] arr;
	int n;
	
	
	public InsSort(int s) {
		n=s;
		
	}
	
	public InsSort() {
		// TODO Auto-generated constructor stub
	}

	public void getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("enter the elements of array");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public void insertionSort(){
		
		for(int i=1; i<n; i++) {
			int curr = arr[i];
			int prev = i-1;
			
			while(prev>=0 && arr[prev]<curr) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			
			arr[prev+1] = curr;
			
		}
	}
	
	public double find() {
		
		int sum = 0;
		int c = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]%2==0) {
			sum+= arr[i];
			c++;
			}
		}
		
		double avg = (double)(sum/c);
		return avg;
	}
	
	public void display() {
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		System.out.println("average is :"+ find());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsSort obj = new InsSort();
		obj.getArray();
		obj.insertionSort();
		obj.find();
		obj.display();
		
	}

}
