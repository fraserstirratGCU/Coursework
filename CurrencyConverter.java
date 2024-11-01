import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

    public static void main(String[] args) {
  import java.text.DecimalFormat;

public class CurrencyConverter {

    private static final double DOLLAR_TO_POUND = 0.74;
    private static final double DOLLAR_TO_EURO = 0.88;
    private static final double POUND_TO_DOLLAR = 1.36;
    private static final double POUND_TO_EURO = 1.19;
    private static final double EURO_TO_DOLLAR = 1.13;
    private static final double EURO_TO_POUND = 0.84;

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Please provide an amount and a currency type.");
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid amount provided.");
            return;
        }

        String currency = args[1].toLowerCase(); // Convert currency to lowercase
        convertCurrency(amount, currency);
        System.out.println("Thank you for using the converter.");
    }

    private static void convertCurrency(double amount, String currency) {
        DecimalFormat f = new DecimalFormat("##.##");
        switch (currency) {
            case "dollars":
                printConversion(amount, "Dollars", f.format(amount * DOLLAR_TO_POUND), "Pounds");
                printConversion(amount, "Dollars", f.format(amount * DOLLAR_TO_EURO), "Euros");
                break;
            case "pounds":
                printConversion(amount, "Pounds", f.format(amount * POUND_TO_DOLLAR), "Dollars");
                printConversion(amount, "Pounds", f.format(amount * POUND_TO_EURO), "Euros");
                break;
            case "euros":
                printConversion(amount, "Euros", f.format(amount * EURO_TO_DOLLAR), "Dollars");
                printConversion(amount, "Euros", f.format(amount * EURO_TO_POUND), "Pounds");
                break;
            default:
                System.out.println("Error: Wrong currency type.");
                break;
        }
    }

    private static void printConversion(double amount, String fromCurrency, String convertedAmount, String toCurrency) {
        System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
    }
}


