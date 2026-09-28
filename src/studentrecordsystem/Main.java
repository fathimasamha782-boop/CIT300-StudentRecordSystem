package studentrecordsystem ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentLinkedList studentList = new StudentLinkedList();
        ServiceQueue serviceQueue = new ServiceQueue();
        ActionStack actionStack = new ActionStack();

        // Campus Graph object
        CampusGraph campusGraph = new CampusGraph();

        int choice;

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
            sc.nextLine();

            switch (choice) {

                // =========================
                // STUDENT RECORDS
                // =========================

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
                    sc.nextLine();

                    if (marks < 0 || marks > 100) {

                        System.out.println(
                                "Error: Marks must be between 0 and 100. Student not added.");

                    } else {

                        studentList.addStudent(
                                new Student(id, name, programme, marks));
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
                    sc.nextLine();

                    if (marks < 0 || marks > 100) {

                        System.out.println(
                                "Error: Marks must be between 0 and 100. Update cancelled.");

                    } else {

                        studentList.updateStudent(
                                id,
                                name,
                                programme,
                                marks);
                    }

                    break;
                }

                case 3: {

                    System.out.print("Enter Student ID to delete: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    studentList.deleteStudent(id);

                    break;
                }

                case 4:

                    studentList.displayAll();

                    break;

                // =========================
                // QUEUE
                // =========================

                case 5: {

                    System.out.print(
                            "Enter service request description: ");

                    String request = sc.nextLine();

                    serviceQueue.addRequest(request);

                    actionStack.pushAction(
                            "Added service request: " + request);

                    break;
                }

                case 6:

                    serviceQueue.processRequest();

                    break;

                // =========================
                // STACK
                // =========================

                case 7:

                    actionStack.displayActions();

                    break;

                // =========================
                // BST / AVL
                // =========================

                case 8:

                    System.out.println(
                            "BST/AVL feature not implemented yet.");

                    break;

                // =========================
                // HASHING
                // =========================

                case 9:

                    System.out.println(
                            "Hashing feature not implemented yet.");

                    break;

                // =========================
                // GRAPH
                // =========================

                case 10: {

                    System.out.print(
                            "Enter campus location name: ");

                    String location = sc.nextLine();

                    campusGraph.addLocation(location);

                    break;
                }

                case 11: {

                    System.out.print(
                            "Enter campus location to remove: ");

                    String location = sc.nextLine();

                    campusGraph.removeLocation(location);

                    break;
                }

                case 12: {

                    System.out.print(
                            "Enter first location: ");

                    String loc1 = sc.nextLine();

                    System.out.print(
                            "Enter second location: ");

                    String loc2 = sc.nextLine();

                    campusGraph.addConnection(
                            loc1,
                            loc2);

                    break;
                }

                case 13: {

                    System.out.print(
                            "Enter first location: ");

                    String loc1 = sc.nextLine();

                    System.out.print(
                            "Enter second location: ");

                    String loc2 = sc.nextLine();

                    campusGraph.removeConnection(
                            loc1,
                            loc2);

                    break;
                }

                case 14:

                    campusGraph.displayConnections();

                    break;

                case 15: {

                    System.out.println(
                            "\n----- Graph Traversal -----");

                    System.out.println(
                            "1. BFS Traversal");

                    System.out.println(
                            "2. DFS Traversal");

                    System.out.print(
                            "Enter traversal choice: ");

                    int traversalChoice;

                    while (!sc.hasNextInt()) {

                        System.out.println(
                                "Invalid input. Enter 1 or 2.");

                        sc.next();
                    }

                    traversalChoice = sc.nextInt();
                    sc.nextLine();

                    System.out.print(
                            "Enter starting location: ");

                    String startLocation =
                            sc.nextLine();

                    if (traversalChoice == 1) {

                        campusGraph.bfsTraversal(
                                startLocation);

                    } else if (traversalChoice == 2) {

                        campusGraph.dfsTraversal(
                                startLocation);

                    } else {

                        System.out.println(
                                "Invalid traversal choice.");
                    }

                    break;
                }

                // =========================
                // EXIT
                // =========================

                case 16:

                    System.out.println(
                            "Exiting system...");

                    break;

                default:

                    System.out.println(
                            "Invalid choice. Please select 1-16.");
            }

        } while (choice != 16);

        sc.close();
    }
}