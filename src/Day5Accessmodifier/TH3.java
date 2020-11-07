package Day5Accessmodifier;

public class TH3 {
    public static class Car {
        private String name;
        private String engine;
        public static int numberOfCars;

        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCars++;
        }

        void display() {
            System.out.println(name + engine);
        }
    }
}

class TestStaticProperty {
    public static void main(String[] args) {
        TH3.Car car1 = new TH3.Car("Mazda 3", "Skyactiv 3");
        TH3.Car car2 = new TH3.Car("Mazda 6", "Skyactiv 6");
        System.out.println(TH3.Car.numberOfCars);
        System.out.println(TH3.Car.numberOfCars);
        car1.display();
        car2.display();
    }
}

