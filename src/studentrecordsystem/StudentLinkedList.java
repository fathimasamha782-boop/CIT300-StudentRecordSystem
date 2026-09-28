package ;

public class StudentLinkedList {

    // Node class
    private class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add a new student record
    public void addStudent(Student student) {
        if (searchStudent(student.getStudentId()) != null) {
            System.out.println("Error: Student ID already exists!");
            return;
        }
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Student added successfully!");
    }

    // Search a student by ID
    public Student searchStudent(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getStudentId() == id) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Update a student record
    public boolean updateStudent(int id, String name, String programme, double marks) {
        Student student = searchStudent(id);
        if (student == null) {
            System.out.println("Error: Student not found!");
            return false;
        }
        student.setName(name);
        student.setProgramme(programme);
        student.setMarks(marks);
        System.out.println("Student updated successfully!");
        return true;
    }

    // Delete a student record
    public boolean deleteStudent(int id) {
        if (head == null) {
            System.out.println("No records to delete.");
            return false;
        }
        if (head.data.getStudentId() == id) {
            head = head.next;
            System.out.println("Student deleted successfully!");
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.getStudentId() == id) {
                current.next = current.next.next;
                System.out.println("Student deleted successfully!");
                return true;
            }
            current = current.next;
        }
        System.out.println("Error: Student not found!");
        return false;
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }
        Node temp = head;
        System.out.println("----- All Student Records -----");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}