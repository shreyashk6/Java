package ArrraysJava;
import java.util.Scanner;

public class UserInputArray {

    public static void main(String[] args) {
        
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n]; 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        
        }
        sc.close();
    }
}
