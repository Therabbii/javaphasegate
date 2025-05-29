import java.util.Arrays;
public class TwoDimensionalArray{

	public static void main(String[] args){

	int[][] num = new int[3][3];
	num[0] = new int[3];
		num[0][0] = 1; 	
		num[0][1] = 2; 	
		num[0][2] = 3; 	
	num[1] = new int[3];
		num[1][0] = 4; 	
		num[1][1] = 5; 	
		num[1][2] = 6; 	
	num[2] = new int[3];
		num[2][0] = 7; 	
		num[2][1] = 8; 	
		num[2][2] = 9; 	


	for(int i = 0; i < num.length; i++){
		System.out.println(Arrays.toString(num[i]));
	}
	
	int[][] rotate = new int[3][3];

	rotate[0] = new int[3];
		rotate[0][0] = num[2][0];
		rotate[0][1] = num[1][0];
		rotate[0][2] = num[0][0];
	rotate[1] = new int[3];
		rotate[1][0] = num[2][1];
		rotate[1][1] = num[1][1];
		rotate[1][2] = num[0][1];
	rotate[2] = new int[3];
		rotate[2][0] = num[2][2];
		rotate[2][1] = num[1][2];
		rotate[2][2] = num[0][2];

	System.out.println("The rotation of the matrix is: ");

	for(int j = 0; j < rotate.length; j++){
		System.out.println(Arrays.toString(rotate[j]));
	}


	}

}