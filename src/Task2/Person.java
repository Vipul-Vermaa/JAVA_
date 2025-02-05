package Task2;

//question 1

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name=name;
        this.age=18;
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("name is: "+name+ ", age is: "+ age);
    }
    public static void main(String[] args){
        Person person1=new Person("Lavish");
        person1.display();

        Person person2=new Person("Jain",25);
        person2.display();
    }
}
