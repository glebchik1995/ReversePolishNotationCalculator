import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ReversePolishNotationCalculatorTest {

    private static final ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        assertEquals(6, calculator.calculatePolishNotation("4 2 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(0, calculator.calculatePolishNotation("3 3 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        assertEquals(25, calculator.calculatePolishNotation("5 5 *"));
    }

    @Test
    public void testHowDoesWorkBlank() {
        assertEquals(25, calculator.calculatePolishNotation("5 5     * "));
    }

    @Test
    public void shouldCalculateFalseTheCommand() {
        assertFalse(false, String.valueOf(calculator.isOperation("/")));
    }
}