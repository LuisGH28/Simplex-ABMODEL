import java.util.*;

/**
	* Class  
	*@author Angeles Loredo Alfredo
	*@author Contreras Ventura Francisco Javier
	*@author Feregrino Cruz Marlen Aili
	*@author Fragoso García Sandra
	*@author González Hernández Luis Ángel
	*@author Maldonado Santiago Elisa Viridiana
	*@author Mercado Reyes Monserrat
    *@date: 24/11/2021
	*@version 1.1.1
*/

public class Matrix {

    //Create Scanner's Method
	private static Scanner entry = new Scanner(System.in);

    public static void printMathematicalModel(int rowsOne, int columnsOne,  int mathematicalModel[][]){
        for(int i = 1; i < mathematicalModel.length; i++){
            System.out.print("|");
            for(int j = 1; j < mathematicalModel[i].length; j++){
                System.out.print(mathematicalModel[i][j]);
                if (j!=mathematicalModel[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    public static void printMatrix(int columns, int rows, int variables, int restrictions, int numbers [][]){
        
        int accumulator = 1;
        
        //Add name of the columns
        for(int j = 1; j <= columns; j++){
            if(j <= variables){
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
