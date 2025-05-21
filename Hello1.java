abstract class Shape{
     abstract void area(int a , int b);
   
    //}
}
 class Circle extends Shape{
     void area(int a,int b){
         System.out.println("area of circle:  " + 3.14*a*a);
     } 
}

//--------------
 class Rectangle extends Shape{
    void area(int a,int b){
        System.out.println("Area of Rectangle : " + a*b);
    }
 }
public class Hello1 {
    public static void main(String args[])
    {
        Shape obj= new Circle();
        obj.area(3, 0);
        Shape obj1 = new Rectangle();
        obj1.area(4,5);
    }
}
//-------------------------------------------------------------------------------------------------------------------
