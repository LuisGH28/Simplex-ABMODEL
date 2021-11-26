import java.util.*;

/**
	* Class  
	*@author Angeles Loredo Alfredo
	*@author Contreras Ventura Francisco Javier
	*@author Feregrino Cruz Marlen Aili
	*@author Fragoso García Sandra
	*@author González Hernández Luis Angel
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
		
		int searchNegative = 0, bubble = 0, x = 0, y = 0, i = 0;
		//Print the last rows
		for(int j = 1; j < columns; j++){
			System.out.print("|" + numbers[rows][j] + "|");
		}
		
		for( i = 1; i < columns; i++){
			if(numbers[rows][i] < 0){
				for( x = 1; x < numbers.length; x++){
					for( y = 1; y <numbers.length ; y++){
						bubble = numbers[x][y +1];
						numbers[x][y+1] = numbers[x][y];
						numbers[x][y] = bubble;

					}
				}
			}
		}

		System.out.println();
		System.out.println("The value most negative is:" + bubble);
		
		
		//Print the last columns 
		for(int j = 1; j < rows; j++){
			System.out.print("|" + numbers[j][columns] + "|");
		}

		System.out.println();
	}

}