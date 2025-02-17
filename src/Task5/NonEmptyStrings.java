package Task5;

//question-2

import java.util.*;
import java.util.stream.*;

public class NonEmptyStrings {
    public static void main(String[] args){
        List<String> strings=Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> nonEmptyStrings=strings.stream()
                .filter(str->!str.isEmpty())
                .collect(Collectors.toList());
        System.out.println("non-empty strings: "+nonEmptyStrings);
    }
}
