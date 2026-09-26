package studentrecordsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList studentList = new StudentLinkedList();
        int choice;
        ServiceQueue serviceQueue = new ServiceQueue();
        ActionStack actionStack = new ActionStack();

        do {
            System.out.println("\n===== University Student Record & Campus Route System =====");
            System.out.println("1. Add Student Record");
            System.out.println("2. Update Student Record");
            System.out.println("3. Delete Student Record");
            System.out.println("4. Display All Records (Linked List)");
            System.out.println("5. Add Service Request to Queue");
            System.out.println("6. Process Next Service Request");
            System.out.println("7. Display Recent Actions (Stack)");
            System.out.println("8. Display Students (BST/AVL)");
            System.out.println("9. Search Student (Hashing)");
            System.out.println("10. Add Campus Location");
            System.out.println("11. Remove Campus Location");
            System.out.println("12. Add Campus Connection");
            System.out.println("13. Remove Campus Connection");
            System.out.println("14. Display Campus Connections");
            System.out.println("15. Traverse (BFS/DFS)");
            System.out.println("16. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1: {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Programme: ");
                    String programme = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Error: Marks must be between 0 and 100. Student not added.");
                    } else {
                        studentList.addStudent(new Student(id, name, programme, marks));
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter Student ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new Programme: ");
                    String programme = sc.nextLine();
                    System.out.print("Enter new Marks: ");
                    double marks = sc.nextDouble();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Error: Marks must be between 0 and 100. Update cancelled.");
                    } else {
                        studentList.updateStudent(id, name, programme, marks);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Enter Student ID to delete: ");
                    int id = sc.nextInt();
                    studentList.deleteStudent(id);
                    break;
                }
                case 4:
                    studentList.displayAll();
                    break;
                case 5: {
                    System.out.print("Enter service request description: ");
                    String request = sc.nextLine();
                    serviceQueue.addRequest(request);
                    actionStack.pushAction("Added service request: " + request);
                    break;
                }
                case 6: {
                    serviceQueue.processRequest();
                    break;
                }
                case 7: {
                    actionStack.displayActions();
                    break;
                }
                case 16:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Feature not implemented yet.");
            }

        } while (choice != 16);

        sc.close();
    }
}