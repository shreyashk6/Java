public class CharToString {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        //concat
        String s1 = "";
        for(int i=0;i<arr.length;i++){
            s1 = s1 + arr[i];
        }
        System.out.println(s1);
        System.out.println("===========================================================================");

        String s2 =  new String(arr);   //DIRECT METHOD
        System.out.println(s2);
    }
}
