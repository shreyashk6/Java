package Opps.UpCasting;

public class Mainclass1 {
    public static void main(String[] args) {
        Sample sam =  new Sample();
        Demo de = sam;  //Upcasting : Sample--->Demo

        System.out.println(sam);
        System.out.println(de);
    }
}
class Demo{

}
class Sample extends Demo{

}