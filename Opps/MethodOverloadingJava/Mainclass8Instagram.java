package Opps.MethodOverloadingJava;

public class Mainclass8Instagram {
    public static void main(String[] args) {
        Instagram i = new Instagram();
        i.send(new reel());
        i.send(new post
        ());
    }
}
class Instagram{
    void send(reel rl){
        System.out.println("Joe posted a reel");
    }
    void send(post p ){
        System.out.println("afran sent a post");
    }
}
    class reel{

    }
    class post{

    }