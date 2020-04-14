import java.util.Scanner;

public class CompletingIfElse {
    public static void main(String[] args) {
        int number = 10;
        int inputNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputNumber = input.nextInt();


        if (inputNumber > number) {
            System.out.println("Number is greater than " + number + ".");
        }
        else if (inputNumber < number){
            System.out.println("Number is less than " + number + ".");
        } else {
            System.out.println("Number is equal to " + number + ".");
        }

        System.out.println("Application finished.");
    }
}
