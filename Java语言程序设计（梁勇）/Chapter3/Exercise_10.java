package Chapter3;
import java.util.*;
public class Exercise_10 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (number1 + number2 == answer)
            System.out.print("You are correct!");
        else
            System.out.print( "Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));
    }
}
