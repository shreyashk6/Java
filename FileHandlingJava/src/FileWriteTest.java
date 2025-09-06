import java.io.FileWriter;
import java.io.IOException;
//FileWritter   to write texts or anyhting in a file
public class FileWriteTest {
    public static void main(String[] args) {

        FileWriter ref = null;
        try{
            ref=new FileWriter("C:/Users/shrey/Desktop/VS-Studio/Java/FileTesterDemo/Demo.txt",true);
            ref.write("Java");
            ref.write("\n");
            ref.write("SQL");
            ref.write(65);
            ref.write("\n");
            char[] ch = {'T','i','g','e','r'};
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
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
