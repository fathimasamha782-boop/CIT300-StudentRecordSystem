package studentrecordsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            switch (choice) {
                case 1: System.out.println("Add Student - coming soon"); break;
                case 16: System.out.println("Exiting..."); break;
                default: System.out.println("Feature not implemented yet.");
            }

        } while (choice != 16);

        sc.close();
    }
}