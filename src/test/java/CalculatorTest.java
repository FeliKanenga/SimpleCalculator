import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {

        Assert.assertEquals(Calculator.add(1,3),4);
    }

    @Test
    public void multiply() {
        Assert.assertEquals(Calculator.multiply(1,2),2);
    }
}