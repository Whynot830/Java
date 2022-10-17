package pr11;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Subtract(
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        ),
                        new Const(3)
                ).evaluate(5)
        );

//        System.out.println(
//                new Multiply(
//                        new Const(2),
//                        new Add(
//                                new Const(4),
//                                new Divide(
//                                        new Subtract(
//                                                new Multiply(
//                                                        new Const(16),
//                                                        new Variable("x")
//                                                ),
//                                                new Const(11)
//                                        ),
//                                        new Const(7)
//                                )
//                        )
//                ).evaluate(2)
//        );
    }
}