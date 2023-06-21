package calculator;

import java.util.ArrayList;

public interface Calculable {
    Calculable sum(float rP, float imP);
    Calculable multi(float rP, float imP);
    Calculable division(float rP, float imP);
    String getResult();
}
