package Opps.MethodOverloadingJava;

public class Mainclass4Facebook {
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        fb.login("shreyashk", "asdfghjk@#$%^&");
        fb.login(123456789L, "SDFGHJ@#$%^&*");
    }
}
class Facebook{
    void login(String un ,  String pwd){
        System.out.println("Login with username and password");
    }
    void login(long pn, String pwd){
        System.out.println("Login with phoneno and password");
    }
}