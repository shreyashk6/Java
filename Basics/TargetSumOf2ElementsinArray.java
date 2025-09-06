public class TargetSumOf2ElementsinArray {
    public static void main(String[] args) {
        int[] arr1 =  {12,4,8,9,2,9,6,1};
        int target = 10;
        for(int i =0;i<arr1.length;i++){
            
            for(int j = i+1;j<arr1.length;j++){
                if((arr1[i]+ arr1[j]) == target){
                    System.out.println(" " +arr1[i] + " "+arr1[j]);
                }
            }
        }
    }
}
