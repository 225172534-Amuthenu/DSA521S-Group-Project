class Node {
    Student data;
    Node next;
    Node(Student data) { this.data = data; }
}

public class LinkedList {
    private Node head;

    public void insertStudent(Student s) {
        Node newNode = new Node(s);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void deleteStudent(int studentNo) {
        if (head == null) return;
        if (head.data.getStudentNo() == studentNo) { head = head.next; return; }
        Node temp = head;
        while (temp.next != null && temp.next.data.getStudentNo() != studentNo) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public Student searchStudent(int studentNo) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getStudentNo() == studentNo) return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public void displayStudents() {
        Node temp = head;
        if (temp == null) { System.out.println("No records."); return; }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
