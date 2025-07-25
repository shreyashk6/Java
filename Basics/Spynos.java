public class Spynos {
    public static void main(String[] args) {
        int n=123;
        int rem=0, sum= 0 , product=1;
        while (n!=0){
            rem = n%10;
            sum = sum+ rem;
            product = product * rem;
            n= n/10;
        }
        System.out.println("Sum: "+sum+ "   Product : "+product);
        if(sum==product){
            System.out.println("true");
        }
        System.out.println("false");
    }
}
