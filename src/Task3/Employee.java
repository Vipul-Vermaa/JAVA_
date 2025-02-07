package Task3;

//question-2

import java.util.Scanner;

public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return (salary * incomeTax) / 100;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Income Tax: " + calcTax());
    }
}

class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return (price * salesTax) / 100;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sales Tax per Unit: " + calcTax());
    }
}

class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter employee details:");
        System.out.print("employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("employee name: ");
        String empName = scanner.nextLine();
        System.out.print("employee salary: ");
        double empSalary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);

        System.out.println("\nenter product details:");
        System.out.print("product ID: ");
        int pid = scanner.nextInt();
        System.out.print("product price: ");
        double price = scanner.nextDouble();
        System.out.print("product quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);

        System.out.println("\nemployee details and Income Tax:");
        employee.displayEmployeeDetails();
        System.out.println("\nproduct details and Sales Tax:");
        product.displayProductDetails();

        scanner.close();
    }
}