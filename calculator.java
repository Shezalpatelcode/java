// WAP to make calculator that takes two numbers from the user and then calculates it as per the given operator
import java.util.*;
public class calculator {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number");
            int a= sc.nextInt();
            System.out.println("enter the next number");
            int b= sc.nextInt();
            System.out.println("enter the operator to be used :");
            char o = sc.next().charAt(0);
            //System.out.println("please enter your choice ==>");
            //System.out.println("Take bthe choice from  + ,- , *,/ ");
            switch (o){
                case '+' :
                int result1=a+b;
                  System.out.println("The addition of two numbers is :" + result1);
                  break;
                  case '-' :
                  int result2=a-b;
                    System.out.println("The addition of two numbers is :" + result2);
                    break;
                    case '*' :
                    int result3=a*b;
                      System.out.println("The addition of two numbers is :" + result3);
                      break;
                      case '/' :
                      int result4=a/b;
                        System.out.println("The addition of two numbers is :" + result4);
                        break;
                        default:
                          System.out.println("INVALID OPERATOR ");
            }
            sc.close();
        }       
}
