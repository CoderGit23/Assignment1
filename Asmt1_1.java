package iNeuroAsmt1;

public class Asmt1_1 {

	//Task 1 – Write a program to swap two number. 
	//For example a=10 and b=20 output should be a=20 and b=10
	
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before Swap : "+ "a = "+a+", b = "+b );

		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swap : "+ "a = "+a+", b = "+b );
		
	}

}
