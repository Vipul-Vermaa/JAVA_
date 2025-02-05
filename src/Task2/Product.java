package Task2;

//question 2

import java.util.Scanner;

public class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid,double price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
}
class XYZ{
    public static double calculateTotalAmount(Product[] products){
        double totalAmount=0;
        for (Product product:products){
            totalAmount+=product.price*product.quantity;
        }
        return totalAmount;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Product[] products=new Product[5];
        for(int i=0;i<5;i++){
            System.out.println("product " + (i + 1));

            System.out.print("Product ID: ");
            int pid = scanner.nextInt();

            System.out.print("Product Price: ");
            double price = scanner.nextDouble();

            System.out.print("Product Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }
        int highestPricePid=products[0].pid;
        double highestPrice=products[0].price;

        for (int i=1;i<5;i++){
            if(products[i].price>highestPrice){
                highestPrice=products[i].price;
                highestPricePid=products[i].pid;
            }
        }
        System.out.println("PID of the product with highest price: " + highestPricePid);

        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }
}

