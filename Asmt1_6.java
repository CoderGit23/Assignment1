package iNeuroAsmt1;

public class Asmt1_6 {

	//Task 6- Write a program to print all prime numbers from 1-1000

	public static void main(String[] args) {

		int count=0;
		for(int val=2;val<=1000;val++)
		{
			boolean flag = true;
			for(int j=2;j<=val/2;j++) {
				if( (val%j) == 0) {
					flag = false;
					break;							
				}
			}
			if(flag) {
				count++;
				System.out.print(val+",");
		}
		
	}
		System.out.println("  ");
		System.out.println("Total Prime numbers from 1 to 1000 : "+ count);
	}
}
