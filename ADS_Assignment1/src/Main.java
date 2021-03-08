import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws EmptyListException, MalformedExpressionException {
        Client client = new Client();
        ArrayList<Token> expression = new ArrayList<>();
        Operator operator = new Operator();
        operator.setOperator(Operation.Division);
        Operand operand1 = new Operand();
        operand1.setValue(3);
        Operand operand2 = new Operand();
        operand2.setValue(4);
        expression.add(operand1);
        expression.add(operand2);
        expression.add(operator);

        LinkedStack<Token> stack = new LinkedStack<>();
        System.out.println(" SHOULD BE : " + client.evaluateExpression(expression));
    }
}
