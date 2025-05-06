class parent{
    void sum(int a){
             System.out.println("Inside the method : parent ");
             System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}

public class overload {
    public static void main(String[] args) {
    parent obj=new parent();
       obj.sum(2);
       obj.sum(2,4);
       obj.sum(2,4,6);

    }
}
