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
        int restrictions = 0, variables = 0, columns = 0, rows = 0, accumulator = 1, rowsOne = 0, columnsOne = 0;
        int accumulatorOne = 1;
        //Initialize the matrix
        int numbers [][] = new int [rows][columns];
        int mathematicalModel [][]= new int [rowsOne][columnsOne];

        //Create the method scanner
        Scanner entry = new Scanner(System.in);

        //Initialize an array that will be use as a menu
        String menu [] = {"Menu\n \t1.- Instruction\n \t2.- Enter the Mathematical Model\n \t3.- Show Mathematical Model\n " + 
                            "\t4.- Enter Variables\n \t5.- Show table\n \t6.- Show Value Negative\n \t7.-Exit\n"};
        
        //Show Menu
        do{
            MethodsEnter.ShowsMenu(menu);
            opc = MethodsEnter.readInt("Select the option that you want: ");

            System.out.println();

            switch(opc){
                case 1:
                    Introduction(); 
                break;
                case 2: 
                    rowsOne = MethodsEnter.readInt("How many rows you have: ");
                    columnsOne = MethodsEnter.readInt("How many columns you have: ");

                    mathematicalModel = new int [rowsOne + 1][columnsOne + rowsOne + 1];

                    for(int i = 1; i<= rowsOne; i++){ 
                        for(int j = 1; j<= columnsOne; j++){
                            mathematicalModel[i][j] = MethodsEnter.readInt("Enter the values of x" + j + ": ");
                        }
                    }
                break;
                case 3:
                    Matrix.printMathematicalModel(rowsOne, columnsOne, mathematicalModel);
                break;
                case 4: 
                    
                    restrictions = MethodsEnter.readInt("How many restrictions you have: ");
                    rows = restrictions + 1;
                    variables = MethodsEnter.readInt("How many vairbles you have: ");
                    columns = variables + restrictions + 1;

                    System.out.println();

                    numbers = new int [rows + 1][columns + rows + 1];

                    //For cycles for matrix filling
                    for(int i = 1; i<=rows; i++){

                        //Print the funtion or restriction that we will want the user enter

                        if(i==rows -1){
                            System.out.println("Enter the value of the restriction  S" + i);
                        }else{
                            System.out.println("Enter the value of the fuction Z");
                        }

                        //Ask for the values
                        for(int j = 1; j<=columns; j++){
                            if(j<= rows - 1){
                                numbers[i][j] = MethodsEnter.readInt("Enter the values of x" + j + ": ");
                            }else if(j >= rows && j != columns){
                                numbers[i][j] = MethodsEnter.readInt("Enter the values of S" + accumulator + ": ");
                                accumulator++;
                            }else{
                                numbers[i][j] = MethodsEnter.readInt("Enter the values of the solution: ");
                            }
                           
                       }
                       System.out.println("\n\n");
                    }
                break;
                case 5:
                    Matrix.printMatrix(columns, rows, variables, restrictions, numbers);
                break;
                case 6: 
                    Pivot.negative(rows, columns,  numbers);
                break;
                case 7: break;
            }
        }while( opc != 7 );
    }
}