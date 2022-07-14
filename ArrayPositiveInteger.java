package MahashSanAssignment;

import java.util.Scanner;

public class ArrayPositiveInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter divisable number");
		int divisibleNumber=sc.nextInt();
		System.out.println("Enter Array Elememts");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i!=j) {
				if(array[i]<array[j]&&((array[i]+array[j])%divisibleNumber)==0) {
					System.out.println("["+array[i]+","+array[j]+"]");
				}
			}
		}
		}
		sc.close();
	}
}
