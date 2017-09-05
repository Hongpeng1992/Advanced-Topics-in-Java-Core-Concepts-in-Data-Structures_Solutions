public class FractionClient implements Cloneable{

    public static void main(String[] args)  {
        Fraction fraction1 = new Fraction(-1, 2);
        Fraction fraction2 = new Fraction(1, -4);

        System.out.println(fraction1.add(fraction2));
    }
}