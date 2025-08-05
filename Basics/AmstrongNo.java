import java.util.Scanner;

public class AmstrongNo {
    
    static int countOfDigits(int n){
        int count=0;
        if (n == 0) return 1; 
        
        while (n!=0) {
            n/=10;
            count++;             
        }
        return count;
    }

     static int Ams(int n, int expf){
        int ans; 
        int sum=0;
        int iteration = n; 
        while (iteration != 0) {
            int lastDigit = iteration % 10; 
            ans = 1;
            for(int i = 0; i < expf; i++){
                ans = ans * lastDigit;}
            sum += ans;

            iteration /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n; 
        sc.close();
        int count = countOfDigits(n);
        int sumOfPowers = Ams(n, count);
        System.out.println(sumOfPowers);
        if (sumOfPowers == temp) {
            System.out.println(temp + " is an Armstrong Number.");
        } else {
            System.out.println(temp + " is not an Armstrong Number.");
        }
    }
}
