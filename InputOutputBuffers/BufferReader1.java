import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader1 {
    public static void main(String[] args)  throws IOException{
        System.out.println("Enter a Number");
        InputStreamReader in = new InputStreamReader(System.in); //System.in takes input
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine()); // take input as string then convert it into Integer  THIS LINE THROWS IOEXCEPTION
        System.out.println("The Number you have entered " +num);
    }
}
