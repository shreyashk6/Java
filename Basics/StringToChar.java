public class StringToChar {
    public static void main(String[] args) {
        String s="hello";
        char[] arr1 =  new char[s.length()];
        for(int i =0 ; i<s.length();i++){
            arr1[i] = s.charAt(i);
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("===============================================================");
        char[] arr2 = s.toCharArray();  //using toCharArray
        for(int   i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
