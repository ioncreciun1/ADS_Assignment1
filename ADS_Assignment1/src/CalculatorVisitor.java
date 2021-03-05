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
    private void performOperation(Operator operator)
    {
    Operand operand1  = (Operand)tokenStack.pop();
    Operand operand2  = (Operand)tokenStack.pop();

    }
    @Override
    public int getResult() {
        return 0;
    }

    @Override
    public void visit(Operand operand) {
    pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) {
        performOperation(operator);

    }
}
