package ru.mirea.task30;
import org.junit.*;

import static org.junit.Assert.*;



public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void testGetSum() throws Exception {
        assertEquals(15, calculator.getSum(7,8));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(20, calculator.getDivide(100,5));
    }

    @Test
    public void testGetMultiple() throws Exception {

    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(15,0);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }
}
