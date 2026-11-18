import java.util.Scanner;

public class TaskEight{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	
	
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();
		if (userInput > 0 && userInput <=100){
		  		  for(int counter = 1; counter <= 10; counter++){
		            System.out.print("Enter a number: ");
		            userInput = input.nextInt(); 
		            sum = sum + userInput;
		}
		
		}
		else if(userInput < 0 && userInput > 100){
		    System.out.print("You did not enter a valid number");
		}    
		  
		
		

	
	System.out.println("The sum of the  valid Scores are : " + sum);
	}
}
	
	
	
	
	
