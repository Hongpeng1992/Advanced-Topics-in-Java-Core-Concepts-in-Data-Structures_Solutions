public class FractionClient{

    public static void main(String[] args)  {
        Fraction fraction1 = new Fraction(-1, 2);
        Fraction fraction2 = new Fraction(1, 4);

        System.out.println("Original fractions:");
        System.out.println("fraction1: " + fraction1);
        System.out.println("fraction2: " + fraction2);

        System.out.println();

        System.out.println("The sum of (fraction1 + fraction2): " + fraction1.add(fraction2));
        System.out.println("The subtraction of (fraction1 - fraction2): " + fraction1.subtract(fraction2));
        System.out.println("The multiplication of (fraction1 * fraction2): " + fraction1.multiply(fraction2));
        System.out.println("The division of (fraction1 / fraction2: " + fraction1.divide(fraction2));
    }
}