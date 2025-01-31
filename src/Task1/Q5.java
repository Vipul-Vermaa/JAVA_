package Task1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount=scanner.nextInt();

        if(amount<=500){
            System.out.println("No discount: "+ amount);
        }else if(amount>=500 && amount<=1000){
            double discount=(amount*10)/100;
            double finalAmount=amount-discount;
            System.out.println("10% discount applied. "+finalAmount);
        }else if(amount>1000){
            double discount=(amount*20)/100;
            double finalAmount=amount-discount;
            System.out.println("20% discount applied."+finalAmount);
        }
        scanner.close();
    }
}
