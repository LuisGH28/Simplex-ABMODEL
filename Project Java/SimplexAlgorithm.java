import java.util.Scanner;

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

public class SimplexAlgorithm{
    public static void main(String args[]){
        //Variables of the matrix
        int restrictions = 0, variables = 0;
        //Create the method scanner
        Scanner entry = new Scanner(System.in);

        //Ask how many retrictions the user wants
        restrictions = MethodsEnter.readInt("Type the numbers of restrictions you want: ");
        restrictions += 1;

        //Ask how many variables the user has
        variables = MethodsEnter.readInt("Type the number of variables you have: ");
        variables += restrictions + 1;
        
        //Initialize the matrix
        int numbers [][] = new int [restrictions][variables];

        //Matrix filling begins
        for(int j = 0; j < numbers.length; j++){
            for(int i = 0; i < numbers[j].length; i++){
                if(i <= restrictions){
                    numbers[j][i] = MethodsEnter.readInt("Enter the variable x" + i + ": ");
                }else if(i > restrictions && i < variables - 1){
                    numbers[j][i] = MethodsEnter.readInt("Enter the variable S " + i + ": ");
                }else{
                    numbers[j][i] = MethodsEnter.readInt("Enter the value of the solution " + i + ": ");
                } 
                   
            }
            System.out.println("");
        }
        
        //Print name of columns
        for(int j = 0; j < (variables + restrictions + 1); j++){
           if(j < variables){
               System.out.println("\tX " + (j++));
           }
        }

        for(int j = 0; j < (variables + restrictions + 1); j++){
            if(j < restrictions){
                System.out.println("\tS " + (j++));
            }
         }
         //Clear console
         System.out.print("Everything on the console will cleared");
         System.out.print("\033[H\033[2J");
         System.out.flush();

         System.out.println("Result");
         System.out.println("\n");

        //Show the result of the matrix
        for(int j = 0; j < numbers.length; j++){
            System.out.print("|");
            for(int i = 0; i < numbers[j].length; i++){
                System.out.print(numbers[j][i]);
                if (i!=numbers[j].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
        System.out.println("Probando");
        System.out.println("Pruebas Francisco ");
        System.out.println("Prueba S ");
        System.out.println("New Test");
    }
}