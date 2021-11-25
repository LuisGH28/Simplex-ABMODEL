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
		
		int less = 0;
		//Print the last rows
		for(int j = 1; j < columns; j++){
			System.out.print("|" + numbers[rows][j] + "|");
			for(int i = 0; i < numbers[numbers.length-1].length; i++){
				if(numbers[numbers.length-1].length < less){
					less = numbers[numbers.length-1][i];
					columns = i;
				}
			}
		}
		
		System.out.println();
		System.out.println("The value more negative is: " + less);
		

		//Print the last columns
		for(int j = 1; j < rows; j++){
			System.out.print("|" + numbers[j][columns] + "|");
		}

		System.out.println();
	}

}
