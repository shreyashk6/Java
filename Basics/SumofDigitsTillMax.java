import java.util.Scanner;

public class SumofDigitsTillMax {
    //SUM  OF DIGITS OF A NUMBER TILLTIT REACHES SINGLE DIGIT
    //N---> 4577
    //O/P--> 5
    //EX--> 4+5+7+7--> 23 --> 5
    /*
     * N--> 99993
     * O/P --> 3
     * EX--> 39--> 3+9--> 1+2 --> 3
     */

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while (n>9) {
            n=sumOfDigit(n);
            System.out.println(n);
        }
        
        
            
        }
    
    static int sumOfDigit(int n){
        while(n!=0){
            int last= 0;
            int sum=0;
            last = n%10;
            sum= sum + last;
            // System.out.print(sum);
            n/=10;

            return sum;
    }
    
        
        
    
}
