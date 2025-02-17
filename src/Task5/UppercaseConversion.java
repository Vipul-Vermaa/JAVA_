package Task5;

//question-1

import java.util.*;
import java.util.stream.*;

public class UppercaseConversion {
    public static void main(String[] args){
        List<String> names=Arrays.asList("aBc","d","ef");
        List<String> uppercaseNames=names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase List: "+uppercaseNames);
    }
}
