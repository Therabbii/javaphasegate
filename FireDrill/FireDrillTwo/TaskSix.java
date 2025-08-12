import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        int count = 0;
        for (int score = 1; score <= 10; score++) {
            System.out.println("Enter score " + score + ": ");
            int even = 0;
            int myScore = input.nextInt();
            if(myScore % 2 == even) {
                sum += myScore;
                count++;
            }

        }
        average = sum / count;
        System.out.println("The average score of even numbers: " + average);
    }
}
