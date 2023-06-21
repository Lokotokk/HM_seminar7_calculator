package calculator;

import java.util.ArrayList;
import java.util.List;

public class ComplexNumber {
    String complexNumber;

    public ComplexNumber(String complexNumber) {
        this.complexNumber = complexNumber;
    }

    public ArrayList<Float> splitParts(String complexNumber) {
        ArrayList<Float> splitPart = new ArrayList<>();
        if (complexNumber.contains("-")) {
            int count = 0;
            for (int i = 0; i < complexNumber.length(); i++) {
                if (complexNumber.charAt(i) == '-') {
                    count++;
                }
            }
            if (count > 1) {
                ArrayList<String> s = new ArrayList<>(List.of(complexNumber.split("[\\Q-\\Ei]")));
                s.remove(0);
                splitPart.add(Float.parseFloat(s.get(0)) * (-1));
                splitPart.add(Float.parseFloat(s.get(1)) * (-1));
            }
            if (complexNumber.charAt(0) != '-' && count == 1) {
                ArrayList<String> s = new ArrayList<>(List.of(complexNumber.split("[\\Q-\\Ei]")));
                splitPart.add(Float.parseFloat(s.get(0)));
                splitPart.add(Float.parseFloat(s.get(1)) * (-1));
            }
            if (complexNumber.charAt(0) == '-' && count == 1) {
                ArrayList<String> s = new ArrayList<>(List.of(complexNumber.split("[\\Q+\\Ei]")));
                splitPart.add(Float.parseFloat(s.get(0)));
                splitPart.add(Float.parseFloat(s.get(1)));
            }
        } else {
            ArrayList<String> s = new ArrayList<>(List.of(complexNumber.split("[\\Q+\\Ei]")));
            splitPart.add(Float.parseFloat(s.get(0)));
            splitPart.add(Float.parseFloat(s.get(1)));
        }
        return splitPart;
    }

    @Override
    public String toString() {
        return String.format("Complex number: %s", complexNumber);
    }
}
