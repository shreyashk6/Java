package StackJava;
import java.util.Stack;

public class Stacksyntax {
    public static void main(String[] args) {
        //INTEGER
        Stack<Integer> bracket = new Stack<>();
        bracket.push(10);
        bracket.push(20);
        System.out.println(bracket);
        System.out.println("========================================================================");
        //String
        Stack<String> names =  new Stack<>();
        names.push("Shreyas H K");
        names.push("Says HI");
        names.push("Shadow");
        System.out.println(names);
        System.out.println(names.peek());//Shows the top element from the Stack
        names.pop();//Pop the TOP element
        System.out.println(names);
        System.out.println("========================================================================");


        //FIXED STACK SIZE
        int[] stackArray = new int[5];
        int top = -1;
        //PUSH 10
        top++; //TOP IS NOW 0(1st Index)
        stackArray[top]=10;

        top++;
        stackArray[top]=20;
        top++;
        stackArray[top]=30;
        System.out.println(stackArray[top]);

        int popStackArray = stackArray[top];//Basically doesnt pop 
        top--;                              //Just changes Index
        System.out.println(popStackArray);//shows the pop'ed array
        System.out.println(stackArray[top]);
        
    }
}
