package Task4;

//question-5

import java.util.Stack;
import java.util.Scanner;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack(){
        stack=new Stack<>();
    }

    public void push(int element){
        stack.push(element);
        System.out.println(element + " has been pushed");
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        }else{
            int poppedElement=stack.pop();
            System.out.println(poppedElement + " has been popped");
        }
    }
    public void isEmpty(){
        if (stack.isEmpty()){
            System.out.println("stack is empty");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerStack integerStack = new IntegerStack();

        while (true) {
            System.out.println("\n--- Stack Operations ---");
            System.out.println("1. Push an element onto the stack");
            System.out.println("2. Pop an element from the stack");
            System.out.println("3. Check if the stack is empty");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int element = scanner.nextInt();
                    integerStack.push(element);
                    break;

                case 2:
                    integerStack.pop();
                    break;

                case 3:
                    integerStack.isEmpty();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid");
            }
        }
    }
}
