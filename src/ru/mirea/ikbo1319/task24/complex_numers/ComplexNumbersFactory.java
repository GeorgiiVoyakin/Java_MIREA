package ru.mirea.ikbo1319.task24.complex_numers;

public class ComplexNumbersFactory implements ComplexNumbersAbstractFactory {
    @Override
    public ComplexNumber produceNumber(double x, double y) {
        return new ComplexNumber(x, y);
    }
}
