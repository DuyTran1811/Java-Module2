package day10DSA.exercise;

public class MylistTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(5);
        myList.add(1);
        myList.add(9);
        myList.add(2);
        myList.add(7);
        myList.add(9);
        myList.add(10);
        System.out.println(myList.get(1));
    }
}
