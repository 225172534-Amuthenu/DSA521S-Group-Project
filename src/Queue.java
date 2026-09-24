import java.util.LinkedList;

public class Queue {
    // Stores students in the order they join the queue.
    private final LinkedList<Student> queue = new LinkedList<>();

    // Adds a student to the back of the queue.
    public void enqueue(Student student) {
        queue.addLast(student);
    }

    // Removes and returns the student at the front.
    // Returns null if the queue is empty.
    public Student dequeue() {
        return queue.pollFirst();
    }

    // Returns the student at the front without removing them.
    // Returns null if the queue is empty.
    public Student peek() {
        return queue.peekFirst();
    }

    // Returns true when there are no students in the queue.
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Prints each student from the front of the queue to the back.
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        for (Student student : queue) {
            System.out.println(student);
        }
    }
}