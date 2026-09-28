package studentrecordsystem ;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceQueue {

    private Queue<String> requests;

    public ServiceQueue() {
        requests = new LinkedList<>();
    }

    public void addRequest(String request) {
        requests.add(request);
    }

    public void processRequest() {

        if (requests.isEmpty()) {
            System.out.println("No service requests available.");
        } else {
            String request = requests.poll();
            System.out.println("Processing: " + request);
        }
    }

    public void displayRequests() {

        if (requests.isEmpty()) {
            System.out.println("No service requests.");
        } else {

            System.out.println("\nService Requests:");

            for (String request : requests) {
                System.out.println(request);
            }
        }
    }
}