import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int score = 1; score <= 10; score++){
            System.out.println("Enter score " + score +": ");
            int myScore = input.nextInt();
            sum += myScore;
        }
        System.out.println("The total score is: " + sum);

    }
}
