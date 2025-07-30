public class SumOf1halfN2ndHalf {

    static int countOfDigits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
            
        }return (count/2);
        
    }
    public static void main(String[] args) {
        int n = 123111;
        int sum1=0;
        int sum2=0;
        int sum=0;
        while ( ) {
            
        
            int last = n%10;



            sum+=last;
            n/=10;
        }
        System.out.println(sum);
    }
}
