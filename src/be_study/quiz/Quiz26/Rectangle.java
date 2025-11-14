package be_study.quiz.Quiz26;

public class Rectangle {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getArea() {
        // 사각형 넓이 = 밑변 * 높이
        return base * height;
    }
}