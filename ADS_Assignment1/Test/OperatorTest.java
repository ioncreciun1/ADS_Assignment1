import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {
    private Operator operator;
    @BeforeEach
    void setUp()
    {
        operator = new Operator();

    }

    @Test
    void getOperator()
    {
        assertNull(operator.getOperator());
    }

    @Test
    void setOperator()
    {
        operator.setOperator(Operation.Multiplication);
        assertEquals(Operation.Multiplication,operator.getOperator());
    }
    @Test
    void resetOperator()
    {
        operator.setOperator(Operation.Multiplication);
        operator.setOperator(Operation.Division);
        assertEquals(Operation.Division,operator.getOperator());
    }
}