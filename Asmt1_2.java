package iNeuroAsmt1;

public class Asmt1_2 {

	//Task 2-  Write a program to print the sum of below 5 numbers.
	//10,90.78,111,8989,7876

	public static void main(String[] args) {
		
		double []arr = new double[5]; 
		arr[0] = 10;
		arr[1] = 90.78;
		arr[2] = 111;
		arr[3] = 8989;
		arr[4] = 7876;
		
		double sum = 0.0;
		
		for(double val:arr) {
			sum= sum+val;
		}
		System.out.println("Sum : "+sum);
	}

}
