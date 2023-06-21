package calculator;

import calculator.ComplexNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IcalculableFactory calculableFactory =  new LogCalculableFactory(new Log());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}