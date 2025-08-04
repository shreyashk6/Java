package Opps.Inheritance;
class InstagramOG{
    void post(){
        System.out.println("Post Photos");
    }
}
class InstagramReels extends InstagramOG{
    void reel(){
        System.out.println("post Reels");
    }
}
public class Mainclass4 {
    public static void main(String[] args) {
        InstagramReels reels =  new InstagramReels();
        reels.post();
        reels.reel();
        
    }
}
