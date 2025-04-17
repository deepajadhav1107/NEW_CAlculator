import java.util.Scanner;

public class calculator extends ExtendedArithmeticOperation {

    public static float addition(float op1, float op2) {
        return op1 + op2;
    }

    public static float subtraction(float op1, float op2) {
        return op1 - op2;
    }

    public static float multiplication(float op1, float op2) {
        return op1 * op2;
    }

    public static float division(float op1, float op2) {
        if (op2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return op1 / op2;
    }

    public static double squareRoot(float num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:\n");

        float num1 = 20; // in.nextFloat();
        float num2 = 30; // in.nextFloat();

        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction: " + subtraction(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));
        System.out.println("Division: " + division(num1, num2));
        System.out.println("Square Root of num1: " + squareRoot(num1));

        in.close();
    }
}
