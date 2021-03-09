public class Operand extends Token {
    private int value;

    public Operand()
    {
        this.value = 0;
    }
    @Override
    public void accept(CalculatorVisitor visitor) {

        visitor.visit(this);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
