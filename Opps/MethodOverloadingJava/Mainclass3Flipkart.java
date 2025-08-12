package Opps.MethodOverloadingJava;
class Flipkart{
    void payment(){
        System.out.println("COD");
    }
    void payment(long card){
        System.out.println("Credit Card");
    }
    void payment(String upi){
        System.out.println("UPI");
    }
}
public class Mainclass3Flipkart {
    public static void main(String[] args) {
        Flipkart fk =  new Flipkart();
        fk.payment();
        fk.payment(1234567890l);
        fk.payment("GPAY");
    }
}
