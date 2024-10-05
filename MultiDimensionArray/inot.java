package  MultiDimensionArray;
import java.util.*;

public class inot{



    public static boolean Search(int matrix[][], int key)
    {   
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.print("Found at cell ("+i+","+j+")");
                    return true;
                 }
            }
        }
        return false;
    }

    public static void main (String args[]){


        int seven [][] ={{4,7,8},{8,8,7}};
        
        int countof7 = 0;

        for(int i=0; i<seven.length;i++){
            for(int j=0; j<seven[0].length; j++)
            {
                if(seven[i][j] == 7 ){
                    countof7++;
                }
            }
        }
        System.out.println("count of 7 is: "+ countof7);
    }
  
}

        // int matrix [][]= new int [3][3];
        // int n=matrix.length; int m = matrix[0].length;

        // Scanner sc = new Scanner(System.in);

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // //output

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // Search(matrix, 7);
//     }
// }