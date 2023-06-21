package calculator;

public class LogCalculator implements Calculable{
    private Calculable calculable;
    Logger logger;

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Calculable primary arg " + calculable.getResult());
    }

    @Override
    public Calculable sum(float rP, float imP) {
        logger.writeLog("Sum with second arg ");
        return calculable.sum(rP, imP);
    }

    @Override
    public Calculable multi(float rP, float imP) {
        logger.writeLog("Multi with second arg ");
        return calculable.multi(rP, imP);
    }

    @Override
    public Calculable division(float rP, float imP) {
        logger.writeLog("Division with second arg ");
        return calculable.multi(rP, imP);
    }

    @Override
    public String getResult() {
        String result = calculable.getResult();
        logger.writeLog("Result " + result);
        return result;
    }
}
