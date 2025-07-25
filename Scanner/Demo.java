import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n1 = ip.nextInt();
        int n2 = ip.nextInt();
        int n3 = ip.nextInt();
        System.out.println((n1+n2+n3));
        ip.close();
    }
}
