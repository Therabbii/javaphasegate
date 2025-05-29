import java.util.Arrays;
public class TwoDimensionalArray2{

	public static void main(String[] args){

	int rowSize = input.nextInt();
	int columnSize = input.nextInt();

	int[][] num = new int[2][3];
	num[0] = new int[3];
		num[0][0] = 3; 	
		num[0][1] = 5; 	
		num[0][2] = 1; 	
	num[1] = new int[3];
		num[1][0] = 7; 	
		num[1][1] = 2; 	
		num[1][2] = 0; 	

	for(int i = 0; i < num.length; i++){
		System.out.println(Arrays.toString(num[i]));
	}


	int[][] rotate = new int[3][2];

	rotate[0] = new int[2];
		rotate[0][0] = num[1][0];
		rotate[0][1] = num[0][0];
	rotate[1] = new int[2];
		rotate[1][0] = num[1][1];
		rotate[1][1] = num[0][1];
	rotate[2] = new int[2];
		rotate[2][0] = num[1][2];
		rotate[2][1] = num[0][2];

	System.out.println("The rotation of the matrix is: ");

	for(int j = 0; j < rotate.length; j++){
		System.out.println(Arrays.toString(rotate[j]));
	}





	}

}
