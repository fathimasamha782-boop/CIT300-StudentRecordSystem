# CIT300 Assignment 1 - Student Record and Campus Route Management System

**Module:** CIT300 Data Structures and Algorithms  
**Assignment:** Graded Practical Assignment 1 (Week 10)  
**Coverage:** Linear Data Structures, Trees, Hashing, and Graphs

## Group Members

| Name | Student ID | Responsibility |
|------|-----------|-----------------|
| AF Samha | 23DA2-1074 | Linked List implementation and student-record management |
| MTF Nusha | 23DA2-1025 | Stack and Queue implementation and related operations |
| MIF Shadha | 23DA2-0769 | BST/AVL tree implementation and hashing/search functionality |
| ARF Simra | 23DA2-0917 | Graph implementation, campus locations, connections, and BFS/DFS traversal |

## Individual Contributions

- **AF Samha:** Implemented Student class, StudentLinkedList (Add, Update, Delete, Search, Display), added marks validation (0-100 range), integrated with Main menu, project setup and GitHub repository management.
  
- **MTF Nusha:** Implemented ActionStack (recent actions/undo history) and ServiceQueue (service request management), integrated with Main menu (options 5-7).
  
- **MIF Shadha:** Implemented StudentBST for Binary Search Tree insertion and in-order display, implemented StudentHashMap using Java HashMap for student ID-based searching, integrated BST and hashing functionality into Main.java (options 8 and 9), tested the functionality, and managed the feature branch, commit, push, and pull request merge.
  
- **ARF Simra:**Implemented the Graph functionality to represent campus locations and their connections. Developed operations to add campus locations and establish connections between them. Implemented Breadth-First Search (BFS) and Depth-First Search (DFS) algorithms for graph traversal. Integrated graph functionality with the Main menu, tested the graph operations, and contributed to the integration of the graph component into the overall system.


## System Overview
Java console application that manages university student records and represents connections between campus locations using linked lists, stacks, queues, trees, hashing, and graphs.

## Features
- Add, Update, Delete, Search, and Display student records (Linked List)
- Undo/history tracking of recent actions (Stack)
- Service request management (Queue)
- Student organization and search by ID (BST/AVL and Hashing)
- Campus location and connection management (Graph)
- Graph traversal using BFS/DFS

## GitHub Collaboration
- Feature branches used for each component (e.g. `nusha-stack-queue`)
- Changes merged into `main` via Pull Requests
