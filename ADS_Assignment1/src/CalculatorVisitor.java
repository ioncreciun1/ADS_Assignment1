import java.util.EmptyStackException;

public class CalculatorVisitor implements Calculator,Visitor
{
    private LinkedStack<Token> tokenStack;
    public CalculatorVisitor()
    {
        tokenStack = new LinkedStack<>();
    }
    private void pushOperand(Operand operand)
    {
    tokenStack.push(operand);
    }
    private void performOperation(Operator operator) throws  MalformedExpressionException {
        try {
            Operand operand1 = (Operand) tokenStack.pop();
            //tokenStack.pop();
            Operand operand2 = (Operand) tokenStack.pop();

            switch (operator.getOperator()) {
                case Multiplication -> operand1.setValue(operand2.getValue() * operand1.getValue());
                case Addition -> operand1.setValue(operand2.getValue() + operand1.getValue());
                case Subtraction -> operand1.setValue(operand2.getValue() - operand1.getValue());


                case Division -> operand1.setValue(operand2.getValue() / operand1.getValue());
            }
            pushOperand(operand1);
        }
        catch (EmptyStackException e)
        {
            throw new MalformedExpressionException();
        }

    }
    @Override
    public int getResult() throws MalformedExpressionException {



        if(tokenStack.isEmpty())
        {
            throw new MalformedExpressionException();
        }
        Operand operand = (Operand)tokenStack.pop();
        if(!tokenStack.isEmpty())
        {
            throw new MalformedExpressionException();
        }
        return operand.getValue();
    }

    @Override
    public void visit(Operand operand) {
    pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) throws MalformedExpressionException {
        performOperation(operator);

    }
}
