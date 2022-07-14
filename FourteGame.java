package MahashSanAssignment;

import java.util.Scanner;

public class FourteGame {
	
	public int[] combination(int[] array, int index) {
		int swap=array[index];
		array[index]=array[index-1];
		array[index-1]=swap;
		return array;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***FOURTE***");
		System.out.println("ENter count of numbers");
		int number=sc.nextInt();
		System.out.println("Enter Numbers");
		int array[]=new int[number];
		//int index=number;
		for(int i=0;i<number;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter four Operators");
		char operators[]=new char[number];
		
		for(int j=0;j<number;j++) {
			operators[j]=sc.next().charAt(0);
		}
		System.out.println("Enter resultant value");
		int resultantValue=sc.nextInt(),total=0,terminate=0;
		
		for(int i=0;i<number*2;i++) {
			int index=number-1;
			for(int j=1;j<number;j++) {
			 array=new FourteGame().combination(array,index);
			 operators=new FourteGame().charCombination(operators, index);
			 for(int p=0;p<number-1;p++) {
				  total=0;
				 for(int q=0;q<number-1;q++) {
					 if(operators[q]=='*') {
						 total=array[p]*array[p+1];
					 }
					 if(operators[q]=='+') {
						 total=array[p]+array[p+1];
					 }
					 if(operators[q]=='-') {
						 total=array[p]-array[p+1];
					 }
				 }
			 }
			 if(total==resultantValue) {
				 terminate=1;
				for(int m=0;m<number;m++) {
					System.out.println(array[m]+operators[i]);
				}
				break;
			 }
			
			
				index--;
			
			
		}
		if(terminate==1) {
			break;
	
		}
		
	}
	}

	private char[] charCombination(char[] operators, int index) {
		char swap=operators[index];
		operators[index]=operators[index-1];
		operators[index-1]=swap;
		return operators;
	}

}
