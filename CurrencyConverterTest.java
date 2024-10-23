import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {

    @Test
    void testValidDollarConversion() {
        String[] args = {"100", "dollars"};
        CurrencyConverter.main(args);
    }

    @Test
    void testMissingArguments() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CurrencyConverter.main(new String[]{});
        });
        assertEquals("Error: Please provide an amount and a currency type.", exception.getMessage());
    }

    @Test
    void testInvalidNumberFormat() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            CurrencyConverter.main(new String[]{"invalidNumber", "dollars"});
        });
        assertTrue(exception.getMessage().contains("For input string:"));
    }
}
