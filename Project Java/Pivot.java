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

	public static void negative(int rows, int columns, int numbers[][]){
		
		int valueNegative = 0;
		for(int j = 0; j <= columns; j++){
			if(numbers[rows][j] < 0){
				System.out.println(numbers[rows][j] );
			}
		}
		
	}

    
	/*public static void pivot(int numbers[][]){
		int pivot = -1, indexI = 1, indexJ = 1;
		do{
			if(numbers[indexI][indexJ] = ){

			}else{

			}
		}while();
	}*/
}
