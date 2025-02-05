package Task2;

//question 4

public class Person_4 {
    protected String name;
    protected int age;

    public Person_4(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("name is: "+name+", age is: "+age);
    }
    static class Employee extends Person_4{
        private int employeeID;
        private double salary;

        public Employee(String name, int age, int employeeId, double salary){
            super(name, age);
            this.employeeID=employeeId;
            this.salary=salary;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Employee Id: "+ employeeID +", salary is: "+salary);
        }
    }
    public static void main(String[] args){
        Employee emp=new Employee("conor",25,200,1000);
        emp.display();
    }
}

