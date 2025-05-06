public class pevenodd {
    public static void main(String args[]){
           int [] arr={1,2,4,5,7};
           int [] arr1={1,3,4,5,6};


           //1)Finding the similar elements in the given 2 arrays :--------- 
           int count =0;
       System.out.println("The elements which are similar in both arrays ");
           for (int i=0;i<arr.length;i++){
                     for(int j=0;j<arr.length;j++){
                         if (arr[i]==arr1[j])
                         {
                            System.out.println(arr[i]);
                            count++;
                         }  
                     }   
           }
           System.out.println("Total no.of similar elements in the given array: "+ count);


          // 2)To merge the arrays :------ 
          int [] m= new int [arr.length+arr1.length];
          for(int i=0;i<arr.length;i++){
            m[i]=arr[i];

          }
          for(int j=0;j<arr.length;j++){
            m[arr.length+j]=arr1[j];
          }
          System.out.println("Array after merging -----");
          for (int i=0;i<m.length;i++){
            System.out.print(m[i]+ " ");
          }
    }
}
