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
    *@date: 25/11/2021
	*@version 1.1.1
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
		
		/*for(int i = 1; i < columns; i++){
			if(numbers[rows][i] < searchNegative){
				for(int x = 1; x < numbers.length; x++){
					for(int y = 1; y < numbers.length ; y++){
						bubble = numbers[x][y + 1];
						numbers[x][y+1] = numbers[x][y];
						numbers[x][y] = bubble;
					}
				}
			}
		}*/

		int less=numbers[rows][columns];
        int column=0;
        for(int j=0;j<numbers[numbers.length-1].length;j++) {
            if(numbers[numbers.length-1][j] < less){
                less = numbers[numbers.length-1][j];
                column = j;
            }
        }

		System.out.print("\n");

        System.out.print("\nThe lower value is: "+ less);
        System.out.print("\nThe input column is: "+ column);
        System.out.print("\n");

		System.out.println();
		System.out.println("The value most negative is:" + bubble);
		
		
		//Print the last columns 
		for(int j = 1; j < rows; j++){
			System.out.print("|" + numbers[j][columns] + "|");
		}

		System.out.println();
	}

	public static void makeDivisions(int rows, int columns, int numbers [][]){
		int numberDivision [] = new int [columns];
		int numberDivisionTwo [] = new int [rows];

		for(int i = 1; i < numberDivision.length; i++){
			System.out.print(numberDivision[i]);
		}

		System.out.println();

		for(int j = 1; j < numberDivisionTwo.length; j++){
			System.out.print(numberDivisionTwo[j]);
		}
	}

}