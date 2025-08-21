public class CallByValue {

        static void m1(int x){
            x=x+10;
            System.out.println(x);//30
        }
        
    
    public static void main(String[] args) {
        int x = 20;
        System.out.println(x);//20
        m1(x);
        System.out.println(x);//20
    }
}
