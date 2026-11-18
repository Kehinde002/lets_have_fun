import java.util.Scanner;

public class TaskTen{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int average = 0;
	int count = 0;
	for(int counter = 1; counter <= 10; counter++){
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		if (userInput >= 0 && userInput <= 100){
		count ++;
		sum = sum + userInput;
		average = sum/count;
		}
	
	
	}
	System.out.println("The average of the valid Scores are : " + average);
	
	
	
	}
}
