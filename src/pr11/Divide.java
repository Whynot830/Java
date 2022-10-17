package pr11;

public class Divide extends AbstractBinaryOperation implements Operation {
    public Divide(Operation operand1, Operation operand2) {
        super(operand1, operand2);
        value.op = "/";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
