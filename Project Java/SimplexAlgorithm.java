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
        System.out.println("\t You gotta enter the variables of your standard model, after the algorithm give you the solution. ");
    }
    public static void main(String args[]){

        int opc = 0;
        //Variables of the matrix Restrictions = rows Variables = Columns
        int restrictions = 0, variables = 0, columns = 0, rows = 0 ;
        //Initialize the matrix
        int numbers [][] = new int [rows][columns];

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
                    rows = restrictions + 1;
                    variables = MethodsEnter.readInt("How many vairbles you have: ");
                    columns = variables + restrictions + 1;

                    numbers = new int [rows + 1][columns + rows + 1];
                    
                    System.out.println(restrictions);
                    System.out.println(variables);
                    for(int i = 1; i<=rows; i++){
                        for(int j = 1; j<=columns; j++){
                            if(j<= rows - 1){
                                numbers[i][j] = MethodsEnter.readInt("Enter the values of x" + j + ":");
                            }else if(j >= rows && j != columns){
                                numbers[i][j] = MethodsEnter.readInt("Enter the values of S" + j + ":");
                            }else{
                                numbers[i][j] = MethodsEnter.readInt("Enter the values of the solution: ");
                            }
                           
                       }
                       System.out.println("\n\n");
                    }
                break;
                case 3:
                    Matrix.printMatrix(columns, rows, variables, restrictions, numbers);
                break;
                case 4: break;
            }
        }while( opc != 4 );
    }
}