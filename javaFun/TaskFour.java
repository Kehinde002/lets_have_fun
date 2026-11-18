import java.util.Scanner;

public class TaskFour{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	for(int counter = 1; counter <= 10; counter++){
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		if(counter % 2 ==0){
			sum = sum + userInput;
		}
			
	
	}
	System.out.print("The sum of the even index Scores are : " + sum);
	
	
	}
}
