//スタックの操作
import java.util.Stack;
public class StackPractice {
  public static void main (String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    while(!stack.isEmpty()) {
      int top = stack.pop();
      System.out.println(top);
    }
  }
}
