import java.util.Scanner;

public class Exponent {
    
    static int countOfDigits(int n){//wORKING CURRECTLY
        int count=0;
        while (n!=0) {
//Count of Digits 
            n/=10;
            count++;             
        }
        return count;
    }

     static int ex(int n, int expf){
        int ans; 
        int sum=0;
        int iteration = n; 

        while (iteration != 0) {
            int lastDigit = iteration % 10; 
            ans = 1;

            for(int i = 0; i < expf; i++){
                ans = ans * lastDigit;
            }

           
            sum += ans;

            iteration /= 10;
        }
        
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int expf=countOfDigits(n);
        int ans = ex(n, expf);
       // System.out.println(expf);   //Working currectly
        System.out.println(ans);
        
    }
}
