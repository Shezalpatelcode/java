
import java.util.*;
public class star {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers:  ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]={1,2,3,5,78};
        String str="Honey";
          try {
            int c=a/b;
           System.out.println("Answer:  " +  c);
           //System.out.println(arr[6]);
            
          } 
          //Exception handling block ------>
          //what we needed to print.....if the error gets thrown 
          catch (Exception e) {
            //System.out.println(e);
            System.out.println("Error: The number can not be divided by zero");
          }
          try {
            System.out.println(arr[2] + "--is the value at given index--");
          } catch (Exception e) {
            System.out.println(e);
          }
          try {
            System.out.println(str.toUpperCase());
          } catch (Exception e) {
            System.out.println("The string is already in upper case");
          }
          System.out.println("This ia a try catch program ");
          System.out.println("It does the Exception handling ");
         sc.close();
    }
}
