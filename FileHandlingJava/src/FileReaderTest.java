import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader ref = null;
        try{
            ref = new FileReader("C:/Users/shrey/Desktop/VS-Studio/Java/FileTesterDemo/PrintDemo.txt");
            int val = ref.read();
            while(val!=-1) {
                System.out.println((char) val);
                val = ref.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                ref.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
