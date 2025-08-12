import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        for(int score = 1; score <= 10; score++){
            System.out.println("Enter score " + score +": ");
            int myScore = input.nextInt();
            sum += myScore;
        }
        average = sum/10;
        System.out.println("The total score is: " + sum);
        System.out.println("The average score is: " + average);

    }

}
