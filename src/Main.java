import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        LinkedList records = new LinkedList();
        SortingAlgorithms sort = new SortingAlgorithms();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nCAMPUS SERVICE CENTRE");
            System.out.println("1. Add student to waiting queue");
            System.out.println("2. Serve next student");
            System.out.println("3. Display waiting students");
            System.out.println("4. Add student service record");
            System.out.println("5. Display student service records");
            System.out.println("6. Search for student record");
            System.out.println("7. Remove student record");
            System.out.println("8. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter studentNo, name, serviceType, time: ");
                    int no = sc.nextInt(); String name = sc.next(); String type = sc.next(); int time = sc.nextInt();
                    queue.enqueue(new Student(no, name, type, time));
                }
                case 2 -> System.out.println("Served: " + queue.dequeue());
                case 3 -> queue.displayQueue();
                case 4 -> {
                    System.out.print("Enter studentNo, name, serviceType, time: ");
                    int no = sc.nextInt(); String name = sc.next(); String type = sc.next(); int time = sc.nextInt();
                    records.insertStudent(new Student(no, name, type, time));
                }
                case 5 -> records.displayStudents();
                case 6 -> {
                    System.out.print("Enter studentNo: ");
                    int no = sc.nextInt();
                    System.out.println(records.searchStudent(no));
                }
                case 7 -> {
                    System.out.print("Enter studentNo: ");
                    int no = sc.nextInt();
                    records.deleteStudent(no);
                }
                case 8 -> { System.out.println("Exiting..."); return; }
            }
        }
    }
}
