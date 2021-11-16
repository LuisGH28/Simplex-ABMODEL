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

public class SimplexAlgorithm{

    public static  void Introduction(){
        System.out.println("\t You gotta enter the variables of your ");
    }
    public static void main(String args[]){

        int opc = 0;
        //Variables of the matrix Restrictions = rows Variables = Columns
        int restrictions = 0, variables = 0, acummulator = 1;
        //Initialize the matrix
        int numbers [][] = new int [restrictions + 1][variables + restrictions + 1];

        //Create the method scanner
        Scanner entry = new Scanner(System.in);

        //Initialize an array that will be use as a menu
        String menu [] = {"Menu\n \t1.- Instruction\n \t2.- Enter Variables\n \t3.- Show table\n \t4.- Exit"};
        
        //Show Menu
        do{
            MethodsEnter.ShowsMenu(menu);
            opc = MethodsEnter.readInt("Select the option that you want: ");
            switch(opc){
                case 1: 
                    Introduction();
                break;
                case 2: 
                    restrictions = MethodsEnter.readInt("How many restrictions you have: ");
                    variables = MethodsEnter.readInt("How many vairbles you have: ");

                    for(int i = 0; i<restrictions; i++){
                        System.out.print("Enter data in row " + (i+1) + "\n");
                        for(int j = 0; j<(variables + restrictions + 1); j++){
                            numbers[i][j] = acummulator;
                            acummulator++;
                            acummulator = MethodsEnter.readInt("Numbers [" + i + "][" + j + "]: ");
                       }
                    }
                break;
                case 3:
                    Matrix.printMatrix(variables, restrictions, numbers);
                break;
                case 4: break;
            }
        }while( opc != 4 );
        //Clear console
       // System.out.print("Everything on the console will cleared");
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
    }
}