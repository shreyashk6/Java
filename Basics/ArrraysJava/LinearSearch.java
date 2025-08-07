package ArrraysJava;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr =  {10,20,40,30,9,23};
        int key = 9;
        int pos=-1;
        for(int i = 0;i<arr.length;i++){
            if(key==arr[i]){
                pos=i;
                break;
            }
        }

        System.out.println(pos);
    }
}
