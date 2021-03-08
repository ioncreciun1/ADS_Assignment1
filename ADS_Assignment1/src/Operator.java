public class Operator extends Token{
    private Operation operator;

    public void accept(CalculatorVisitor visitor) throws EmptyListException, MalformedExpressionException {
    visitor.visit(this);
    }

    public Operation getOperator() {
        return operator;
    }

    public void setOperator(Operation operator) {
        this.operator = operator;
    }
}
