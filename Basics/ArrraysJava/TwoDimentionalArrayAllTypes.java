package ArrraysJava;

import java.util.Scanner;

public class TwoDimentionalArrayAllTypes {
    public static void main(String[] args) {
//         String[][] ticTacToe = {
//             {"X", "O", "X"},
//             {"O", "X", "O"},
//             {"O", "O", "X"}
//         };
//         System.out.println(ticTacToe[0][1]);//To print one index value from the String array
//         System.out.println("_________________________________________________________________________________________________________________");

//         //Lets Print the entire board
//         for(int i = 0;i<ticTacToe.length;i++){
//             for(int j=0;j<ticTacToe.length;j++){
//                 System.out.print(ticTacToe[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("================================================================================================================");

        ////Declare an User Input String array
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        String[][] matrix = new String[rows][cols];//SYNTAX SAME LIKE INT
        System.out.println("Enter the elements for the 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for row " + i + ", column " + j + ": ");
                matrix[i][j] = sc.nextLine();
            }
        }
        //Print the final matrix 
        System.out.println("\nHere is the 3x3 matrix you created:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

 System.out.println("================================================================================================================");

    
//     System.out.println("2 DIMENTIONAL ARRAY>");
//     System.out.println("Enter the Dimension of the 2 Dimentional array");
//     //Scanner sc = new Scanner(System.in);
//     int m =  sc.nextInt();
//     int n = sc.nextInt();
//     System.out.println("_________________________________________________________________________________________________________________");
//     int[][] numberGrid = new int[m][n];
//     for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//            numberGrid[i][j]=sc.nextInt();
//         }
//     }

//     System.out.println("\nHere is the 2D array you created:");

// for (int i = 0; i < m; i++) {
//     for (int j = 0; j < n; j++) {
//         System.out.print(numberGrid[i][j] + "\t");
//     }
//     System.out.println();
// }




// //JAGGED ARRAY Type
// A jagged array is a two-dimensional array where each row can have a different number of columns.
// Think of a standard 2D array as a perfect grid or a tic-tac-toe board where every row has the same length.
//  A jagged array is more like a movie theater where each row of seats can have a different length.

//  int[][] jaggedArray = new int[3][];

//         // 2. Define the size of each row individually.
//         jaggedArray[0] = new int[4]; // First row has 4 columns.
//         jaggedArray[1] = new int[2]; // Second row has 2 columns.
//         jaggedArray[2] = new int[5]; // Third row has 5 columns.

//         // Let's fill it with some data to see the structure.
//         // The loops will automatically handle the different row lengths.
//         for (int i = 0; i < jaggedArray.length; i++) {
//             for (int j = 0; j < jaggedArray[i].length; j++) {
//                 jaggedArray[i][j] = i + j; // Just some example data
//             }
//         }
//         // Print the jagged array
//         System.out.println("Contents of the jagged array:");
//         for (int i = 0; i < jaggedArray.length; i++) {
//             for (int j = 0; j < jaggedArray[i].length; j++) {
//                 System.out.print(jaggedArray[i][j] + " ");
//             }
//             System.out.println(); // New line for the next row
//         }


        //int[][] trailJaggedArray =  new int[][3];//NOT POSSIBLE (NO OF ROWS MUST BE FIXXED)
        
}
}
