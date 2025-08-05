public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int[] arr= new int [5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[5]=50;
        int x= arr[1];
        System.out.println(arr[0]);
        System.out.println(x);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);//array out of bound bruh
    }
}
