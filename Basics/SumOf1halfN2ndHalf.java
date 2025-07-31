import java.util.Scanner;
/*
 * 
 */
public class SumOf1halfN2ndHalf {

    static int countOfDigits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
            
        }return (count);
        
    }
    static int power(int base,int ex){
        int pow =1;
        for (int i =1;i<=ex;i++){
            pow=pow*base;
        }
        return pow;
    }
    public static void main(String[] args) {
        System.out.print("ENTER A NUMBER with even count: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int count = countOfDigits(n);


        int x = power(10, count/2);//10 IS FOR WHEN THE DIGITS ARE EVEN NUMBER 
       // System.out.println(x);
        int firstHalf= n/x;
       // System.out.println(firstHalf);
        int secondHalf= n%x;
        //System.out.println(secondHalf);
        int sum = firstHalf+secondHalf;
        System.out.println(sum);
    }
}
