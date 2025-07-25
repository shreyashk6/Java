package Opps.ClassObjects;
class Email{
    String from,  to;
    void sendMail(){
        System.out.println("From "+from);
    }
    void receiveMail(){
        System.out.println("To " +to);
    }
}
public class Mainclass6 {
    public static void main(String[] args) {
    Email e1 = new Email();
    e1.from="shrey@gmail.com";
    e1.to="giyu@gmail.com";
    e1.sendMail();
    e1.receiveMail();

    Email e2 = new Email();
    e2.from="afran@gmail.com";
    e2.to="chutiya@gmail.com";
    e2.sendMail();
    e2.receiveMail();
    }
    
}
