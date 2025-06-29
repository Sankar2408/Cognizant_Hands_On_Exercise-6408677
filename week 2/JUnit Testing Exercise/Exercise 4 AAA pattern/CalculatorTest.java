import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        // Setup before each test
        calculator=new Calculator();
        System.out.println("Setup Complete");
    }

    @After
    public void tearDown(){
        // Cleanup after each test
        calculator=null;
        System.out.println("Teardown Complete");
    }

    @Test
    public void testAddition(){
        // Arrange
        int a=5,b=3;

        // Act
        int result=calculator.add(a,b);

        // Assert
        assertEquals(8,result);
    }

    @Test
    public void testSubtraction(){
        int a=10,b=4;
        int result=calculator.subtract(a,b);
        assertEquals(6,result);
    }

    @Test
    public void testMultiplication(){
        int a=7,b=6;
        int result=calculator.multiply(a,b);
        assertEquals(42,result);
    }
}
