import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double result = 0;

    System.out.println("Welcome to my calculator!");
    System.out.println("Operators: + - * / % sqrt pow");
    System.out.println("Type 'Exit' to quit");

    while (true) {
        System.out.print("\nEnter Operator: ");
        String operator = scanner.next();

        if (operator.equals("Exit")) {
            System.out.println("Goodbye!");
            break;
        }

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        double num2 = 0;
        if (!operator.equals("sqrt")) {
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
        }
        

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    result = num1 / num2;
                }
                break;
            case "%":
                result = num1 % num2;
                break;
            case "sqrt":
                result = Math.sqrt(num1);
                break;
            case "pow":
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Invaild Operator, Please try again!");
                break;
            
        }
        System.out.println("Result: " + result);
 
    }
    scanner.close();

  }
}
