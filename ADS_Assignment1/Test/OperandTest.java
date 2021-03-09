import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {
    private Operand operand;

    @BeforeEach
    void setUp()
    {
        operand = new Operand();
    }

    @Test
    void setValue()
    {
        operand.setValue(3);
        assertEquals(3,operand.getValue());
    }

    @Test
    void resetValue()
    {
        operand.setValue(3);
        operand.setValue(5);
        assertEquals(5,operand.getValue());
    }

    @Test
    void getValue()
    {
        assertEquals(0, operand.getValue());
    }
}