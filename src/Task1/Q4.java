package Task1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter three num: ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("equal");
        }else if(num1==num2 || num1==num3 || num2==num3){
            System.out.println("Two num are same");
        }else{
            int smallest=Math.min(num1, Math.min(num2,num3));
            System.out.println("smallest: "+smallest);
        }
        scanner.close();
    }
}
