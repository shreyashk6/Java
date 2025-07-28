public class Palindrome {
    public static void main(String[] args) {
        int last=0;
        int n= 121;
        int rev=0;
        int n1 = n;
        while (n!=0) {
            last = n%10;
            //n/=10;
            //System.out.println(n);
            //System.out.println(last);

            //Reversing
            rev= (rev*10)+last;
            n/=10;
        }
        //System.out.println(rev);
        if (n1==rev) {
            System.out.println("Palindrome");

        }
        else{

        System.out.println("Not a Palindrome");
        }

    }
}
