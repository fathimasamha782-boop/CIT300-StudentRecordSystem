package studentrecordsystem;

public class StudentBST {

    private class Node {
        Student data;
        Node left, right;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private Node insertRec(Node node, Student student) {
        if (node == null) {
            return new Node(student);
        }

        if (student.getStudentId() < node.data.getStudentId()) {
            node.left = insertRec(node.left, student);
        } else if (student.getStudentId() > node.data.getStudentId()) {
            node.right = insertRec(node.right, student);
        }

        return node;
    }

    public void displayInOrder() {
        if (root == null) {
            System.out.println("No students in BST.");
            return;
        }

        System.out.println("----- Students (BST - InOrder) -----");
        inOrderRec(root);
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println(node.data);
            inOrderRec(node.right);
        }
    }
}

