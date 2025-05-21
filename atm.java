//use of getters and setters and the to demonstrate the way the access modifiers work 
//--------------------------------------------------------------------------------------
class ATM1{
    private int a;//can  not be accesed outside the class within the same or different classes
    // we can access it via the getter and setter 
    //then we will make its object and then have a direct access over it  
    void setRupees(int a){
       this.a=a;
    }
    int getRupees(){
        return a;

    }
}
//--------------------------------------------------------------------------------------
//main class atm
public class atm {
    public static void main(String args[])
    {
        ATM1 obj= new ATM1();
        obj.setRupees(50001);
        System.out.println(obj.getRupees());

    }
}
//------------------------------------------------------------------------------------
