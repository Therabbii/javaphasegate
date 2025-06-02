public class IntegerFactors{

	public static int factorOfNumber(int number){

	int num = 20;

	int factorCounter = 0;	
	int count = 1;

	while(count <= num){
		if(number % count == 0)
	
		factorCounter ++;
		count ++;
		int[] factors = new int[count];
		for(int counter = 0; counter < factors.length; counter++){
			System.out.print("Element " + (counter + 1) + ":" );
			numbers[counter] = scanner.nextInt();
		}
 			System.out.println(Arrays.toString(numbers))
		
		}

		}
	
	return factorCounter;


	}

}


