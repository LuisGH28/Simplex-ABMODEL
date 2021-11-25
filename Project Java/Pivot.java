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
    *@date: 10/11/2021
	*@version 
*/

public class Pivot {
    //Create Scanner's Method
	private static Scanner entry = new Scanner(System.in);

	//Create method that search the value most negative
	public static void negative(int rows, int columns, int numbers[][]){
		
		int searchNegative = 0, bubble = 0;
		//Print the last rows
		for(int j = 1; j < columns; j++){
			System.out.print("|" + numbers[rows][j] + "|");
		}
		
		for(int i = 1; i < columns; i++){
			if(numbers[rows][i] <= searchNegative){
				for(int x = 1; x < rows; x++){
					for(int y = 1; y <columns ; y++){
						bubble = numbers[rows][y +1];
						numbers[rows][y+1] = numbers[rows][y];
						numbers[rows][y] = bubble;
					}
				}
			}
		}

		System.out.println();
		System.out.println("The value most negative is:" + bubble);
		
	//	System.out.println("The value more negative is: " + less);
		

		//Print the last columns
		for(int j = 1; j < rows; j++){
			System.out.print("|" + numbers[j][columns] + "|");
		}

		System.out.println();
	}

}
