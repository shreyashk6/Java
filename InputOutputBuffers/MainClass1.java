import java.io.IOException;

public class MainClass1{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number");
        int num = System.in.read();  //throws IOException       REMEBER THIS GIVES ASCI VALUES NOT USER INPUT VALUES
        System.out.println(num);
       
    }
}