package studentrecordsystem ;

import java.util.Stack;

public class ActionStack {

    private Stack<String> actions;

    public ActionStack() {
        actions = new Stack<>();
    }

    public void pushAction(String action) {
        actions.push(action);
    }

    public void displayActions() {

        if (actions.isEmpty()) {
            System.out.println("No recent actions.");
            return;
        }

        System.out.println("\nRecent Actions:");

        for (int i = actions.size() - 1; i >= 0; i--) {
            System.out.println(actions.get(i));
        }
    }
}