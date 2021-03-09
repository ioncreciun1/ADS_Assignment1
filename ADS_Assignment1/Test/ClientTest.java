import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client client;
    @BeforeEach
    void setUp()
    {
        client = new Client();
    }

    @Test
    void evaluateOneOperationExpression() throws EmptyListException, MalformedExpressionException {
        ArrayList<Token> expression = new ArrayList<>();
        Operator operator = new Operator();
        operator.setOperator(Operation.Subtraction);
        Operand operand1 = new Operand();
        operand1.setValue(1);
        Operand operand2 = new Operand();
        operand2.setValue(4);
        expression.add(operand1);
        expression.add(operand2);
        expression.add(operator);

        assertEquals(-3,client.evaluateExpression(expression));
    }

    @Test
    void evaluateMultipleOperationExpression() throws EmptyListException, MalformedExpressionException {
        ArrayList<Token> expression = new ArrayList<>();
        Operator operator = new Operator();
        operator.setOperator(Operation.Addition);
        Operand operand1 = new Operand();
        operand1.setValue(13);
        Operand operand2 = new Operand();
        operand2.setValue(45);
        expression.add(operand1);
        expression.add(operand2);
        Operand operand3 = new Operand();
        operand3.setValue(28);
        expression.add(operand3);
       expression.add(operator);
        Operator operator2 = new Operator();
        operator2.setOperator(Operation.Subtraction);
        expression.add(operator2);


        assertEquals(-60,client.evaluateExpression(expression));
    }

    @Test
    void evaluateInvalidExpression() {
        ArrayList<Token> expression = new ArrayList<>();
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        operand1.setValue(3);
        operand2.setValue(5);

        Operator operator = new Operator();
        Operator operator1 = new Operator();
        operator.setOperator(Operation.Multiplication);
        operator1.setOperator(Operation.Addition);

        expression.add(operand1);
        expression.add(operand2);
        expression.add(operator);
        expression.add(operator1);


        assertThrows(MalformedExpressionException.class,()->{
           client.evaluateExpression(expression);
        });
    }
    @Test
    void evaluateSecondInvalidExpression() {
        ArrayList<Token> expression = new ArrayList<>();
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        Operand operand3 = new Operand();
        operand1.setValue(3);
        operand2.setValue(5);
        operand3.setValue(6);

        Operator operator1 = new Operator();
        operator1.setOperator(Operation.Addition);

        expression.add(operand1);
        expression.add(operand2);
        expression.add(operand3);
        expression.add(operator1);


        assertThrows(MalformedExpressionException.class,()->{
            client.evaluateExpression(expression);
        });
    }

    @Test
    void evaluateThirdInvalidExpression() {
        ArrayList<Token> expression = new ArrayList<>();
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        Operand operand3 = new Operand();
        operand1.setValue(3);
        operand2.setValue(5);
        operand3.setValue(6);


        expression.add(operand1);
        expression.add(operand2);
        expression.add(operand3);



        assertThrows(MalformedExpressionException.class,()->{
            client.evaluateExpression(expression);
        });
    }

}