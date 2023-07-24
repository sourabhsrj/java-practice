package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_predicated {

    public static void main(String args[]){


        List<Integer> li= Arrays.asList(2354,534,5436,346,5756,7,3215,1,6,547,32,1,45,56);
        //
        Predicate<Integer> pi= n->n%2==0;

        Stream<Integer> si3=li.stream();

        System.out.println("\nprinting even numbers using stream api and predicated functional interface: ");

        si3.filter(pi).forEach(x->System.out.print(x+" "));
    }
}
