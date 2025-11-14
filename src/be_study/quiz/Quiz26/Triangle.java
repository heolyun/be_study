package be_study.quiz.Quiz26;

public class Triangle {
    private int base;
    private int height;

    public Triangle() {
    }

    public void setSize(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2.0;
    }
}