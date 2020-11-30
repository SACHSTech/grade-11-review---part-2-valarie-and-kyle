package gr11review.part2;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import gr11review.part2.Utility.*;

// javac -d bin -sourcepath src -cp bin src/gr11review/part2/Main.java
// java -cp bin gr11review.part2.Main


public class Main {

/**
  public static void main(String[] args) throws IOException {
    
   BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    String strPattern;
    String strFinalWord;
    strPattern = keyboard.readLine();
    strFinalWord = Utility.zipZap(strPattern);
    System.out.println(strFinalWord);
    
  */

  /** 
  public static void main(String[] args) throws IOException {
    
    String filenametxt = "WordDoc.txt";
    System.out.println(Utility.longestWord(filenametxt));

  }
  */

  public static void main(String[] args) throws IOException {
    
    int[] nums = {2, 10, 3, 4, 20, 5, 30, 5,6,7,8, 100, 6, 7};
    nums = Utility.tenRun(nums);

    System.out.println(Arrays.toString(nums));
    

  }


 
}
