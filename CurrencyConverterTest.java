public class CurrencyConverterTest {
    public static void main(String[] args) {
        // Test: No Arguments Provided
        System.out.println("Test Case 1: No Arguments Provided");
        String[] noArgs = {};
        CurrencyConverter.main(noArgs);

        // Test: Invalid Number Format
        System.out.println("Test Case 2: Invalid Number Format");
        String[] invalidNumber = {"abc", "dollars"};
        CurrencyConverter.main(invalidNumber);

        // Test: Valid Conversion
        System.out.println("Test Case 3: Valid Conversion");
        String[] validInput = {"100", "dollars"};
        CurrencyConverter.main(validInput);
    }
}
