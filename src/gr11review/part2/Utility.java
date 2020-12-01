package gr11review.part2;
import java.io.BufferedReader.*;
import java.io.*;
import java.util.*;

/**
* Grade 11 Review Part 2
* @Author: V.Shek & K.M
*
*/
public class Utility {
 /**
  * Outputs sum of numbers in input by adding all the integers in an input with a combination of string and integers
  *
  * @param str is the String variable that is being read with integers included 
  * @return sum of numbers in input
  * @author V.Shek
  */
 public static int sumNumbers(String str) {
  int y = 0;
  int z = 0;
  for (int f4 = 0; f4 < str.length(); f4++) {
    if (Character.isDigit(str.charAt(f4))) {
      for (int f5 = f4; f5 < str.length(); f5++) {
        if (!Character.isDigit(str.charAt(f5))) {
          z = (Integer.parseInt(str.substring(f4, f5)));
          y = y + z;
          f4 = f5 - 1;
          break;
        }
        if (f4 != f5) {
          z = (Integer.parseInt(str.substring(f4, str.length())));
          y = y + z;
          break;
      }
      }
    }
  }
  return y;
}
/**
  * Outputs input with changes to the non alone integer find out the integer that's not alone and change it to the bigger one next to it
  *
  * @param int[] nums is the array size and int val is the input 
  * @return not alone integer
  * @author V.Shek
  */
public static int[] notAlone(int[] nums, int val) {
 for (int i= 1;i<nums.length -1;i++){
  if (nums[i] == val)
  if (nums[i-1] != nums[i] && nums[i+1] != nums[i])
   if (nums[i+1] > nums[i-1]) nums[i] = nums[i+1];
   else if (nums[i+1] < nums[i-1]) nums[i] = nums[i-1];
   }
   return nums;
}

/**
  * Outputs first word in the WordBank.txt according to alphebetical order
  *
  * @param read String words is the words present in the WordBank.txt file 
  * @return words
  * @author V.Shek
  */
public static String alphaWord(String words){
  String FirstLetter = words.substring(0,1);
  if(FirstLetter.equalsIgnoreCase("A")){
    return words;
  }else if(FirstLetter.equalsIgnoreCase("B")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("C")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("D")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("E")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("F")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("G")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("H")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("I")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("J")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("K")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("L")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("M")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("N")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("O")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("P")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("Q")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("R")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("S")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("T")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("U")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("V")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("W")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("X")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("Y")){
    return words; 
  }else if(FirstLetter.equalsIgnoreCase("Z")){
  }return words; 
  //thefile.close();
}

/**
  * Outputs "true" or "false" if the input can be seperated into two equal sides where their sum equals
  *
  * @param int[] nums is the size of the array
  * @return "true" or "false"
  * @author V.Shek
  */
  public static boolean canBalance (int[] nums) {
  int sum1=0;
  int sum2=0;
  for(int i=0; i< nums.length/2 ; i++){
    for(int j=0 ; j<=i ; j++)
    sum1=sum1+nums[j];
    for(int k=i%2; k<nums.length/2 ; k++){
      sum2=sum2+nums[k];
    }
    if(sum1==sum2){
      return true;
    }
      if(sum1 != sum2);
    }return false;
  } 
/**
  * Outputs to the diagonalOut.txt file a diagonal number line according to the desired size
  *
  * @param int size is the desired size determining the dimensions of the array
  * @return printings in the array
  * @author V.Shek
  */
public static void diagonal(int size) {
  int[][] dimension={};
  int n = size - 1;
  //dimension = new IntArray [n][n];

  for(int i=0; i< n ; i++){
    for(int j=0 ; j<=n ; j++) {
      if (j==(n-1)) {
        dimension[i][j] = 1;
        }
      else if (j < (n-1)) {
        dimension [i][j] = 0;  
      }
      else {
        dimension [i][j] = 2;
      }
    }
  }
  //PrintWriter theout = new PrintWriter(new FileWriter("src/gr11review/part2/diagonalOut.txt", true));
  //theout.println(dimension);
  //theout.close();
}  


 /**
  * removes the middle letter of any three letter word with z as the first letter and p as the third letter
  *
  * @param strWord is the users given word
  * @return the word without the middle letter in any three letter word with z as the first letter and p as the third letter
  * @author K.Mendes
  */
  public static String zipZap(String strWord) {

    // Create the variables
    String strFinal = "";
    int intCount;

    // Checking to see if there is any z as intCount and p as (intCount + 2) 
    for (intCount = 0; intCount < strWord.length(); intCount++) {
      if (strWord.charAt(intCount) == 'z' && strWord.charAt(intCount + 2) == 'p') {
        strFinal = strFinal + "zp";
        intCount = intCount + 2;
      }else {
        strFinal = strFinal + strWord.charAt(intCount);
      }
    }

    // Returns the final string
    return strFinal;

  }

