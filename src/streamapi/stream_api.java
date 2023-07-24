package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class stream_api{
 public static void main(String args[]) {
     List<Integer> li= Arrays.asList(2354,534,5436,346,5756,7,3215,1,6,547,32,1,45,56);

     System.out.println("Length of Stream "+li.stream().count());

     Stream<Integer> si=li.stream();

     System.out.println("Printing Stream Using Stream Api: ");

     si.forEach(x->System.out.print(x+" "));

     Stream<Integer> si2=li.stream().filter(x->x>100);

     System.out.println("\nPrinting number greater than 100 Stream Using Stream Api: ");

     si2.forEach(x->System.out.print(x+" "));

     //Using Predicated in filter

     Predicate<Integer> pi=n->n%2==0;
     Stream<Integer> si3=li.stream();
     System.out.println("\nprinting even numbers using stream api and predicated functional interface: ");

     si3.filter(pi).forEach(x->System.out.print(x+" "));


 }
}
