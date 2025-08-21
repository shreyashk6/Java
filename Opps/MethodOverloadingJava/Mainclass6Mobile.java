package Opps.MethodOverloadingJava;

public class Mainclass6Mobile {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        mob.unlock();
        mob.unlock(234);
        mob.unlock("sdfghj");
        mob.unlock(new FingerPrint());    }
}
class Mobile{
     void unlock() {
        System.out.println("Unlock with swipe");
    }

    void unlock(int pin) {
        System.out.println("Unlock with PIN");
    }

    void unlock(String pwd) {
        System.out.println("Unlock with Password");
    }

    void unlock(FingerPrint fp) {
        System.out.println("Unlock with FingerPrint");
    }
}

class FingerPrint{
    // for the Finger print unlock!
}