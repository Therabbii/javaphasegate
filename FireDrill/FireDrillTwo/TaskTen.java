import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double average;
        int count = 0;
        System.out.println("Enter 10 valid scores ranging from 0-100(decimals included): ");
        for (int score = 1; score <= 10; score++) {
            System.out.println("Enter score " + score + ": ");
            double myScore = input.nextDouble();
            if (myScore >= 0 && myScore <= 100) {
                sum += myScore;
                count++;
            }
        }
        average = sum / count;
        System.out.println("The average of valid numbers only: " + average);
    }
}
