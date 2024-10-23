import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {

    @Test
    public void testNoArguments() {
        String[] args = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CurrencyConverter.main(args);
        });
        assertEquals("Error: Please provide an amount and a currency type.", exception.getMessage());
    }

    @Test
    public void testInvalidAmount() {
        String[] args = {"abc", "dollars"};
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            CurrencyConverter.main(args);
        });
        assertTrue(exception.getMessage().contains("For input string:"));
    }
} // Test checks if the program throws an illegal Argument Exception when no arguements pass. Verfies the message contains an error
// TestInvalidAmount test checks if a NumberFormatException happens when the numbre isn't in numerics
