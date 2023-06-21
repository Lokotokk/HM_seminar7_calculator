package calculator;

public class LogCalculableFactory implements IcalculableFactory{
    Logger logger;

    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(float realPart, float imPart) {
        return new LogCalculator(new Calculator(realPart, imPart), logger);
    }
}
