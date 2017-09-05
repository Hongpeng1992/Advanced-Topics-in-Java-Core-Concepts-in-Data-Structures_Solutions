/**
 * Created by DmytroW on 05.09.2017.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0)
            throw new IllegalArgumentException("Denominator can't be equal to 0, denominator=" + denominator);
        else if(denominator < 0){
            numerator = -numerator;
            this.denominator = -denominator;
        }
        else this.denominator = denominator;
    }

    public Fraction add(Fraction another){
        return performOperation(another, Operation.ADDITION);
    }

    public Fraction subtract(Fraction another){
        return performOperation(another, Operation.SUBTRACTION);
    }

    public Fraction multiply(Fraction another){
        return performOperation(another, Operation.MULTIPLICATION);
    }

    public Fraction divide(Fraction another){
        return another.multiply(this);
    }

    private Fraction performOperation(Fraction another, Operation operation){
        int highestCommonFactor = getHighestCommonFactor(another);

        int leftNumerator = (another.denominator / highestCommonFactor) * this.numerator;
        int rightNumerator = (this.denominator / highestCommonFactor) * another.numerator;

        int numerator = 0;
        switch (operation){
            case ADDITION:
                numerator = leftNumerator + rightNumerator;
                break;
            case SUBTRACTION:
                numerator = leftNumerator - rightNumerator;
                break;
            case MULTIPLICATION:
                numerator = leftNumerator * rightNumerator;
                break;
        }
        assert numerator != 0;

        int denominator = this.denominator > another.denominator ? this.denominator : another.denominator;

        return new Fraction(numerator, denominator);
    }

    public int getHighestCommonFactor(Fraction another){
        int[] factorsOfThis = getFactors();
        int[] factorsOfAnother = another.getFactors();

        int highestCommonFactor = 1;

        int i = factorsOfThis.length - 1, j = factorsOfAnother.length - 1;
        do{
            if(factorsOfThis[i] == factorsOfAnother[j]) {
                highestCommonFactor = factorsOfThis[i];
                break;
            }
            else if(factorsOfThis[i] > factorsOfAnother[j]){
                if(i > 0)
                    i--;
            }
            else{
                if(j > 0)
                    j--;
            }
        }while(i >= 0 && j >= 0);

        return highestCommonFactor;
    }

    private int[] getFactors(){
        int[] factors = new int[getFactorsCount()];
        for(int i = 1, j = 0; i <= this.denominator; i++){
            if(this.denominator % i == 0)
                factors[j++] = i;
        }
        return factors;
    }

    private int getFactorsCount(){
        int count = 0;
        for(int i = 1; i <= this.denominator; i++){
            if(this.denominator % i == 0)
                count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}