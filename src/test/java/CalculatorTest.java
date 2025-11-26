import com.project.Calculator;
import com.project.InvalidInputException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    @Test
    void testAddition_ValidInput() throws InvalidInputException {
        assertEquals(8.0, Calculator.addition(5, 3));
    }

    @Test
    void testSubtraction_ValidInput() throws InvalidInputException {
        assertEquals(2.0, Calculator.subtract(5, 3));
    }

    @Test
    void testMultiplication_ValidInput() throws InvalidInputException {
        assertEquals(15.0, Calculator.multiply(5, 3));
    }

    @Test
    void testDivision_ValidInput() throws InvalidInputException {
        assertEquals(2.0, Calculator.divide(6, 3));
    }

    @Test
    void testDivisionByZero_ShouldThrowArithmeticException() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> Calculator.divide(10, 0)
        );
        assertEquals("На нуль ділити не можна!", exception.getMessage());
    }

    @Test
    void testAddition_InvalidInput_ShouldThrowInvalidInputException() {
        assertThrows(
                InvalidInputException.class,
                () -> Calculator.addition(Double.NaN, 5)
        );
    }

    @Test
    void testMultiply_InvalidInput_ShouldThrowInvalidInputException() {
        assertThrows(
                InvalidInputException.class,
                () -> Calculator.multiply(Double.POSITIVE_INFINITY, 2)
        );
    }

    @Test
    void testSubtract_InvalidInput_ShouldThrowInvalidInputException() {
        assertThrows(
                InvalidInputException.class,
                () -> Calculator.subtract(Double.NEGATIVE_INFINITY, 1)
        );
    }
}