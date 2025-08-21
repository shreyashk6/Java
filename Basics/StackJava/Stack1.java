package StackJava;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer>  stacknums =  new Stack<>();
        // stacknums.push(100);
        // stacknums.push(2000);
        // System.out.println(stacknums);
        // stacknums.pop();
        // System.out.println(stacknums);
        int n= 10;
        int nums=100;
        for (int i=0;i<n;i++){
            stacknums.push(nums);
            nums+=100;
        }
        System.out.println(stacknums);
    }
}
