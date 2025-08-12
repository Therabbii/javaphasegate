import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter 10 valid scores ranging from 0-100(decimals included): ");
        for (int score = 1; score <= 10; score++) {
            System.out.println("Enter score " + score + ": ");
            int myScore = input.nextInt();
            while (myScore < 0 || myScore > 100) {
                System.out.println("Invalid score range. Enter an integer between 0 and 100: ");
                System.out.println("Enter score " + score + ": ");
                myScore = input.nextInt();
            }
                sum += myScore;
            }
        System.out.println("The sum of numbers: " + sum);
    }
}
