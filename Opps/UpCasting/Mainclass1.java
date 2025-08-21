package Opps.UpCasting;

public class Mainclass1 {
    public static void main(String[] args) {
        Sample sam =  new Sample();
        Demo de = sam;  //Upcasting : Sample--->Demo

        System.out.println(sam);
        System.out.println(de);
    }
}
// ASSIGNING A REFERENCE OF SUBCLASS TO SUPER CLASS IS CALLED UPCASTING.
//ONLY WORKS WHEN THERES EXTENDS KEYWORD. (i.e  INHERITANCE).
class Demo{

}
class Sample extends Demo{

}