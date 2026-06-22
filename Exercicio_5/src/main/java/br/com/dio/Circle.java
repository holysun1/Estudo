package br.com.dio;

public record Circle(double radius) implements GeometricForm {
    private static final double pi = Math.PI;

    @Override
    public double getArea() {
        return pi *  (radius * radius);
    }
}
