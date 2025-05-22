interface A{
    void display();
}
interface B{
    void display();
}
// class Demo implements A,B{
//     public void display(){
//         System.out.println("This is inside the Demo class");
//     }
// }


class demo1 implements A,B  {
     public void display(){
        System.out.println("This is inside the Demo class");
    }
    public static void main(String[] args) {
        demo1 obj= new demo1();
        obj.display();
    }
}
