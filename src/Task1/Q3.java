package Task1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=scanner.nextInt();
        int reverseNum=0;
        while (num!=0){
            int digit=num%10;
            reverseNum=reverseNum*10+digit;
            num=num/10;
        }
        System.out.println(reverseNum);
        scanner.close();
    }
}
