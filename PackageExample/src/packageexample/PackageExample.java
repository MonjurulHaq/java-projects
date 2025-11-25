package packageexample;

import mathUtility.scientificCalculator;
import mypackage.Account;

public class PackageExample {

    public static void main(String[] args) {
        Account ob = new Account();
        scientificCalculator calc = new scientificCalculator();
        ob.deposit(14000.00);
        ob.showBalance();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(10, 2));
        System.out.println("Power: " + calc.power(2, 3));
        System.out.println("Square Root: " + calc.squareRoot(16));
        System.out.println("Sine(π/2): " + calc.sin(Math.PI / 2));
        System.out.println("Cosine(π): " + calc.cos(Math.PI));
        System.out.println("Tangent(π/4): " + calc.tan(Math.PI / 4));
        System.out.println("Natural Log: " + calc.log(Math.E));
        System.out.println("Log base 10: " + calc.log10(100));
    }
    
}
