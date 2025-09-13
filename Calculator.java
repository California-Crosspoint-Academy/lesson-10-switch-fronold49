import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        double num1 = sc.nextDouble();

        System.out.print("Second number: ");
        double num2 = sc.nextDouble();

        System.out.print("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide?\nChoose an option: ");
        int operation = sc.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("bro what only: Add, Subtract, Multiply, or Divide");
                return;
        }

        System.out.println("Result: " + result);
    }
}
