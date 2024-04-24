package simple_progams;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public  static void main(String a[]){
        List<String>names=Arrays.asList("meenu","rooney","lloyd");
      List<String>uNames=names.stream()
                                .map(String::toUpperCase)
                                .toList();

                                uNames.forEach(System.out::println);

    }}
