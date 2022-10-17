package pr11;

public class Value {
    enum Type {
        VAR, VALUE, CONST,
    }

    Value v1 = null;
    Value v2 = null;
    Float f1 = null;
    Float f2 = null;
    String s1 = null;
    String s2 = null;
    String op = null;
    Type type = null;

    public Value(Value v) {
        v1 = v;
    }

    public Value(String s) {
        s1 = s;
    }

    public Value(float f) {
        f1 = f;
    }

    public Value(String s, Type type) {
        s1 = s;
        this.type = type;
    }

    public Value(float f, Type type) {
        f1 = f;
        this.type = type;
    }
}
