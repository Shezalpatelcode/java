// //Interface 
// interface Client{
//     //you use the "interface" keyword and then name the interface
//     //you only mention the methods which are yet to define 
//     //these methods will be define in the class which will implement the requirements of the interface
//     void print();
//     void show();

// }
// //------------------------------------------------------------------------------------------------
// //class dev is the class which is responsible for implementing/or defineing the undefined methods of the interface
// // the keyword implement is used for the class implemneting the methods of interface
// //while you define the methods/functions of the interface in the dev class remember the function are by default public 
// //so you need to mention the public specifier while you are defining the methods within the class 
//  class Dev implements Client{
//     public void print(){
//         System.out.println("Print the bills from here");
//     }
//     public void show(){
//          System.out.println("See the manual from here");
//     }
//  }
//  //-----------------------------------------------------------------------------------------------
// public class newclass {
//     // this is the main class
//     //to call the methods of the interface class defined in the implementing class 
//     //you need to create object of the child class using implementing keyword (always)
//     //and then call the object to print the methods in here ............
//     public static void main(String[] args) {
//         Dev obj= new Dev();
//         obj.print();
//         obj.show();
//     }
// }
//-----------------------------------------------------------------------------------------------
//working of multiple inhertiance using interface and implementing 
//well the java do not support the multiple inheritance
 interface Client1{
     void show();
}
 interface Client2{
    void show();
 }

class  newclass implements Client1,Client2{
    public void show(){
        System.out.println("This is a common feature of the Client && 1 and 2");

    }
    public void print(){

    }
    public static void main(String args[])
    {
        newclass obj= new newclass();
        obj.show();
    }
}


