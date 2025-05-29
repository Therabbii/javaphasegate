public class LetterIndexAppearance{

	public static void main(String[] args){

	String[] num = {"1" , "2" , "1" ,"0"};

	for(int count = 0; count < num.length; count++){
		System.out.println(num[count]);
		for(int frequency = 0; frequency < num.length; frequency++){
			if(count == frequency){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
				}

		}

	}

	}

}