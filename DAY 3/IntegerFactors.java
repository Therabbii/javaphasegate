public class IntegerFactors{

	public static int factorOfNumber(int number){

	int num = 20;

	int factorCounter = 0;	
	int count = 1;

	while(count <= num){
		if(number % count == 0)
		factorCounter ++;
		count ++;

		}

	return factorCounter;


	}

}


