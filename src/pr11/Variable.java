package pr11;

public class Variable implements Operation {
    private String v;

    public Variable(String vararg) {
        v = vararg;
    }

    @Override
    public Value getValue() {
        return new Value(v, Value.Type.VAR);
    }
}
