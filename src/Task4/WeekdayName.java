package Task4;

//question-3

import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args){
        String[] weedays={
                "Sunday","Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the day position (0 for Sunday, 6 for Saturday): ");
        int dayIndex=scanner.nextInt();

        try{
            System.out.println("day is: " + weedays[dayIndex]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error: enter between 0-6");
        }
        scanner.close();
    }
}
