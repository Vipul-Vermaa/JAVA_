package Task1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter num: ");
        int number=scanner.nextInt();

        if (number>0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("neither");
        }
        scanner.close();
    }
}
