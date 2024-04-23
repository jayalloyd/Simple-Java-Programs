package simple_progams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassExample{
    public static void main(String a[]){
        List<String>names=Arrays.asList("meenu","rooney","lloyd");
//Using StreamAPI//

        Optional<String>name=names.stream()
                                .filter(str->str.startsWith("o"))
                                .findAny();
                                

        System.out.println(name.orElse("not found"));                                

                            

    }
}
