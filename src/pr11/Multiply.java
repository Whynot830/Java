package pr11;

public class Multiply extends AbstractBinaryOperation implements Operation {
    public Multiply(Operation operand1, Operation operand2) {
        super(operand1, operand2);
        value.op = "*";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
