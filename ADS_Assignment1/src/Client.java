import java.util.ArrayList;

public class Client
{
    private CalculatorVisitor calculatorVisitor;
    public Client()
    {
        calculatorVisitor = new CalculatorVisitor();
    }
    public int evaluateExpression(ArrayList<Token> tokenList) throws EmptyListException, MalformedExpressionException {
        for (Token token : tokenList) {
            if (token instanceof Operand) {
                calculatorVisitor.visit((Operand) token);
            } else {
                calculatorVisitor.visit((Operator) token);
            }
        }




        return calculatorVisitor.getResult();
    }
}
