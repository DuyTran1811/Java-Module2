package day6KeThua.ThucHanh.Triangle;

public class Shape {
    private String color = "Yellow";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape " +
                " Color = '" + getColor() + '\'' +
                ' ';
    }
}
