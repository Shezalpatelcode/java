import java.util.*;
public class array0 {
    public static void main (String args[]){
              Scanner sc= new Scanner(System.in);


              System.out.println("Enter the size of an array");
              int n=sc.nextInt();

              System.out.println("Enter the arr valuess");
              int []arr =new int [n];

              for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
              }
              System.out.println("The array printing==>");
              for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
              }
              System.out.println();
              //System.out.println("The sum of the given array ==>");


              int sum=0;
              for(int i=0;i<n;i++)
              {
                sum= sum+ arr[i];
              }


              System.out.println("THE SUM OF THE GIEVN ARRAY IS ===> "+ sum);
              System.out.println("The Reverse of the array elements ==>");
              for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j]+" ");
              }

              System.out.println();
               int [] arr1= {1,2,3,4};
               int [] arr2={2,3,4,5};
               int even1=0;
               int odd1=0;

               int even2=0;
               int odd2=0;


               for(int i=0;i<arr1.length;i++)
               {
                if(arr1[i]%2==0){
                    even1++;
                }
                else
                  odd1++;

               }
               System.out.println("The result of array1:");
               System.out.println("The total of even number:" + even1);
               System.out.println("The total of odd numver: " + odd1);

              
               for(int i=0;i<arr2.length;i++)
               {
                if(arr2[i]%2==0){
                    even2++;
                }
                else
                  odd2++;

               }
               System.out.println("The result of array2:");
               System.out.println("The total of even number:" + even2);
               System.out.println("The total of odd numver: " + odd2);
            
                int[] sum3 =new int[arr1.length];
                for(int i=0;i<arr1.length;i++)
                {
                   sum3[i] =arr1[i]+arr2[i];
                }
                for(int j=0;j<4;j++){
                System.out.print(sum3[j] + " ");
                sc.close();
            }
    }
}

//int sum =new int[arr1.length];