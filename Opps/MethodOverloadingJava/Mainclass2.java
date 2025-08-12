package Opps.MethodOverloadingJava;
class Addition{
    int add(int a ,int b){
        int sum = a+b;
        return sum;
    }
    int add(int a ,int b, int c){
        int sum = a+b+c;
        return sum;
    }
    int add(int a ,int b,int c , int d){
        int sum = a+b+c+d;
        return sum;
    }
}
public class Mainclass2 {
    public static void main(String[] args) {
        Addition aaa =  new Addition();

        int res1 = aaa.add(2,4);
        int res2 = aaa.add(2,3,4);
        int res3 = aaa.add(2,3,4,7); 
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
    
}
