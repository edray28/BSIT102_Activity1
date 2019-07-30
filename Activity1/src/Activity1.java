import java.util.Scanner;
public class Activity1 {
	
	public static void main (String []args) throws Exception {
		Scanner input =new Scanner (System.in);
		int x;
		System.out.println("Enter 1st Num");
		x=input.nextInt();
		int y;
		System.out.println("Enter 2nd Num");
		y=input.nextInt();
		int sum = x+y;
		int diff =x-y;
		int pro = x*y;
		int quo = x/y;
		System.out.println("The Sum of your answer is " +sum +"\nThe Difference of your answer is " +diff +"\nThe Pro of your answer is " +pro +"\nThe quo of your answer is " +quo);
	}
}