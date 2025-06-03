import java.util.Scanner;
import java.util.Random;

public class SubtractRandom{

	public static int randomGenerator(){
	Random random = new Random();
	int number1 = random.nextInt(1 , 100);
	int number2 = random.nextInt(1 , 100);

	int subtraction = 0;

	
	if(number1 > number2){
		subtraction = number1 - number2;
	System.out.printf("%d - %d" , number1 , number2);
	}
	else if  (number1 < number2){
		int numberLow = number1;
		subtraction = number2 - numberLow;
	System.out.printf("%d - %d" , number2 , numberLow);
	}
	return subtraction;
}


public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;

for (int attempt = 1; attempt <= 10; attempt++){
	System.out.printf("Question [%d]:" , attempt);
	int equationAnswer = randomGenerator();
	System.out.println("\nWhat is the answer? ");
	int userInput = scanner.nextInt();
		if (userInput == equationAnswer){
		count++;
		}
		else if (userInput != equationAnswer){
		System.out.print("Incorrect. Second try: ");
		userInput = scanner.nextInt();
		}
}

	System.out.printf("==== You scored %d / 10 ====" , count);

}

}