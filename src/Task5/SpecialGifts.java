package Task5;

//question-3

import java.util.*;
import java.util.stream.*;

public class SpecialGifts {
    public static void main(String[] args){
        List<String> students=Arrays.asList("Alex","Aman","Lavish","Jain","Alex","Conor","Khabib","Jones","GSP","Aaron");
        List<String> specialGift=students.stream()
                .filter(name->name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("students with special gifts "+specialGift);
    }
}
