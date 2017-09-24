package IWVG.SwC.Chinegua.calculos;

public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean largerNumerator() {
        if (this.numerator > this.denominator) {
            return true;
        }
        return false;
    }

    public double multiplyFraction(Fraction fractionA, Fraction fractionB) {
        assert fractionA != null;
        assert fractionB != null;
        double resultadoNum =fractionA.getNumerator() * (double)fractionB.getNumerator();
        double resultadoDen =fractionA.getDenominator() * (double)fractionB.getDenominator();
        if (resultadoDen ==0) {
            throw new ArithmeticException("Divsion no permitia");
        }
        return resultadoNum/(double)resultadoDen;
    }

    public Fraction addFraction(Fraction f) {
        int num = this.getNumerator() * f.getDenominator() + f.getNumerator() * this.getDenominator();
        int den = this.getDenominator() * f.getDenominator();
        Fraction result = new Fraction(num, den);
        return result;
    }
}
