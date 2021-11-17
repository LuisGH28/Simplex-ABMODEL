import java.util.*;

public class Matrix {

    //Create Scanner's Method
	private static Scanner entry = new Scanner(System.in);

    public static void printMatrix(int columns, int rows, int variables, int restrictions, int numbers [][]){
       //print the name of the Columns
       for(int i = 1; i<=rows; i++){
        for(int j = 1; j<=columns; j++){
            if(j<= rows - 1){
              //  numbers[i][j] = MethodsEnter.readInt("Enter the values of x" + j + ":");
            }else if(j >= rows && j != columns){
                //numbers[i][j] = MethodsEnter.readInt("Enter the values of S" + j + ":");
            }else{
                //numbers[i][j] = MethodsEnter.readInt("Enter the values of the solution: ");
            }
           
       }
       System.out.println("\n\n");
    
    }
        //print the name of the rows
      
            for(int i = 0; i<rows; i++){
                for(int j = 0; j<columns; j++){
                    //if(i<=restrictions){ 
                        System.out.print("S" + (i+1) + " " + numbers[i][j]); 
                        
                    //}else{
                        System.out.print("Z");

                    //}
                }
            }
    }
}
