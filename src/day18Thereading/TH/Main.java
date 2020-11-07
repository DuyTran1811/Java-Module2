package day18Thereading.TH;

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 5;

    public static class main {
        public static void main(String[] args) {
            Car Lamborghini = new Car("Lamborghini");
            Car Ferrari = new Car("Ferrari");
            Car rollsroyce = new Car("Rolls royce");
            Thread thread1 = new Thread(Lamborghini);
            Thread thread2 = new Thread(Ferrari);
            Thread thread3 = new Thread(rollsroyce);
            System.out.println("Distance: 100KM");
            thread1.start();
            thread2.start();
            thread3.start();
        }
    }
}
