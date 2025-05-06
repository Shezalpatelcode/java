public class code29 {
     static void sum(){
        System.out.println("This is a static function call !");
        System.out.println("This call is made from static function");
     }
     static void sum1(){
        System.out.println("This is a static function call !");
        System.out.println("A+B");
     }
      void sum2(){//
        System.out.println("This is a non-static function call !");
        
     }
      void sum3(int a,int b){//parameter
        System.out.println(a+b);
    
     }

     public static void main(String args[]){
        sum();
        sum1();
        code29 obj= new code29();
        //obj.sum2();
        obj.sum3(5, 5);//argument

     } 
}
// methods are made within the class and functions are made outside the class ,
// concept is same with a little difference
