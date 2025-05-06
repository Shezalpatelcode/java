public class search {

     static int linearsearch(int arr[]){
         int target =4;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]==target)
            {
                System.out.println(i + " : Is The Index Number at Which The Target Element is Found");
                return 1;
            }

        }
        System.out.println("Not Found");
        return -1;
    }
    public static void main(String args[]){
        int arr[]={3,2,6,0,1,4,5};
        System.out.println(linearsearch(arr));

    }
}
// TIME cOMPLEXity is O(m);

// class Hello{
//     static void Bubblesort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//              for(int j=0;j<arr.length-i-1;j++) {
//                if(arr[i]>arr[j+1])  {
//                 int temp=arr[i];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//                }
//     }
//        }
//        for(int i:arr){
//         System.out.println(i);
//        }  
//            }
//     public static void main(String args[]){
//         int arr[]={2,0,17,4};
    
//     }
// }













