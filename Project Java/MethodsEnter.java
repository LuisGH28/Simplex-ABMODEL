import java.util.*;
/**
* Class where all methods are created.
*@author Angeles Loredo Alfredo
*@author Contreras Ventura Francisco Javier
*@author Feregrino Cruz Marlen Aili
*@author Fragoso García Sandra
*@author González Hernández Luis Ángel
*@author Maldonado Santiago Elisa Viridiana
*@author Mercado Reyes Monserrat
*@date 11/11/2021
*@version 
	
*/
class MethodsEnter{   
    
	//Create Scanner's Method
	private static Scanner entry = new Scanner(System.in);
    
	//This method receives String data
    public static String readString( String message)  {
       String chain="";
	   System.out.print(message);
	   try{
       chain = entry.nextLine();
	   }
	   catch (Exception e){
		   System.out.print("You must enter letters...");
	   }
       return (chain);      
    }
	
	//This method receives Int data
	public static int readInt( String message) {
       int number=0;
	   int flagError=0;
	   while(flagError==0){
		   System.out.print(message);
		   try{
					number = entry.nextInt();
					flagError=1;
			}
		   catch (Exception e){
					System.out.print("You must enter numbers...");
					flagError=0;
		   }
	   }
       return (number);      
    }
	
	//This method receives Double data
	public static double readDouble( String message) {
       double number=0;
	   int flagError=0;
	   while(flagError==0){
	   System.out.print(message);
		   try{
					number = entry.nextDouble();
					flagError=1;
			}
		   catch (Exception e){
					System.out.print("You must enter numbers...");
					flagError=0;
		   }
	   }
       return (number);      
    }
	
	//This method receives an array an after print it
	public static void ShowsArray(String myArray [ ]){
		int x;
		System.out.println( myArray[0] );
		for(x=1 ; x <myArray.length ; x++ ){
			System.out.println( x + ".-"+ myArray[x] );
		}
	}
	
	//This method receives an array an converts in a menu
	public static void ShowsMenu(String myArray [ ]){
		int x;
		System.out.println("\t\t"+ myArray[0] );
		for(x=1 ; x <myArray.length ; x++ ){
			System.out.println( "\t"+x + ".-"+ myArray[x] );
		}
		
	}

	
	

	
}
