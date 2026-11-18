import java.util.Scanner;

public class TaskSix{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int average = 0;
	int count = 0;
	for(int counter = 1; counter <= 10; counter++){
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		if (userInput % 2 == 0){
		count ++;
		sum = sum + userInput;
		average = sum/count;
		}
	
	
	}
	System.out.print("The average of the even Scores are : " + average);
	
	
	}
}
