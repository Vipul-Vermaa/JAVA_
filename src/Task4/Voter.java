package Task4;

//question-2

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Voter {
    public int voterId;
    private String name;
    private int age;

    public Voter(int voterId,String name,int age) throws InvalidAgeException{
        this.voterId=voterId;
        this.name=name;
        this.age=age;

        if (age<18){
            throw new InvalidAgeException("invalid age of voter");
        }
    }
    public void displayVoterDetails(){
        System.out.println("voter ID: " + voterId);
        System.out.println("name " + name);
        System.out.println("age: " + age);
    }
}
class VoterManagementSystem {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(101, "Lavish", 16);
            voter1.displayVoterDetails();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Voter voter2 = new Voter(102, "Jain", 20);
            voter2.displayVoterDetails();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
