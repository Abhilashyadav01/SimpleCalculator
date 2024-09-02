import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double a = input.nextDouble();
        System.out.print("Enter the second number : ");
        double b = input.nextDouble();
        System.out.print("Enter the operation (+,-,*,or,/): "); 
        char op = input.next().charAt(0);
        if (op == '+') {
            System.out.println("The Addition of the two numbers is : "+(a+b));
        }
        else if (op == '-') {
            System.out.println("The Subtraction of the two numbers is : "+(a-b));
        }
        else if (op == '*') {
            System.out.println("The Multiplication of the two numbers is : "+(a*b));
        }
        else if (op == '/') {
            System.out.println("The Division of the two numbers is : "+(a/b));
        }
        else{
            System.out.println("Invalid operation");
        }
        input.close();
    }
    }
