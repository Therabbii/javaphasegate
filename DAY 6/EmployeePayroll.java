import java.util.Scanner;
import java.util.ArrayList;


public class EmployeePayroll{

	public static double grossPay(double rate){
		
	int calculatedRate = 1;
	
		return 0;
	}

public static void main(String[] args){

	Scanner timmy = new Scanner(System.in);
	
	boolean program = true;

	System.out.println("Welcome to Semicolon Employee Payroll!");

	ArrayList<String> employeeName = new ArrayList<>();
	ArrayList<Integer> hoursWorkedList = new ArrayList<>();
	ArrayList<Double> payRateList = new ArrayList<>();
	ArrayList<Integer> federalRate = new ArrayList<>();
	ArrayList<Integer> stateRate = new ArrayList<>();





	String name;
	int hoursWorked;
	double payRate;
	int federalTaxRate;
	int stateTaxRate;
	double grossPay = 0;
	double federalTaxReduction = 0;
	double stateTaxReduction = 0;
	double totalDeduction;
	double netPay;
	double testState;
	double testFederal;

while(program){

	System.out.println("\n========================================");
	System.out.println("	1. Add employee Payroll");
	System.out.println("	2. View employee Payroll");
	System.out.println("	3. Update employee Payroll");
	System.out.println("	4. Exit");
	System.out.println("========================================");

	System.out.println();
	System.out.print("Enter 1-4: ");
	System.out.println();

	int userInput = timmy.nextInt();

	switch (userInput){
		case 1: 
			System.out.print("Enter Employee Name: ");
				name = timmy.next();
				employeeName.add(name);

			System.out.print("Enter number of hours worked in a week: ");
				hoursWorked = timmy.nextInt();
				hoursWorkedList.add(hoursWorked);
				while(hoursWorked > 40 && hoursWorked < 1){
					System.out.print("Hours worked cannot be above 40hrs or below 1hr: ");
					//hoursWorked = timmy.nextInt();
				}
			System.out.print("Enter hourly pay rate: ");
				payRate = timmy.nextDouble();
					payRateList.add(payRate);

			System.out.print("Enter the federal tax withholding rate: ");
				federalTaxRate = timmy.nextInt();
					federalRate.add(federalTaxRate);

			System.out.print("Enter the state tax withholding rate: ");
				stateTaxRate = timmy.nextInt();
					stateRate.add(stateTaxRate);

			System.out.println("\nEmployee payroll added ============>");

			System.out.println();

		break;

		case 2:
			
			if(employeeName.size() == 0){
			System.out.print("No employees addedd.");
			}

			else {

			System.out.print("Employee name: ");

			System.out.println(employeeName.get(0));

			System.out.printf("Hours worked: %d " , hoursWorkedList.get(0));
							
			System.out.printf("\nPay Rate:$%.2f " , payRateList.get(0));
			

			grossPay = hoursWorkedList.get(0) * payRateList.get(0);
			System.out.printf("\nGross Pay: $%.2f\n" , grossPay);

			testFederal = federalRate.get(0);
			testState = stateRate.get(0);
		
			federalTaxReduction += testFederal / 100 * grossPay;
			stateTaxReduction += testState / 100 * grossPay;



		System.out.println("\nDeductions: ");
			System.out.printf("   Federal withholding: $%.2f " , federalTaxReduction);
			System.out.printf("\n   State withholding: $%.2f " , stateTaxReduction);
	
			totalDeduction = federalTaxReduction + stateTaxReduction;

			System.out.printf("\n   Total Deduction: $%.2f " , totalDeduction);

			System.out.println();
		
			netPay = grossPay - totalDeduction;

		System.out.printf("\nNet Pay: $%.2f" , netPay);
//-----------------------------------------------------------------------------------

			System.out.println("\n========================================");

			System.out.print("\nEmployee name: ");

			System.out.println(employeeName.get(1));

			System.out.printf("Hours worked: %d " , hoursWorkedList.get(1));
							
			System.out.printf("\nPay Rate:$%.2f " , payRateList.get(1));
			

			grossPay = hoursWorkedList.get(1) * payRateList.get(1);
			System.out.printf("\nGross Pay: $%.2f\n" , grossPay);

			testFederal = federalRate.get(1);
			testState = stateRate.get(1);
		
			federalTaxReduction += testFederal / 100 * grossPay;
			stateTaxReduction += testState / 100 * grossPay;



		System.out.println("\nDeductions: ");
			System.out.printf("   Federal withholding: $%.2f " , federalTaxReduction);
			System.out.printf("\n   State withholding: $%.2f " , stateTaxReduction);
	
			totalDeduction = federalTaxReduction + stateTaxReduction;

			System.out.printf("\n   Total Deduction: $%.2f " , totalDeduction);

			System.out.println();
		
			netPay = grossPay - totalDeduction;

		System.out.printf("\nNet Pay: $%.2f" , netPay);

//-------------------------------------------------------------------------------------------

			System.out.println("\n========================================");
			
			System.out.print("\nEmployee name: ");

			System.out.println(employeeName.get(2));

			System.out.printf("Hours worked: %d " , hoursWorkedList.get(2));
							
			System.out.printf("\nPay Rate:$%.2f " , payRateList.get(2));
			

			grossPay = hoursWorkedList.get(2) * payRateList.get(2);
			System.out.printf("\nGross Pay: $%.2f\n" , grossPay);

			testFederal = federalRate.get(2);
			testState = stateRate.get(2);
		
			federalTaxReduction += testFederal / 100 * grossPay;
			stateTaxReduction += testState / 100 * grossPay;



		System.out.println("\nDeductions: ");
			System.out.printf("   Federal withholding: $%.2f " , federalTaxReduction);
			System.out.printf("\n   State withholding: $%.2f " , stateTaxReduction);
	
			totalDeduction = federalTaxReduction + stateTaxReduction;

			System.out.printf("\n   Total Deduction: $%.2f " , totalDeduction);

			System.out.println();
		
			netPay = grossPay - totalDeduction;

		System.out.printf("\nNet Pay: $%.2f" , netPay);
			}

		break;

		case 3:
			System.out.println("Update employee payroll.");
		break;
		case 4:
			System.out.println("Exiting Thank you!");
			program = false;
		break;
		default:
			System.out.println("Invalid input.");
		break;
	
	}
	

}


}

}