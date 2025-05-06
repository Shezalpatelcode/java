public class Hello {
    //using static 
    static void sum(int a){
        System.out.println(a);
        

    }
    public static void main(String args[]){
       sum(5);  
    }
}
//-----------------------------------------------
// without using the static keyword------>
//  class Hello {
//     void sum(int a){
//         Sysem.out.println(a);
//     }
//     public static void main(String args[]){
//          Hello obj=new Hello();
//          obj.sum(5);
//          int a=5;
//          System.out.println(a);
//          System.out.println(obj.a);
//     }
          
// }
//instance variable: not inside the method but inside the class so need to use the static keyword so static variable
//if the sttaic word not written then called instance variable
//local variable : declared within the class within the method
//local,global---> static and non static 