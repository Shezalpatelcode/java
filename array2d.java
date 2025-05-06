public class array2d {
    public static void main(String args[]){
    int [][] arr={{1,2,3,4,5},{2,3,4,5,6}};
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);



            }
            System.out.println();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              sum =sum + arr[i][j];

                //System.out.println("the sum of the 2d array is " + sum);
            }
            System.out.println();
            //System.out.println("the sum of the 2d array is " + sum);
        }
        System.out.println("the sum of the 2d array is " + sum);
    }
}
//minimize and maximize 
//merge
//compare
//sum of particular row and coloumn
//sort
