package calculator;

import java.util.ArrayList;

public interface IcalculableFactory {
    Calculable create(float realPart, float imPart);
}
