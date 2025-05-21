class A{
    void sum(){
        System.out.println("A is here");
    }
}
class B{
    void sum(){
        System.out.println("B is here");
    }
 }
 class check extends A {
    public static void main(String args[]){
         System.out.println("here in the main class C ");
         check obj= new check();
         obj.sum();
    }
    
}
