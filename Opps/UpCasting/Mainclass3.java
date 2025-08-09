package Opps.UpCasting;
class Delta{
    int num = 100;
}
class Example extends Delta{
    int val = 200;
}
public class Mainclass3 {
    public static void main(String[] args) {
        Delta ref = new Example();//Upcasting : Example ---> Delta    (Here we are doing it directly).
        System.out.println(ref.num);
        // System.out.println(ref.val);//We get error cz after upcasting we cannot access sub-class.
    }
}
