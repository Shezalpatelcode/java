//Q1) 
interface Walkable{
     void walk();
}
interface Runnable{
     void run();
}

public class Human implements Walkable ,Runnable {
    public void walk(){
        System.out.println("Humans can walk !");
    }
    public void run(){
        System.out.println("Humans can run !");
    }

    public static void main(String args[]){
        Human obj= new Human();
        obj.walk();
        obj.run();
    }
}
