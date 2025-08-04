package Opps.Inheritance;
class AdobeFree{
    void read(){
        System.out.println("Reading PDF Documents");
    }
}
class AdobePaid extends AdobeFree{
    void edit(){
        System.out.println("Editing PDF Documents");
    }
}
public class Mainclasss6 {
    public static void main(String[] args) {
        AdobePaid ad=new AdobePaid();
        ad.read();
        ad.edit();
    }
}
