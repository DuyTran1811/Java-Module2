package Day5Accessmodifier;

public class Circle {
        private double radius = 1.0;

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle() {
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        static String color = "Red";
    }
class TestCircle{
    public static void main(String[] args) {
        System.out.println(Circle.color);
    }

}