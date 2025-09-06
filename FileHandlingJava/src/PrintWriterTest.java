import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) {
        PrintWriter ref = null;
        try {
            ref=new PrintWriter("C:/Users/shrey/Desktop/VS-Studio/Java/FileTesterDemo/PrintDemo.txt");
            ref.println("Developer");
            ref.println(100);
            ref.print(4.56);
            ref.println("Bangalroe");
            ref.flush();
            System.out.println("Write Completed");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            ref.close();
        }
    }
}
