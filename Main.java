import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> myStack = new Stack<>();
        for (char c : arr) {
            if (c == '(' || c == '[' || c == '{') {
                myStack.push(c);
            } else if (c == ')') {
                if (myStack.isEmpty() || myStack.peek() != '(') {
                    return false;
                }
                myStack.pop();
            } else if (c == ']') {
                if (myStack.isEmpty() || myStack.peek() != '[') {
                    return false;
                }
                myStack.pop();
            } else if (c == '}') {
                if (myStack.isEmpty() || myStack.peek() != '{') {
                    return false;
                }
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }
}
