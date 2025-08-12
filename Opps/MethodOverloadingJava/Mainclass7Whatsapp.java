package Opps.MethodOverloadingJava;
public class Mainclass7Whatsapp {
    public static void main(String[] args) {
        Whatsapp wa = new Whatsapp();

        // Calling each of the overloaded 'send' methods
        wa.send("Hello there!");
        wa.send(new Image());
        wa.send(new video());
        wa.send(new Document());
        wa.send(new Audio());
    }
}
class Whatsapp {
    void send(String s) {
        System.out.println("Sending a text message: " + s);
    }

    void send(Image i) {
        System.out.println("Sending an image...");
    }

    void send(video v1) {
        System.out.println("Sending a video...");
    }

    void send(Document d) {
        System.out.println("Sending a document...");
    }

    void send(Audio a) {
        System.out.println("Sending an audio file...");
    }
}

class Image {
}

class video {
}

class Document {
}

class Audio {
}

