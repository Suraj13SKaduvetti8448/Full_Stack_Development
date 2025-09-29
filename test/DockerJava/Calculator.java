import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose operation (+, -, *, /) or 'exit': ");
            String op = sc.next();
            if (op.equals("exit")) break;
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            switch (op) {
                case "+": System.out.println("Result: " + (a + b)); break;
                case "-": System.out.println("Result: " + (a - b)); break;
                case "*": System.out.println("Result: " + (a * b)); break;
                case "/": System.out.println("Result: " + (a / b)); break;
                default: System.out.println("Invalid operation");
            }
        }
        sc.close();
    }
}