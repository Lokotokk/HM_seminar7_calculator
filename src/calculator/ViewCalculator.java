package calculator;

import calculator.ComplexNumber;
import calculator.IcalculableFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewCalculator {
    private IcalculableFactory calculableFactory;

    public ViewCalculator(IcalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            String inputComplexNumber = prompt("Введите комплексное число: ");
            ComplexNumber complexNumber = new ComplexNumber(inputComplexNumber);
            ArrayList<Float> cn = complexNumber.splitParts(inputComplexNumber);
            float realPart = cn.get(0);
            float imPart = cn.get(1);
            Calculable calculator = calculableFactory.create(realPart, imPart);
            while (true) {
                String command = prompt("Введите команду (*, +, /, =) : ");
                if (command.equals("*")) {
                    String arg = prompt("Введите второй аргумент: ");
                    ComplexNumber complexNum = new ComplexNumber(arg);
                    ArrayList<Float> cnum = complexNum.splitParts(arg);
                    float rP = cnum.get(0);
                    float imP = cnum.get(1);
                    calculator.multi(rP,imP);
                    continue;
                }
                if (command.equals("+")) {
                    String arg = prompt("Введите второй аргумент: ");
                    ComplexNumber complexNum = new ComplexNumber(arg);
                    ArrayList<Float> cnum = complexNum.splitParts(arg);
                    float rP = cnum.get(0);
                    float imP = cnum.get(1);
                    calculator.sum(rP,imP);
                    continue;
                }
                if (command.equals("/")) {
                    String arg = prompt("Введите второй аргумент: ");
                    ComplexNumber complexNum = new ComplexNumber(arg);
                    ArrayList<Float> cnum = complexNum.splitParts(arg);
                    float rP = cnum.get(0);
                    float imP = cnum.get(1);
                    calculator.division(rP,imP);
                    continue;
                }
                if (command.equals("=")) {
                    String result = calculator.getResult();
                    System.out.println(result);
                    break;
                }
            }
            String command = prompt("Еще посчитать (Y/N)?");
            if (command.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

//    private int promptInt(String message) {
//        Scanner in = new Scanner(System.in);
//        System.out.print(message);
//        return Integer.parseInt(in.nextLine());
//    }
}
