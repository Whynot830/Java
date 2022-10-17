package pr11;

public abstract class AbstractBinaryOperation {
    Value value;

    AbstractBinaryOperation(Operation operand1, Operation operand2) {
        Value fo = operand1.getValue();
        Value so = operand2.getValue();
        switch (fo.type) {
            case VALUE:
                value = new Value(fo);
                switch (so.type) {
                    case VALUE:
                        value.v2 = so;
                        break;
                    case CONST:
                        value.f2 = so.f1;
                        break;
                    case VAR:
                        value.s2 = so.s1;
                        break;
                    default:
                        break;
                }
                break;
            case VAR:
                value = new Value(fo.s1);
                switch (so.type) {
                    case VALUE:
                        value.v2 = so;
                        break;
                    case CONST:
                        value.f2 = so.f1;
                        break;
                    case VAR:
                        value.s2 = so.s1;
                        break;
                    default:
                        break;
                }
                break;
            case CONST:
                value = new Value(fo.f1);
                switch (so.type) {
                    case VALUE:
                        value.v2 = so;
                        break;
                    case CONST:
                        value.f2 = so.f1;
                        break;
                    case VAR:
                        value.s2 = so.s1;
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        value.type = Value.Type.VALUE;
    }

    public float evaluate(float var, Value res) {
        if (res.s1 != null) {
            if (res.s2 != null) return Calc.calculate(var, res.op, var);
            if (res.f2 != null) return Calc.calculate(var, res.op, res.f2);
            if (res.v2 != null) return Calc.calculate(var, res.op, evaluate(var, res.v2));
        }
        if (res.f1 != null) {
            if (res.s2 != null) return Calc.calculate(res.f1, res.op, var);
            if (res.f2 != null) return Calc.calculate(res.f1, res.op, res.f2);
            if (res.v2 != null) return Calc.calculate(res.f1, res.op, evaluate(var, res.v2));
        }
        if (res.v1 != null) {
            if (res.s2 != null) return Calc.calculate(evaluate(var, res.v1), res.op, var);
            if (res.f2 != null) return Calc.calculate(evaluate(var, res.v1), res.op, res.f2);
            if (res.v2 != null) return Calc.calculate(evaluate(var, res.v1), res.op, evaluate(var, res.v2));
        }
        return 0;
    }

    public float evaluate(float var) {
        return evaluate(var, value);
    }
}

