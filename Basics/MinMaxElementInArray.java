public class MinMaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,25,3,4,9,77,33,22,78,91,05,12};
        int min = arr[0];
        int max = arr[0];
        for (int ele: arr) {
            if(min>ele){
                min = ele;
            }
        }
        for( int ele :arr){
            if(max < ele){
                max = ele;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
