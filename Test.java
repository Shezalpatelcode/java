//Q1)
// public class Test {
//     public static void main(String[] args){
//         String str= null;
//         System.out.println(str.length());
//     }
// }
//Its NULL becuase a null string or an empty string has no words in it so no pointing to null string  
//-----------------------------------------------------------------------------------------------------
//Q2)
// public class Test{
//     public static void main(String []args){
//         int a=10;
//         int b=0;
//         try{
            
//             System.out.println(a/b);
//         }
//          catch (Exception e) {
//             //System.out.println(e);
//             System.out.println("Cannot be divided by zero");
//           }
//     }
// }
//--------------------------------------------------------------------------------------------------
//Q3)
//     public class Test{
//     public static void main(String []args){
//         int arr[]={1,2,3};
//                 try{
            
//            System.out.println(arr[5]);
//         }
//          catch (Exception e) {

//             System.out.println("Exception" + e);
//            }
//            System.out.println("End of the program:");
//      }
// }
//Error occured :Array out of index bound and handled by the catch block 
//-----------------------------------------------------------------------------------------------
//Ouestion 5 ) A )Exception..
//Ouestion 6) B )Arithmetic Exception 
//Ouestion 9) finally
//Questiuon 10) to catch multiple Exceptions
//-----------------------------------------------------------------------------------------------
//Q4)
// public class Test{
//     public static void main(String[] args){
//         String str=null;
//         try {
//             System.out.println(str.toUpperCase());
//           } catch (Exception e) {
//             System.out.println("The string is a Null String");
//           }

//     }
// }
// public class Test{
//     public static void main(String[] args){
//       try{
//         String s=null;
//         System.out.println(s.length());  
//       }
//       finally{
//         System.out.println("Finally block is executed");
//       }
//     }
// }
public class Test{
    public static void main(String [] args){
        int []arr={1,-2,3,4,-5};
        for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length-1;j++)  {
                if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
             }
        }
        System.out.println("Array after sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}