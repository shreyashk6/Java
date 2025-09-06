import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) {
        BufferedWriter ref = null;
        try{
            ref = new BufferedWriter(new FileWriter("C:/Users/shrey/Desktop/VS-Studio/Java/FileTesterDemo/BuffDemo.txt"));
            ref.write("JSpiders");
            ref.newLine();
            ref.write("Java Full Stack");
            ref.newLine();
            ref.write(97);
            ref.newLine();
            char[] ch = {'Y','O'};
            ref.write(ch);
            ref.flush();
            System.out.println("Write Completed");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                ref.close();

            }catch (IOException e){

            }
        }
    }
}
