import java.io.*;
/**
	* Class where all methods are created.
	*@author Angeles Loredo Alfredo
	*@author Contreras Ventura Francisco Javier
	*@author Feregrino Cruz Marlen Aili
	*@author Fragoso García Sandra
	*@author Gonzalez Hernandez Luis Angel
	*@author Maldonado Santiago Elisa Viridiana
	*@author Mercado Reyes Monserrat
	* November 10, 2021
	
*/
class MethodsEnter{   
    
	private static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
     
	/**
		*Read a string receiving a message as a parameter
		*@param String message 
		*@return returns the string read
	*/
    public static String readString( String message) throws IOException {
       String chain="";
	   System.out.print(message);
	   try{
       chain = leer.readLine();
	   }
	   catch (Exception e){
		   System.out.print("You must enter letters...");
	   }
       return (chain);      
    }
	
	/**
		*Read a int receiving a message as a parameter
		*@param String message 
		*@return returns the number(int) read
	*/
	public static int readInt( String message) throws IOException {
       int number=0;
	   int flagError=0;
	   while(flagError==0){
		   System.out.print(message);
		   try{
					number = Integer.parseInt(leer.readLine());
					flagError=1;
			}
		   catch (Exception e){
					System.out.print("You must enter numbers...");
					flagError=0;
		   }
	   }
       return (number);      
    }
	
	/**
		*Read a double receiving a message as a parameter
		*@param String message 
		*@return returns the number(double) read
	*/
	public static double readDouble( String message) throws IOException {
       double number=0;
	   int flagError=0;
	   while(flagError==0){
	   System.out.print(message);
		   try{
					number = Double.parseDouble(leer.readLine());
					flagError=1;
			}
		   catch (Exception e){
					System.out.print("You must enter numbers...");
					flagError=0;
		   }
	   }
       return (number);      
    }
	
	/**
		*It shows an arrangement, receiving as a parameter the arrangement with the previously saved values.
		*@param String Array
	*/
	public static void ShowsArray(String myArray [ ]){
		int x;
		System.out.println( myArray[0] );
		for(x=1 ; x <myArray.length ; x++ ){
			System.out.println( x + ".-"+ myArray[x] );
		}
	}
	
	public static void ShowsMenu(String myArray [ ]){
		int x;
		System.out.println("\t\t"+ myArray[0] );
		for(x=1 ; x <myArray.length ; x++ ){
			System.out.println( "\t"+x + ".-"+ myArray[x] );
		}
		
	}

	public static void cls(){
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} 
		catch (IOException | InterruptedException ex) {}
    }

	public static void pause(){
		try{ 
			Thread.sleep(5000); 
		} 
		catch(InterruptedException e )
		{ 
		  System.out.println("Interrupted pause"); 
		}
    }
	
}