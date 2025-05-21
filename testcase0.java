// class Parent{
//     void sum(int a){
//         System.out.println(a);
//     }
//     void sum(int a,int b){
//         System.out.println(a+b);
        
//     }
// }
//   class testcase0{
//     public static void main(String args[])
//     {
//         Parent obj= new Parent();
//         obj.sum(3);
//         obj.sum(3,4);
//     }
//}
//-------------------------------------------------------------------
//Abstract class and methods
//you use the abstract keyword
abstract class Payment{
    abstract void pay(int a);
    void success(){
        System.out.println("Payment done");
    }
        //int a=5;
    
}
//------------------------------
 class UpiPayment extends Payment{
    //method override
    void pay(int a){
        System.out.println("pay via Upi : " + a);

    }
 }
//-------------------
 class NetBanking extends Payment{
    void pay(int b)
    {
        System.out.println("pay via netbanking : " + b);
    }
 }
 //-----------------------
 //child ka object banake parent ke ref mein store kara sakte hai
 class testcase0{
    public static void main(String args[])
    {
        Payment obj= new UpiPayment();
        obj.pay(25000);
        obj.success();
        Payment obj1= new NetBanking();
        obj1.pay(30000);
        obj.success();

    }
 }
 //--------------------------------------------------------------------------------------------

 