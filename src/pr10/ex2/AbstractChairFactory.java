package pr10.ex2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicanChair();

    FunctionalChair createFunctionalChair();
}
