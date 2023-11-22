package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double real;
        double dollar;

        System.out.println("What is the dollar price? ");
        real = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        dollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.valueReal(dollar, real));


    }
}
