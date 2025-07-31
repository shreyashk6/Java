public class FibonacciSeries {
    // static int SumOfPrevTwoNo(int n){
        
    //     return 0;
    // }
    public static void main(String[] args) {
        int n= 50;
        int n1=0;
        int n2=1;
        int sum;
        System.out.print(n1+" "+n2);
        while(n!=2){
            
            sum=n1+n2;
            n1=n2;
            n2=sum;
            n--;

            System.out.print(" "+sum+" ");
        }
    }
}
