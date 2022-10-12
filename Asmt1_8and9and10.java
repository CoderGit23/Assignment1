package iNeuroAsmt1;

public class Asmt1_8and9and10 {

	public static void main(String[] args) {

/*		Task 8- Write a program to print below students marks who have scored above 80
		Example- 88,12,89,55,35
		Output-  88,89
*/
		System.out.println("**********TASK - 8 *********");

		System.out.println("Marks above 80");
		int []marks = {88,12,89,55,35};
		for(int mark:marks) {
			if(mark>80) {
				System.out.println(mark);
			}
		}
		
/*
	Task 9- Write a program which will break the current execution if it find number 85
		Input – [12,34,66,85,900]
*/
		System.out.println("**********TASK - 9 *********");

		int []numbers = {12,34,66,85,900};
		for(int num:numbers) {
			if(num==85) {
				System.out.println("Found 85");
				break;
			}
			else
				System.out.println("number is : "+num);
		}
		
/*
	Task 10- Write a program which will break the current execution if it find “Selenium”
		Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
*/
		System.out.println("**********TASK - 10 *********");

		String []language = {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for(String lan:language) {
			if(lan.equals("Selenium")) {
				System.out.println("Found Selenium");
				break;
			}
			else
				System.out.println("Language is : "+lan);
		}
		
	}

}
