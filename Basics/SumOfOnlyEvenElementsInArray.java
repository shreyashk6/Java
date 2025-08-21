public class SumOfOnlyEvenElementsInArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        for(int i : arr){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
