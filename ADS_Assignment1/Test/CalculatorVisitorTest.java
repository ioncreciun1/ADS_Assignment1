import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {

    @Test
    void getResult()
    {
        assertThrows(MalformedExpressionException.class,()->{
            CalculatorVisitor visitor = new CalculatorVisitor();
            visitor.getResult();
        });
    }
}