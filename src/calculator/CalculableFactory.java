package calculator;

import java.util.ArrayList;

public class CalculableFactory implements IcalculableFactory {

    @Override
    public Calculable create(float realPart, float imPart) {
        return new Calculator(realPart, imPart);
    }
}

