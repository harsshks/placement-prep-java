import java.util.Stack;
import java.util.LinkedList;

public class queuewithstack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public queuewithstack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
