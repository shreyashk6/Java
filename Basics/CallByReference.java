public class CallByReference {
    static void m1(int[] arr){
        arr[0]=arr[0]+10;
        System.out.println(arr[0]);//20
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(arr[0]);//10
        m1(arr);
        System.out.println(arr[0]);//20
        
    }
}
