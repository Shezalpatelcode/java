//List of Integers return a list of squares of only even numbers 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Hello4 {
    public static void main(String [] args){
        List<Integer>numbers=Arrays.asList(1,2,3,4,5);
        List<Integer>evensquares= numbers.stream().filter(n->n%2==0).map(n -> n*n).collect(Collectors.toList());
        System.out.println(" " + evensquares);

    }
}
