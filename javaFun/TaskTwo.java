import java.util.Scanner;

public class TaskTwo{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	double average = 0;
	int count = 10;
	for(int counter = 1; counter <= 10; counter++){
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		sum = sum + userInput;
		average = sum/count;
	}
	
System.out.println("The average of the ten Scores are : " + average);
	
	
	
	}
}
