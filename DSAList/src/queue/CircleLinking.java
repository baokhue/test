package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CircleLinking {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String circlelinkingString = "Able was I ere I saw Elba";

        char charCircleLinkingString;

        for (int i = 0; i < circlelinkingString.length(); i++) {
            charCircleLinkingString = circlelinkingString.charAt(i);

            stack.push(String.valueOf(charCircleLinkingString));
            queue.add(String.valueOf(charCircleLinkingString));
        }
        boolean checkPalindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()) {

            String stackElement = stack.pop();
            String queueElement = queue.remove();

            if (!stackElement.equalsIgnoreCase(queueElement)) {
                checkPalindrome = false;
                break;
            }
        }
        if (checkPalindrome) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
        }
    }
}
