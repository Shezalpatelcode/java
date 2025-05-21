//Create an abstract class Animal with method sound() Create classes Dog and Cat that extend it and implement the sound method 
class Animal1{
    void sound(){
       //System.out.println("This is sound function");
    }
}
//-------------
class Dog extends Animal1{
    void sound(){
        System.out.println("Bhow Bhow");
    }
}
//--------------
 class Cat extends Animal1{
    void sound(){
        System.out.println("Meow Meow");
    }
 }
public class animal {
    public static void main(String args[])
    {
        Animal1 obj= new Dog();
        obj.sound();
        Animal1 obj1 = new Cat();
        obj1.sound();
    }
}
//-------------------------------------------------------------------------------------------------------------------
