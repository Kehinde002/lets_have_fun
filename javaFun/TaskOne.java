import java.util.Scanner;

public class TaskOne{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	for(int counter = 1; counter <= 10; counter++){
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		sum = sum + userInput;
	}
	System.out.print("The sum of the ten Scores are : " + sum);
	
	}
}