  /**
  * Outputs the longest word in the text file
  *
  * @param filenametxt the name of the file
  * @return the longest word from the file
  * @author K.Mendes
  */
  public static String longestWord(String filenametxt) throws IOException {
    
    // Opens the file
    BufferedReader thefile = new BufferedReader(new FileReader(filenametxt));

    // Create the variables
    String strLongestWord = "";
    String strCurrent = thefile.readLine();

    // Runs code until the end of the file 
    while (strCurrent != null) {
      
      // Compares the word lengths
      if (strCurrent.length () >= strLongestWord.length()) {
        strLongestWord = strCurrent;
      }
      strCurrent = thefile.readLine(); 
    }

    // Close the file
    thefile.close();

    // Returns the longest word
    return strLongestWord;

  }

  /**
  * For every multiple of 10 in the array all the values following it will print out the multiple until the next multiple of 10
  *
  * @param intNums the integers in the array
  * @return the array with only the multiples of 10
  * @author K.Mendes
  */
  public static int[] tenRun(int[] intNums) {

    // Create the variables
    int intCurrent = 0;
    int intCount;

    // Reads the array to see if there are any multiples of 10 until the end of the array
    for (intCount = 1; intCount < intNums.length; intCount++) {

      // Checks to see if it is a multiple of 10 using modulus
      if (intNums[intCount] % 10 == 0) {
        intCurrent = intNums[intCount];
      }else if (intNums[intCount] % 10 != 0) {
        intNums[intCount] = intCurrent;
      }
    }

    // Returns the new array
    return intNums;

  }

  /**
  * It figures out if the inner numbers appear in the outer array and tells returns whether the arrays are true or false
  *
  * @param intOuter is the outter array
  * @param intInner is the inner array
  * @return whether the inner array is in the outer array and prints either true or false
  * @author K.Mendes
  */
  public static boolean linearIn(int[] intOuter, int[] intInner) {

    // Creates the variables
    int intCount1 = 0;
    int intCount2 = 0;

    // Checks the inner and outer arrays to see if it is true or false
    for (intCount1 = 0; intCount1 < intInner.length; intCount1++) {
      while (intCount2 < intOuter.length) {

        // Checking to see if the iner array numbers match the outer array numbers
        if (intInner[intCount1] > intOuter[intCount2]) {
          intCount2++;
        }else if (intInner[intCount1] < intOuter[intCount2]) {
          return false;
        }else if (intInner[intCount1] == intOuter[intCount2]) {
          break;
        }
      }
    }

    // Checks to see if the end of the inner array is reached
    if (intCount1 != intInner.length) {
      return false;
    }

    // Returns if the inner array is in the outer array and prints true
    return true;

  }

  /**
  * Prints pascals triange up until the given row and column
  *
  * @param i the row number
  * @param j the column number
  * @author K.Mendes
  */
  public static void pascalTri(int i, int j) throws IOException {
    
    // Creates a new file for the results
    PrintWriter theout = new PrintWriter(new FileWriter("src/gr11review/part2/pascalOut.txt", true));

    // Creates the variables
    int intPascalTriangle[][] = new int[i][j];
    int intRow;
    int intColum;
  
    // Print out row and colum 1
    for (intRow = 0; intRow < i; intRow++) {
      intPascalTriangle[intRow][0] = 1;
    }
    for (intColum = 0; intColum < j; intColum++) {
      intPascalTriangle[0][intColum] = 1;
    }

    // Start applying the pascal pattern 
    for (intRow = 1; intRow < i; intRow++) {
      for (intColum = 1; intColum < j; intColum++) {
        intPascalTriangle[intRow][intColum] = intPascalTriangle[intRow - 1][intColum] + intPascalTriangle[intRow][intColum - 1];
      }
    }

    // Prints out the numbers on the text file
    for (intRow = 0; intRow < i; intRow++) {
      for (intColum = 0; intColum < j; intColum++) {
        theout.print(intPascalTriangle[intRow][intColum] + ", ");
        if (intColum == j - 1) {
          theout.print(" ");
        }

      }

      // Starts a new line
      theout.println();
    }

    // Close the text file
    theout.close();

  }

}
