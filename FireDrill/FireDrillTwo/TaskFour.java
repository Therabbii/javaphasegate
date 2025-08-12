import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        for (int score = 1; score <= 10; score++) {
            System.out.println("Enter score " + score + ": ");
            int myScore = input.nextInt();
            if(score == 2 || score == 4 || score == 6 || score == 8 || score == 10) {
                sum += myScore;
            }

        }
        System.out.println("The total score of even indexes: " + sum);

    }
}
