package day11StackQueue.TH1.TH2;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
