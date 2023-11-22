package util;

public class CurrencyConverter {

    public static double valueReal(double dollar, double real) {
        double amount = real * dollar;
        double tax = amount * 0.06;

        return amount + tax;
    }

}
