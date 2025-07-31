public class FibonacciSeries {
    // static int SumOfPrevTwoNo(int n){
        
    //     return 0;
    // }
    public static void main(String[] args) {
        int n= 15;
        int a=0;
        int b=1;
        int sum=0;
        //System.out.print(a+" "+b);
        int i=1;                                                                                                                                                                                                                                       
        while(i<=n){
            
            sum=a+b;
            a=b;
            b=sum;
            i++;

            //System.out.print(" "+sum+" ");
        }
        System.out.println(sum);//PRINTS THE Nth NUMBER OF THE FIBONACCI SERIES.
    }
}
