package day11StackQueue.TH1.Queue;


public class Solution {
    private int numNode;

    Queue queue = new Queue();

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (queue.getFont() == null) {
            queue.setFont(temp);
            queue.setRear(temp);
            queue.getFont().setLink(queue.getRear());
            queue.getRear().setLink(queue.getFont());
        } else {
            queue.getRear().setLink(temp);
            temp.setLink(queue.getFont());
            queue.setRear(temp);
        }
        numNode++;
    }

    public void deQueue() {
        if (queue.getFont() == null) {
            return;
        } else {
            if (queue.getFont() == queue.getRear()) {
                queue.setFont(null);
                queue.setRear(null);
            } else {
                queue.setRear(queue.getFont().getLink());
                queue.setFont(queue.getFont().getLink());
            }
        }
        numNode--;
    }

    public void display(){
        Node temp = queue.getFont();
        for (int i = 0; i < numNode; i++) {
            System.out.println(temp.getData());
            temp = temp.getLink();
        }
    }
}
