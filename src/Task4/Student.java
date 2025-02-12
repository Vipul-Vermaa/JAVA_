package Task4;

//question-1

import javax.naming.Name;

class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }
}

class NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo,String name,int age,String course) throws AgeNotWithinRangeException,NameNotValidException{
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.course=course;

        if( age<15 || age>21 ){
            throw new AgeNotWithinRangeException("not authorised");
        }

        if (!name.matches("[a-zA-Z]+")){
            throw new NameNotValidException("invalid name");
        }
    }

    public void displayStudentDetails(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

class StudentManagementSystem{
    public static void main(String[] args){
        try{
            Student student1=new Student(1,"Lavish Jain",22,"CS");
            student1.displayStudentDetails();
        }catch (AgeNotWithinRangeException | NameNotValidException e){
            System.out.println("error: " + e.getMessage());
        }


        try{
            Student student2=new Student(2,"Jain",20,"Maths");
            student2.displayStudentDetails();
    }catch(AgeNotWithinRangeException | NameNotValidException e){
            System.out.println("error: " + e.getMessage());
        }
}
}
