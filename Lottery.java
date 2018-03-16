import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int lottery = random.nextInt(100);
        final int a = lottery / 10;
        final int b = lottery % 10;

        System.out.println("Enter your first digit: ");
        int first = input.nextByte();
        System.out.println("Enter your second digit: ");
        int second = input.nextByte();

        int reward;
        if (first == a) {
            if (second == b) reward = 10000;
            else reward = 1000;
        }
        else {
            if (first == b) {
                if (second == a) reward = 3000;
                else reward = 1000;
            }
            else {
                if (second == a || second == b) reward = 1000;
                else reward = 0;
            }
        }
        System.out.println("Your reward is: " + reward);
        System.out.println("Special reward number is: "+ lottery);
    }
}
