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
		
		int negative = numbers[rows][columns],  location = 0;

		//Print the last rows
		for(int j = 1; j < columns; j++){
			System.out.print("|" + numbers[rows][j] + "|");
		}
		
		//Search the value most negative
        for(int j=0;j<numbers[numbers.length-1].length;j++) {
            if(numbers[numbers.length-1][j] < negative){
                negative = numbers[numbers.length-1][j];
                location = j;
            }
        }

		System.out.println();

        System.out.println("The most negative value is: " + negative);
        System.out.println("The location is on the: " + location + " column");
        System.out.println();

		
		
		
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

		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				numbers[i][j]= numberDivision[columns] / numberDivisionTwo[rows];
				System.out.print(numbers[i][j]);
			}
		}
	}

}