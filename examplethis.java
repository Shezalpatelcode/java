//demonstrate that working of the this keyword when pointing to the current object age using this keyword
//----------------------------------------------------------------------------
// class Student{
//     int age;
//    Student(int age){
//        this.age=age;

//    }
//    void print(){
//     System.out.println();
//    }
// }
//    class examplethis{
//     public static void main(String args[])
//     {
           //Student obj=new Student(16);
           //obj.print();
//     }
// }
//-----------------------------------------------------------------------------
// class examplethis{
//     int age=15;
//     void data(){
//         System.out.println(this);
//     }
//     public static void main(String args[])
//     {
//         examplethis obj= new examplethis();
//         obj.data();
//         System.out.println(obj);
//         //when an obj is printed then the reference value of that object is printed;
//         //but when the obj.variable name is prinnted then the value of that variable is printed
//     }
//}
//---------------------------------------------------------------------------------

//METHOD OVERIDING
//complusorily follows the inheritance concept 
//you have atlwast two classes one the parent and the the other one is the child class
//method overrididng is the method to choose the most prefer or the suitable method to be printed which is then called 


//-------------------------------------------------------------------------------------
class vehicles{
    void run(){
        System.out.println("you are the under the vehicle class");
    }
}
class bike extends vehicles{
    void run(){
        System.out.println("you are the under the bike class");
        //super.run();
        //super keyword :to call the both run method ,it is used to call out the parent's method using the super keyword
        //never called in the main method only under the child class you write whose parent method is to be printed
    }
}
 class examplethis{
    public static void main(String args[]){
         vehicles obj= new vehicles();
         vehicles obj1= new bike();
         obj.run();
         obj1.run();
    }
 }
//----------------------------------------------------------------------

