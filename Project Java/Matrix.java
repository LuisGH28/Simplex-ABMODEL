import java.util.*;

public class Matrix {

    //Create Scanner's Method
	private static Scanner entry = new Scanner(System.in);

    public static void printMatrix(int variables, int restrictions, int numbers [][]){
       for(int matrix[]: numbers){
           System.out.println(Arrays.toString(matrix));
       }
    }
}
