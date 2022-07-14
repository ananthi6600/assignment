package MahashSanAssignment;

public class FinonacciPrime {

	public static void main(String[] args) {
		long  firstTenPrimeNumber = 0, temp = 1, temp1 = 2, temp3;
		
		while (firstTenPrimeNumber != 10) {

			temp3 = temp + temp1;
			temp = temp1;
			temp1 = temp3;
			int flag = 0;
			for (int j = 2; j < temp3 / 2; j++) {
				if (temp3 % j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(temp3);
				
				firstTenPrimeNumber++;
				
			}
		}

	}
}
