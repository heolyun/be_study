package be_study.quiz.Quiz26;

public class Circle {
    private int radius;

    public Circle() {
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}
