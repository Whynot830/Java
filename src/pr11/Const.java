package pr11;

public class Const implements Operation {
    private float num;

    public Const(float num) {
        this.num = num;
    }

    @Override
    public Value getValue() {
        return new Value(num, Value.Type.CONST);
    }
}
