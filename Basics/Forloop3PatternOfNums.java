import java.util.Scanner;

public class Forloop3PatternOfNums {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" "+i+""+j);
            }
            System.out.println();
        }
    }
}
