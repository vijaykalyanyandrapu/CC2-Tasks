import java.util.LinkedList;
import java.util.Queue;
public class StackUsingTwoQueues {
Queue q1 = new LinkedList<>();
Queue q2 = new LinkedList<>();
public void push(int x) {
q2.add(x);
while (!q1.isEmpty()) {
q2.add(q1.remove());
}
Queue temp = q1;
q1 = q2;
q2 = temp;
}
public int pop() {
if (q1.isEmpty()) {
throw new RuntimeException("Stack is empty");
}
return q1.remove();
}
public int top() {
if (q1.isEmpty()) {
throw new RuntimeException("Stack is empty");
}
return q1.peek();
}
public boolean isEmpty() {
return q1.isEmpty();
}
public static void main(String[] args) {
StackUsingTwoQueues stack = new StackUsingTwoQueues();
stack.push(10);
stack.push(20);
System.out.println("Top: " + stack.top());
System.out.println("Pop: " + stack.pop());
System.out.println("Pop: " + stack.pop());
}
