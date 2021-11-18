import java.util.*;

public class Matrix {

    //Create Scanner's Method
	private static Scanner entry = new Scanner(System.in);

    public static void printMatrix(int columns, int rows, int variables, int restrictions, int numbers [][]){
        
        int accumulator = 1;
        
        //Add name of the columns
        for(int j = 1; j <= columns; j++){
            if(j<(columns - 1)){
                System.out.print("\tX" + j);
            }else if(j>=columns && j != rows){
                System.out.print("\tSolution");
            }else{
                System.out.print("\tS" + accumulator);
                accumulator ++;
            }
        }

        System.out.println();

        for (int i = 1; i<=rows;i++){

            //Add the name of the rows

            if(i<=restrictions){
                System.out.print("S" + i + "\t");
            }else{
                System.out.print("Z\t");
            }

            //Print the matriz

            for(int j = 1; j<=columns; j++){
                System.out.print("|" + numbers[i][j] + "|");
                if(j!=numbers[i].length) System.out.print("\t");
            }
            
            System.out.println();
        }

        System.out.println();
    }
}
