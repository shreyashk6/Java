package Patterns;
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                int k = j%2;
                if (k==0) {
                    k=1;
                }
                else{
                    k=0;
                }
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
