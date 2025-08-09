package Opps;
class Demo{
    void test(float f ){
        System.out.println("Vaue: "+f);
    }
    // void test(int n){
    //     System.out.println("VALUE : "+n);
    // }
}
public class Widening2 {
    public static void main(String[] args) {
        Demo ref =  new Demo();
        ref.test(4.5F);
        ref.test(10);
        ref.test('A');

    }
}
