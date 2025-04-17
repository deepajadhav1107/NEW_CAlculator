import java.util.Scanner;

public class calculator extends ExtendedArithmeticOperation{

    public static float addition(float op1,float op2)
    {
        return op1 + op2;
    }

    public static float substraction(float op1,float op2)
    {
        return op1 - op2;
    }
    public static float multiplication(float op1,float op2)
    {
        return op1 * op2;
    }
    public static float division(float op1,float op2)
    {
        return op1 / op2;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number\n");

        // The code `float num1 = in.nextFloat();` and `float num2 = in.nextFloat();` is used to read
        // two floating-point numbers from the user's input. The `in.nextFloat()` method reads the next
        // float value entered by the user and assigns it to the variables `num1` and `num2`
        // respectively.

        // commenting user input to run jenkins job 
        float num1 = 20;//in.nextFloat();
        float num2 = 30;//in.nextFloat();

        System.out.println("Addition of Two number:"+addition(num1, num2));
        System.out.println(" Subtration of Two number:"+substraction(num1, num2));
        System.out.println("Multiplication of Two number:"+multiplication(num1, num2));
        System.out.println("Division of Two number:"+division(num1, num2));
        System.out.println("Square Root of number:"+SquareRoot(num1));




    }
    
    
}