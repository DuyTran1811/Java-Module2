package day4classinjava;

public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(int speed) {
        this.speed = speed;
    }

    public Fan(int speed, boolean on) {
        this(speed);
        this.on = on;
    }

    public Fan(int speed, boolean on, double radius) {
        this(speed, on);
        this.radius = radius;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this(speed, on, radius);
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed = " + speed +
                ", on = " + on +
                ", radius = " + radius +
                ", color = '" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(10,true,20,"Black");
        Fan fan2 = new Fan(5,false,10,"BBBBB");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}

