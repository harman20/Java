package Codes;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int output=validParenthesis(input);
        System.out.println(output);
    }
    static int validParenthesis(String input){
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int output=0;
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)=='('){
                stack.push(i);
            }
            else {
                stack.pop();
                if (!stack.isEmpty()){
                    output=Math.max(output, i-stack.peek());
                }
                else {
                    stack.push(i);
                }
            }
        }
        return output;
    }
}
