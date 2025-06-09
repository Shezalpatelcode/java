import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;
public class question3 {
    public static void main(String[] args) {
        List<Integer>odd=Arrays.asList(1,2,3,4,5); 
         int sum= odd.stream().filter(n->n%2!=0).mapToInt(n->n).sum();
         System.out.println(" "+ sum +" ");
    }
    
}
