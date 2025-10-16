// package Opps.Inheritance;


class Whataspp1{
    void message(){
        System.out.println("Send / Receive Messages");
    }
}
class Whatsapp2 extends Whataspp1{
    void  call(){
        System.out.println("Make / Receive Calls");
    }
}
class Whatsapp3 extends Whatsapp2{
    void status(){
        System.out.println("Upload for Sharing");
    }
}
public class Mainclass5 {
    public static void main(String[] args) {
        Whatsapp3 wa = new Whatsapp3();//wa3 has in herited has a grand child soo it has inhrited all properties of parents n grandparent classes6
        wa.message();
        wa.call();
        wa.status();
    }
}
