package Opps.ClassObjects;
class Account{
    long accNum;
    double accBal;
    void withdrawal(int amt){
        accBal=accBal-amt;
        System.out.println("Withdrawal Success Acc No.:" +accNum);
        System.out.println("Available Balance : "+accBal);
    }
    void deposit(int amt){
        accBal=accBal+amt;  
        System.out.println("Deposit Success");
        System.out.println("Available Balance : "+accBal);
    }
}
public class Mainclass5 {
    public static void main(String[] args) {
        Account a1= new Account();
        a1.accNum=3456453456678L;
        a1.accBal=250000.0;
        a1.deposit(5000);
        a1.withdrawal(5000);

        Account a2 = new Account();
        a2.accNum =3456556457849L;
        a2.accBal=456782.0;
        a2.deposit(5677);
        a2.withdrawal(9876);
    }
}
