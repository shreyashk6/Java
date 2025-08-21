package ArrraysJava;
public class LargeNoInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1};
        int maxNo=0;
        for(int i =0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){

                    maxNo=arr[j];
                }
                else{
                    maxNo=arr[i];
                }   
            }
        }
        System.out.println(maxNo);
    }
}
