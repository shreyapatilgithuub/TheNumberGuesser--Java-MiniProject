//Mini Project
//Guess the number challenge
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int MyNumber = (int) (Math.random() * 100);
        int UserNumber = 0;

        do {
            System.out.print("Enter your Number(1 - 100): ");
            UserNumber = sc.nextInt();

            if (UserNumber == MyNumber) {
                System.out.println("Wooohooo...You got it right!");
                break;
            }
            else if (UserNumber > MyNumber) {
                System.out.println("Your number is larger");
            }
            else {
                System.out.println("Your number is smaller");
            }
        } while (UserNumber >= 0);
        System.out.print("The number was: ");
        System.out.println(MyNumber);
    }
}