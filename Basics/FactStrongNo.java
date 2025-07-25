import java.util.Scanner;

public class FactStrongNo {
public static void main(String[] args) {
System.out.println("enter a number ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();
int temp =n;
int rem=0, sum =0;
while (n!=0) {
    rem = n%10 ;
    sum=sum+fact(rem);
    n=n/10;
}
if(temp==sum){
    System.out.println("Strong no");
}
else{
    System.out.println("not a strong no.");
}


}

   

static int fact(int n){
    int fact = 1;
    for (int i = n; i > 0; i--) {
      fact = fact * i;
    }
   // System.out.println("Factorial : " + fact);
    return fact;
}
}