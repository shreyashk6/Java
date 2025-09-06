import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest {
    public static void main(String[] args) {
        BufferedReader ref = null;
        try{
            ref = new BufferedReader(new FileReader("C:/Users/shrey/Desktop/VS-Studio/Java/FileTesterDemo/PrintDemo.txt"));
            String val = ref.readLine();
            while(val!=null){
                System.out.println(val);
                val=ref.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                ref.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
