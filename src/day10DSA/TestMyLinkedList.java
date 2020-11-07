package day10DSA;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("=/=/=/=/=/=/=TESTING=/=/=/=/=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.add(5,9);
        ll.add(2,8);
        ll.printList();
    }
}
