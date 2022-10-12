package iNeuroAsmt1;

public class Asmt1_3 {
	
	//Task 3-  Write a program to print the average of below 5 numbers.
	//10,90.78,111,8989,7876


	public static void main(String[] args) {

		double arr[]= {10,90.78,111,8989,7876};
		int length = arr.length;
		System.out.println("Array length : "+length);
		double sum=0.0;
		for(double val:arr) {
			sum = sum +val;			
		}
		System.out.println("Sum is "+sum+" and average is "+ sum/length);

}
}
