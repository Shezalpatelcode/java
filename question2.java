import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class question2 {
    public static void main(String[] args) {
          List<String>names=Arrays.asList("Shyam","Ram","Om","Sita");
        List<String>result= names.stream().filter(name->name.length()>3).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(" " + result);
    }
    
}
