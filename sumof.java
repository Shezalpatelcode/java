public class sumof {
     public static void main(String args[]){
          int a=121;
          int org=a;
          int rev=0;
          while(a>0)
          {
            int d =a%10;
            rev= rev*10+d;
            a=a/10;
          }
         // System.out.println(sum);
          if(rev==org){
                System.out.println("is palindrome");            
          }
          else {
            System.out.println("not a palindrome");
          }
          int arr []={1,2,3,4,5,6,67};
          System.out.println("Array print in sequential order");
         for (int i=0;i<=arr.length-1;i++)
         {
            System.out.print(arr[i]+" ");
         }
         System.out.println("   ");
         System.out.println("Array print in reverse order");
         for (int i=arr.length-1;i>=0;i--)
         {
            System.out.print(arr[i]+" ");
         }
     }
}
