import java.util.LinkedList;

public class Queue {
    private LinkedList<Student> queue = new LinkedList<>();

    public void enqueue(Student s) { queue.addLast(s); }
    public Student dequeue() { return queue.pollFirst(); }
    public Student peek() { return queue.peekFirst(); }
    public boolean isEmpty() { return queue.isEmpty(); }
    public void displayQueue() {
        if (queue.isEmpty()) System.out.println("Queue is empty.");
        else for (Student s : queue) System.out.println(s);
    }
}
