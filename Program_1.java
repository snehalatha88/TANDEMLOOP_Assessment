import java.util.Scanner;

class Program_1 {
    double a, b;
    String operation;
   Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
  }
  public double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    return Double.NaN;
                }
              default:
                System.out.println("Invalid operation!");
                return Double.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number b: ");
        double b = sc.nextDouble();
        sc.nextLine();         
       System.out.print("Enter operation: ");
        String operation = sc.nextLine();
        Program_1 prog1= new Program_1(a, b, operation);
        double result = prog1.calculate();
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}
