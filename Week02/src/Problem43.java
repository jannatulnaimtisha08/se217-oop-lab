import java.util.Scanner;
public class Problem43{
    public static void main(String[] args) {
        double x, y;
        System.out.println("Please enter the value of x and y:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
        sc.close();
        double r1 = add(x, y);
        double r2 = subtract(x, y);
        double r3 = multiply(x, y);
        double r4 = divide(x, y);
        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);
    }
    static double add(double x, double y) {
        double result = x + y;
        return result;
    }
    static double subtract(double x, double y) {
        double result = x - y;
        return result;
    }
    static double multiply(double x, double y) {
        double result = x * y;
        return result;
    }
    static double divide(double x, double y) {
        double result = x / y;
        return result;
    }
}