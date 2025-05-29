import java.util.Scanner;

public static int LocateLargest(int[] numbers){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter the array size: ");
	int size = scanner.nextInt();

	int[] numbers = new int[size];

	System.out.println("Enter the elements of your array: ");
	
	for (int i = 0; i < size; i++){
		System.out.print("Element " + (i + 1) + ":" );
		numbers[i] = scanner.nextInt();
		}
 	System.out.println(Arrays.toString(numbers));
	
	int largest = numbers[0];
	
	for(int index = 0; index < numbers.length; index++){
		if(numbers[index] > largest)
		largest = numbers[index];
	}

	return Largest;
}