import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

    public static void main(String[] args) {

        // Test to see if the correct number of arguments is provided
        if (args.length != 2) {
            System.out.println("Error: Please provide an amount and a currency type to convert.");
            System.out.println("Example: java CurrencyConverter 100 dollars");
            System.exit(1); // Exit with an error status code
        }

        double amount;
        try {
            amount = Double.parseDouble(args[0]); // Check if the first argument is a valid number
        } catch (NumberFormatException e) {
            System.out.println("Error: The first argument must be a numeric amount.");
            System.exit(1);
            return;
        }

        String currency = args[1];
        DecimalFormat f = new DecimalFormat("##.##");

        // For amounts Conversion
        switch (currency.toLowerCase()) { // Convert input to lowercase
            case "dollars":
                // For Dollar Conversion
                double pound = amount * 0.74;
                System.out.println(amount + " Dollars = " + f.format(pound) + " Pounds");
                double euro = amount * 0.88;
                System.out.println(amount + " Dollars = " + f.format(euro) + " Euros");
                break;
            case "pounds":
                // For Pound Conversion
                double dollar = amount * 1.36;
                System.out.println(amount + " Pounds = " + f.format(dollar) + " Dollars");
                euro = amount * 1.19;
                System.out.println(amount + " Pounds = " + f.format(euro) + " Euros");
                break;
            case "euros":
                // For Euro Conversion
                dollar = amount * 1.13;
                System.out.println(amount + " Euros = " + f.format(dollar) + " Dollars");
                pound = amount * 0.84;
                System.out.println(amount + " Euros = " + f.format(pound) + " Pounds");
                break;
            default:
                System.out.println("Invalid currency type");
                break;
        }
        System.out.println("Thank you for using the converter.");
    }
}

