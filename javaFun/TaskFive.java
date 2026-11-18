import java.util.Scanner;

public class TaskFive{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int average = 0;
	int count = 10;
	for(int counter = 1; counter <= 10; counter++){
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		if (userInput % 2 == 0){
		sum = sum + userInput;
		}
	
	
	}
	System.out.print("The sum of the ten even Scores are : " + sum);
	
	
	}
}

