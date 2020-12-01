package gr11review.part2;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import gr11review.part2.Utility.*;

// javac -d bin -sourcepath src -cp bin src/gr11review/part2/Main.java
// java -cp bin gr11review.part2.Main


public class Main {

  public static void main(String[] args) throws IOException {
    
    // Method 1
    /**
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    String strPattern;
    String strFinalWord;
    strPattern = keyboard.readLine();
    strFinalWord = Utility.zipZap(strPattern);
    System.out.println(strFinalWord); 
    */   
    
    // FileIO 1
    /**
    String filenametxt = "WordDoc.txt";
    System.out.println(Utility.longestWord(filenametxt));
    */

    // Array 1
    /**
    int[] nums = {2, 10, 3, 4, 20, 5};
    nums = Utility.tenRun(nums);

    System.out.println(Arrays.toString(nums)); 
    */

    // Array 3
    /**
    int[] outer = {1, 2, 4, 4, 6}; 
    int[] inner = {2, 4}; 
    System.out.println(Utility.linearIn(outer, inner));
    */    
  
    // Array 5
    // Utility.pascalTri(5, 6);

  }
 
}
