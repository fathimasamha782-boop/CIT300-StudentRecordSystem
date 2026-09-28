package ;

import java.util.*;

public class CampusGraph {

    private Map<String, List<String>> adjacencyList = new HashMap<>();

    // Add a new campus location
    public void addLocation(String location) {
        if (adjacencyList.containsKey(location)) {
            System.out.println("Error: Location already exists!");
            return;
        }

        adjacencyList.put(location, new ArrayList<>());
        System.out.println("Location added: " + location);
    }

    // Remove a campus location
    public void removeLocation(String location) {
        if (!adjacencyList.containsKey(location)) {
            System.out.println("Error: Location not found!");
            return;
        }

        adjacencyList.remove(location);

        for (List<String> neighbours : adjacencyList.values()) {
            neighbours.remove(location);
        }

        System.out.println("Location removed: " + location);
    }

    // Add connection between two locations
    public void addConnection(String loc1, String loc2) {

        if (!adjacencyList.containsKey(loc1)
                || !adjacencyList.containsKey(loc2)) {

            System.out.println(
                    "Error: One or both locations do not exist!");
            return;
        }

        if (loc1.equals(loc2)) {
            System.out.println(
                    "Error: A location cannot connect to itself!");
            return;
        }

        if (adjacencyList.get(loc1).contains(loc2)) {
            System.out.println("Error: Connection already exists!");
            return;
        }

        adjacencyList.get(loc1).add(loc2);
        adjacencyList.get(loc2).add(loc1);

        System.out.println(
                "Connection added between "
                        + loc1 + " and " + loc2);
    }

    // Remove connection between two locations
    public void removeConnection(String loc1, String loc2) {

        if (!adjacencyList.containsKey(loc1)
                || !adjacencyList.containsKey(loc2)) {

            System.out.println(
                    "Error: One or both locations do not exist!");
            return;
        }

        if (!adjacencyList.get(loc1).contains(loc2)) {
            System.out.println("Error: Connection not found!");
            return;
        }

        adjacencyList.get(loc1).remove(loc2);
        adjacencyList.get(loc2).remove(loc1);

        System.out.println(
                "Connection removed between "
                        + loc1 + " and " + loc2);
    }

    // Display all campus connections
    public void displayConnections() {

        if (adjacencyList.isEmpty()) {
            System.out.println(
                    "No campus locations added yet.");
            return;
        }

        System.out.println("----- Campus Network -----");

        for (String location : adjacencyList.keySet()) {
            System.out.println(
                    location + " -> "
                            + adjacencyList.get(location));
        }
    }

    // Breadth First Search traversal
    public void bfsTraversal(String start) {

        if (!adjacencyList.containsKey(start)) {
            System.out.println(
                    "Error: Starting location not found!");
            return;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        System.out.println(
                "----- BFS Traversal from "
                        + start + " -----");

        while (!queue.isEmpty()) {

            String current = queue.poll();

            System.out.print(current + " ");

            for (String neighbour
                    : adjacencyList.get(current)) {

                if (!visited.contains(neighbour)) {

                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    // Depth First Search traversal
    public void dfsTraversal(String start) {

        if (!adjacencyList.containsKey(start)) {
            System.out.println(
                    "Error: Starting location not found!");
            return;
        }

        Set<String> visited = new HashSet<>();

        System.out.println(
                "----- DFS Traversal from "
                        + start + " -----");

        dfsHelper(start, visited);

        System.out.println();
    }

    // Helper method for DFS
    private void dfsHelper(
            String current,
            Set<String> visited) {

        visited.add(current);

        System.out.print(current + " ");

        for (String neighbour
                : adjacencyList.get(current)) {

            if (!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited);
            }
        }
    }
}