package Task5;

//question-4

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calculate_Age {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter birthday(yyyy-mm-dd): ");
        String birthdateString=scanner.nextLine();

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthdate=LocalDate.parse(birthdateString,formatter);

        LocalDate currentDate=LocalDate.now();
        Period age=Period.between(birthdate,currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " +
                age.getMonths() + " months, and " + age.getDays() + " days.");
    }
}
