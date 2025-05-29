public class IntegerArray{

	public static void main(String[] args){

	int[] numArray = {1 , 2 , 3 , 2};
	
	int count = 0;
	int sumOfUnique = 0;

		for(int i = 0; i < numArray.length; i++){
		
			//System.out.print(numArray[0] , numArray[2]);
		
			sumOfUnique = numArray[0] + numArray[2];

		}
	System.out.printf("The unique numbers are [" + numArray[0] + "," + numArray[2] + "] and the sum is " + sumOfUnique); 

	int[] numArray2 = {1 , 1 , 1 , 1 , 1};
	
	int count2 = 0;
	int sumOfUnique2 = 0;

		for(int j = 0; j < numArray2.length; j++){
		
			//System.out.print(numArray[0] , numArray[2]);
		
			//sumOfUnique = numArray[0] + numArray[2];

		}
	System.out.printf("\nThere are unique numbers in the array"); 

	}


}