package iNeuroAsmt1;

public class Asmt1_4and5 {

	//Task 4- Write a program to print all even numbers from 1-200

	public static void main(String[] args) {
		
		System.out.println("Even Numbers");
		for(int i=1;i<=200;i++)
		{
			if( (i%2) ==0)
				System.out.print(i+",");
		}
		System.out.println(" ");
		
//		Task 5- Write a program to print all odd numbers from 1-50

		System.out.println("Odd Numbers");
		for(int i=1;i<=50;i++)
		{
			if( (i%2) !=0)
				System.out.print(i+",");
		}
		
	}

}
