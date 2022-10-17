package pr11;

public class Calc {
    public static float calculate(float operand1, String operation, float operand2) {
        return switch (operation) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> 0;
        };
    }
}
