package StackJava;
import java.util.Scanner;
import java.util.Stack;
class BalancedBracketsOrNot {
    public void checkBalance(Stack<Character> stack) {      //Learn Syntax
         if (stack.isEmpty()) {
            System.out.println("The brackets are balanced!");
        } else {
            System.out.println("The brackets are NOT balanced. Final stack: " + stack);
        }
    }
}
public class Stack2brackets {
    public static void main(String[] args) {
        System.out.println("Enter the Brackets '{' OR '}' Randomly: ");
        Scanner sc = new Scanner(System.in);
        String inputstring = sc.nextLine();
        sc.close();

        Stack<Character> stackchar =  new Stack<>();
        boolean errorFound = false; // Flag to stop if an error occurs.

        for (int i = 0; i < inputstring.length(); i++) {
            char c = inputstring.charAt(i);

            if (c == '{') {
                stackchar.push(c);
            } else if (c == '}') {
                if (stackchar.isEmpty()) {
                    // Found a '}' with no matching '{'. Unbalanced.
                    errorFound = true;
                    break; 
                }
                stackchar.pop();
            } else {
                System.out.println("Error: Invalid character '" + c + "' found.");
                errorFound = true;
                break;
            }
        }
        BalancedBracketsOrNot checker = new BalancedBracketsOrNot();
        if (errorFound) {
            System.out.println("The brackets are NOT balanced.");
        } else {
            checker.checkBalance(stackchar);     //Calling the Diff Class
        }
    }
}
