package Day5Accessmodifier;

public class TH1 {
    private int data = 40;

    private void smg() {
        System.out.println("Hello Java");
    }
}

class Simple {
    public static void main(String[] args) {
        TH1 ojb = new TH1();             // khong the truy cap thong thuong neu thieu Static
    }
}
