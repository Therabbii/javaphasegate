import java.util.Scanner;
import java.util.ArrayList;

public class AtmOperation{


	public static double getBalance(double balance){
		balance = 0.0;
		return balance;
	}

	public static double withdrawalAmount(double balance , double amountToWithdraw){
		if (amountToWithdraw < balance){	
			balance = balance - amountToWithdraw - 100;
		}
	return balance;
	}


public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println ("Welcome to TimChoco Microfinance Bank!");
System.out.println("Enter your account balance(#100 and above): ");
double balance = scanner.nextDouble();

while (balance < 100){
	System.out.println("Enter an amount above #100: ");
	balance = scanner.nextDouble();
}

System.out.printf("Your current balance is #%.2f." , balance);

boolean program = true;
System.out.println("\n<><><><><><><><><><><><><><>");

ArrayList<Double> sumWithdrawal = new ArrayList<>();

while(program){

	String display= """
		What do you want to do?
	1. Make withdrawal
	2. Check transaction history
	3. Exit
		""";
	System.out.println(display);
	System.out.print("Make a selection: ");
	int userSelection = scanner.nextInt();
	

	switch (userSelection){
		case 1: 
			System.out.println("Enter amount to withdraw in multiples of #500 & #1000(Fixed charge of #100): ");
				double amountToWithdraw = scanner.nextDouble();
				sumWithdrawal.add(amountToWithdraw);
	
	
			System.out.println(sumWithdrawal);
			while(amountToWithdraw > balance){
				System.out.println("Insufficient funds. Enter an amount lesser than your balance: ");
					amountToWithdraw = scanner.nextDouble();
					sumWithdrawal.add(amountToWithdraw);
			}
			while(amountToWithdraw > 20000){
				System.out.println("You cannot withdraw above #20,000. Enter an amount lesser: ");
					amountToWithdraw = scanner.nextDouble();		
					sumWithdrawal.add(amountToWithdraw);

				while(amountToWithdraw > balance){
					System.out.println("Insufficient funds. Enter an amount lesser than your balance: ");
						amountToWithdraw = scanner.nextDouble();
						sumWithdrawal.add(amountToWithdraw);
				}
			}


















			while (amountToWithdraw % 500 != 0 && amountToWithdraw % 1000 != 0){
				System.out.println("Enter amount in multiples of #500 and #1000: ");
				amountToWithdraw = scanner.nextDouble();
				sumWithdrawal.add(amountToWithdraw);

				while(amountToWithdraw > balance){
					System.out.println("Insufficient funds. Enter an amount lesser than your balance: ");
						amountToWithdraw = scanner.nextDouble();
						sumWithdrawal.add(amountToWithdraw);
				}
			}


			balance = withdrawalAmount(balance , amountToWithdraw);
			System.out.println(sumWithdrawal);

			System.out.println("<><><><><><><><><><><><><><>");
			System.out.println("Transaction successful!");
			System.out.printf("You withdrew #%.2f." , amountToWithdraw);
			System.out.print("\nWithdrawal fee: #100"); 
			System.out.printf("\nYour balance is #%.2f." , balance);
			System.out.println("\n<><><><><><><><><><><><><><>");
			break;
		 
		case 2:
			System.out.println("You withdrew a total of);
			Sytem.out.println("
			
		case 3:
			program = false;
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Thank you for banking with us! For customer complaint, contact 09000011123.");		
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
	
	}


}	

}
		
}	
