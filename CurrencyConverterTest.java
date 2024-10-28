public class CurrencyConverterTest {

    public static void main(String[] args) {
        // Test: No Arguments Provided
        System.out.println("Test Case 1: No Arguments Provided");
        String[] noArgs = {};
        try {
            CurrencyConverter.main(noArgs);
        } catch (Exception e) {
            System.out.println("Handled error: " + e.getMessage());
        }

        // Test: Invalid Number Format
        System.out.println("Test Case 2: Invalid Number Format");
        String[] invalidNumber = {"abc", "dollars"};
        try {
            CurrencyConverter.main(invalidNumber);
        } catch (Exception e) {
            System.out.println("Handled error: " + e.getMessage());
        }

        // Test: Valid Conversion - Lowercase
        System.out.println("Test Case 3: Valid Conversion - Lowercase");
        String[] validInputLower = {"100", "dollars"};
        try {
            CurrencyConverter.main(validInputLower);
        } catch (Exception e) {
            System.out.println("Handled error: " + e.getMessage());
        }

        // Test: Valid Conversion - Uppercase
        System.out.println("Test Case 4: Valid Conversion - Uppercase");
        String[] validInputUpper = {"100", "DOLLARS"};
        try {
            CurrencyConverter.main(validInputUpper);
        } catch (Exception e) {
            System.out.println("Handled error: " + e.getMessage());
        }

        // Test: Valid Conversion - Capitalized
        System.out.println("Test Case 5: Valid Conversion - Capitalized");
        String[] validInputCap = {"100", "Dollars"};
        try {
            CurrencyConverter.main(validInputCap);
        } catch (Exception e) {
            System.out.println("Handled error: " + e.getMessage());
        }

        // Test: Valid Conversion - Pounds
        System.out.println("Test Case 6: Valid Conversion - Pounds");
        String[] validInputPounds = {"100", "pounds"};
        try {
            CurrencyConverter.main(validInputPounds);
        } catch (Exception e) {
            System.out.println("Handled error: " + e.getMessage());
        }

        // Test: Valid Conversion - Euros
        System.out.println("Test Case 7: Valid Conversion - Euros");
        String[] validInputEuros = {"100", "euros"};
        try {
            CurrencyConverter.main(validInputEuros);
        } catch (Exception e) {
            System.out.println("Handled error: " + e.getMessage());
        }
    }
}

