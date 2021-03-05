public class Operator extends Token{
    private Operator operator;

    public void accept(CalculatorVisitor visitor)
    {
    visitor.visit(this);
    }
}
