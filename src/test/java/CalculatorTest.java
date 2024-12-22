import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    @Test(priority = 1, description = "Test for addition")
    public void testAddition() {
        int result = calculator.add(5, 3);
        System.out.println("Addition Result: " + result);
        assertEquals(result, 8, "Addition result is incorrect");
    }

    @Test(priority = 2, description = "Test for subtraction")
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        System.out.println("Subtraction Result: " + result);
        assertEquals(result, 6, "Subtraction result is incorrect");
    }

    @Test(priority = 3, description = "Test for multiplication")
    public void testMultiplication() {
        int result = calculator.multiply(7, 3);
        System.out.println("Multiplication Result: " + result);
        assertEquals(result, 21, "Multiplication result is incorrect");
    }

    @Test(priority = 4, description = "Test for division")
    public void testDivision() {
        double result = calculator.divide(10, 2);
        System.out.println("Division Result: " + result);
        assertEquals(result, 5.0, "Division result is incorrect");
    }

    @Test(priority = 5, description = "Test for division by zero", expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }
}