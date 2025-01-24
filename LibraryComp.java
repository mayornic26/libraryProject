//Nico Mayoral
//01/22/25
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Collections;
import java.util.ArrayList;

public class LibraryComp {
  public static void main(String[] args) {
	    ArrayList<Integer> columnA = new ArrayList<Integer>();
        ArrayList<String> columnV = new ArrayList<String>();
	  try { 
            File myObj = new File("LibraryCodes.txt");
            Scanner myReader = new Scanner(myObj); // For the file inputs
            myReader.nextLine(); //I did not know you could use this to skip the next line
            while (myReader.hasNextLine()) {
                String newData = myReader.nextLine();
                int lCodes = Intger.parseInt(newData);
                String regex = "[\t]";
                String[] eachColumn = newData.split(regex);
                columnA.add(Integer.valueOf(eachColumn[0]));
                columnV.add(eachColumn[21]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File Export Items, Copy Based-3.txt not found.");
            e.printStackTrace();
        }
    try {
      File myObj = new File("StudentBarcodeIDS.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        try {
    
           int number = Integer.parseInt(data); //converts the data into a integer and sets data to number
           codes.add(number); //sets the codes to number
         } catch (NumberFormatException e) {
		   System.out.println("Not a number on file - skips the first line since it is a string");	 
	     }  
      }
      catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
  }
}
}

/*myReader.close();
      Collections.sort(codes); //sorts the codes from smallest to largest 
	  Scanner input = new Scanner(System.in); //scanner for input
      System.out.println("What number would you like to search: ");
      String numberEntered = input.nextLine();  // Read user input 
      try {
    
           int inputNum = Integer.parseInt(numberEntered); //set the number entenred into a int as inputNum
           if(codes.contains(inputNum)){
		  	  System.out.print("The number: " + inputNum +" IS IN the list");
			}
		   else {
			  System.out.print("The number: " + inputNum +" is NOT in the list");
			} 
         } catch (NumberFormatException e) {
		    System.out.println("Not a number entered");	 
	     }  
      
    } /*
