package calculator;

import java.util.ArrayList;

public class Calculator implements Calculable {

    float realPart;
    float imPart;

    public Calculator(float realPart, float imPart) {
        this.realPart = realPart;
        this.imPart = imPart;
    }

    @Override
    public Calculable sum(float rP, float imP) {
        realPart += rP;
        imPart += imP;
        return this;
    }

    @Override
    public Calculable multi(float rP, float imP) {
        realPart *= rP;
        imPart *= imP;
        return this;
    }

    @Override
    public Calculable division(float rP, float imP) {
        realPart = realPart / rP;
        imPart = imPart / imP;
        return this;
    }

    @Override
    public String getResult() {
        StringBuilder sb = new StringBuilder();
        if(imPart < 0) {
            sb.append(realPart).append(imPart).append("i");
        }
        else {
            sb.append(realPart).append("+").append(imPart).append("i");
        }
        return sb.toString();
    }
}
