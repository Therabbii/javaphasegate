public class CharacterCountFunction{

	public static int wordCount(int counter){
	
	String word = "Banana";
	char letterToCheck = 'a';

	System.out.println("The word given is Banana.");
	System.out.println("The letter to check in the word is 'a'.");

	int count;
	counter = 0;
	for(count = 0; count < word.length(); count++){
		if(letterToCheck == word.charAt(count))
		counter++;
	}

		return counter;
	}
}

/*

}
public static void main(String[] arg){

String word = "Banana";
char letterToCheck = 'a';

int count;
int counter = 0;
	for(count = 0; count < word.length(); count++){
		if(letterToCheck == word.charAt(count))
		counter++;
	}
	System.out.printf("The character 'a' appears %d times in the word Banana." , counter);




		return null;
	}

}*/