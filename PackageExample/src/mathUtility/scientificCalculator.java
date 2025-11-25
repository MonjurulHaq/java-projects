
package mathUtility;

// ScientificCalculator.java
public class scientificCalculator {

    // Basic arithmetic
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Power and root
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double value) {
        if (value < 0) {
            throw new ArithmeticException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(value);
    }

    // Trigonometric functions (input in radians)
    public double sin(double angle) {
        return Math.sin(angle);
    }

    public double cos(double angle) {
        return Math.cos(angle);
    }

    public double tan(double angle) {
        return Math.tan(angle);
    }

    // Logarithmic functions
    public double log(double value) {
        if (value <= 0) {
            throw new ArithmeticException("Logarithm of non-positive number is not allowed.");
        }
        return Math.log(value); // Natural log (base e)
    }

    public double log10(double value) {
        if (value <= 0) {
            throw new ArithmeticException("Logarithm of non-positive number is not allowed.");
        }
        return Math.log10(value); // Log base 10
    }

}