import java.util.*;

/**
* Class  Simplex Model main
*@author Angeles Loredo Alfredo
*@author Contreras Ventura Francisco Javier
*@author Feregrino Cruz Marlen Aili
*@author Fragoso García Sandra
*@author González Hernández Luis Ángel
*@author Maldonado Santiago Elisa Viridiana
*@author Mercado Reyes Monserrat
*@date: 10/11/2021
*@version 1.1.0 
*/

public class SimplexAlgorithm{

    public static  void Introduction(){
        System.out.println("\t You gotta enter the variables of your standard model, after the algorithm give you the solution. ");
    }
    public static void main(String args[]){
        String readVariables,readObjectiveFunction,readRestrictions,readType="";
        //Arrays to save the mathematical model.
        MathematicalModel  arrayProblemVariables[ ]=new MathematicalModel[80];
        MathematicalModel  arrayProblemObjectiveFunction[ ]=new MathematicalModel[1];
        MathematicalModel  arrayProblemRestrictions[ ]=new MathematicalModel[80];
        int opc = 0;
        //Variables of the matrix Restrictions = rows Variables = Columns
        int restrictions = 0, variables = 0, columns = 0, rows = 0, accumulator = 1, rowsOne = 0, columnsOne = 0;
        int accumulatorOne = 1;
        int restrictionsModel = 0;
        int  variablesModel = 0;
        //Initialize the matrix
        int numbers [][] = new int [rows][columns];
        int mathematicalModel [][]= new int [rowsOne][columnsOne];

        //Create the method scanner
        Scanner entry = new Scanner(System.in);

        //Initialize an array that will be use as a menu
        String menu [] = {"Menu\n \t1.- Instruction\n \t2.- Enter the Mathematical Model\n \t3.- Show Mathematical Model\n " + 
                            "\t4.- Enter the Model in Standard Form\n \t5.- Show Simplex Table\n \t6.- Show Value Negative\n \t7.-Exit\n"};
        

        do{
            //Show menu
            MethodsEnter.ShowsMenu(menu);
            opc = MethodsEnter.readInt("Select the option that you want: ");

            System.out.println();

            switch(opc){
                case 1:
                    //Call the method that show the instruction
                    Introduction(); 
                break;
                case 2: 
                   variablesModel=MethodsEnter.readInt("How many variables you have the problem: ");
                   restrictionsModel=MethodsEnter.readInt("How many restrictions you have the problem: ");
                   
                   for(int enterVariables=0; enterVariables<variablesModel; enterVariables++){
                        readVariables=MethodsEnter.readString("Enter a Variables:");
                        arrayProblemVariables[enterVariables]=new MathematicalModel(readVariables);
                    }
                    readType=MethodsEnter.readString("Enter MAX if it is Maximize and MIN if it is Minimize:");
                    readObjectiveFunction=MethodsEnter.readString("Z=");
                    arrayProblemObjectiveFunction[0]=new MathematicalModel(readObjectiveFunction);
                   for(int enterRestrictions=0; enterRestrictions<restrictionsModel; enterRestrictions++){
                        readRestrictions=MethodsEnter.readString("Enter a restriction:");
                        arrayProblemRestrictions[enterRestrictions]=new MathematicalModel(readRestrictions);
                    }
                  


                break;
                case 3:
                    //Call class that which allows show the mathematical model
                    System.out.println("\t\tMathematical Model");
                    System.out.println("\t\tProblem Variables:");

                    for(int printVariables= 0; printVariables<variablesModel; printVariables++){
                        System.out.println("\t"+arrayProblemVariables[printVariables].getMathematicalModel());
                    }
                    System.out.println("\n\t"+readType);
                    System.out.println("\tZ= "+arrayProblemObjectiveFunction[0].getMathematicalModel());
                    System.out.println("\t\tS.A:");
                    for(int printRestriction= 0; printRestriction<restrictionsModel; printRestriction++){
                        System.out.println(arrayProblemRestrictions[printRestriction].getMathematicalModel());
                    }

                break;
                case 4: 
                    
                    restrictions = MethodsEnter.readInt("How many restrictions you have: ");
                    rows = restrictions + 1;
                    variables = MethodsEnter.readInt("How many vairbles you have: ");
                    columns = variables + restrictions + 1;

                    System.out.println();

                    numbers = new int [rows + 1][columns + rows + 1];

                    //For cycles for matrix filling
                    for(int start = 1; start<=rows; start++){

                        //Print the funtion or restriction that we will want the user enter

                        if(start <= rows - 1){
                            System.out.println("Enter the value of the restriction  S" + i);
                        }else{
                            System.out.println("Enter the value of the fuction Z");
                        }

                        //Ask for the values
                        for(int goOver = 1; goOver<=columns; goOver++){
                            if(goOver<= rows - 1){
                                numbers[start][goOver] = MethodsEnter.readInt("Enter the values of x" + goOver + ": ");
                            }else if(goOver >= rows && goOver != columns){
                                numbers[start][goOver] = MethodsEnter.readInt("Enter the values of S" + accumulator + ": ");
                                accumulator++;
                            }else{
                                numbers[start][goOver] = MethodsEnter.readInt("Enter the values of the solution: ");
                            }
                           
                       }
                       System.out.println("\n\n");
                    }
                break;
                case 5:
                    //Call the class which allow show the standard model
                    Matrix.printMatrix(columns, rows, variables, restrictions, numbers);
                break;
                case 6: 
                    //Call the class which allow show the value most negative
                    Pivot.negative(rows, columns,  numbers);
                break;
                case 7: break;
            }
        }while( opc != 7 );
    }
}