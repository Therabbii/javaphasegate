import java.util.Arrays;
import java.util.Scanner;

public class FireDrillThree {
    public static void TaskOne(){
        Scanner input = new Scanner(System.in);
        int [] userArray = new int[10];
        for(int counter = 0; counter < userArray.length; counter++){
            System.out.print("Enter number " + (counter+1) + ": ");
            userArray[counter] = input.nextInt();
        }
        System.out.println(Arrays.toString(userArray));
    }
    public static void TaskTwo(){
        Scanner input = new Scanner(System.in);
        int [] userArray = new int[10];
        for(int counter = 0; counter < userArray.length; counter++){
            System.out.print("Enter number " + (counter+1) + ": ");
            userArray[counter] = input.nextInt();
        }
        for (int score : userArray) {
            System.out.println(score);
        }

    }

    public static void TaskThree(){
        Scanner input = new Scanner(System.in);
        int [] userArray = new int[10];
        for(int counter = 0; counter < userArray.length; counter++){
            System.out.print("Enter number " + (counter+1) + ": ");
            userArray[counter] = input.nextInt();
         }
        for (int score : userArray) {
            System.out.print(score);
        }

    }

    public static int[] TaskFour(int[] myArray) {
        int countEven = 0;
        int[] evenElements = null;
        for (int arrayElements : myArray) {
            if (arrayElements % 2 == 0) countEven++;
            evenElements = new int[countEven];
            Arrays.fill(evenElements, arrayElements);
        }
        //System.out.print(Arrays.toString(evenElements));
        return evenElements;
    }
}

