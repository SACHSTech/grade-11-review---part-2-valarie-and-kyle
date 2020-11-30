package gr11review.part2;
import java.io.*;
import java.util.*;
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

  public static void main(String[] args) throws IOException {
    
    String filenametxt = "WordDoc.txt";
    System.out.println(Utility.longestWord(filenametxt));

  }
 
}
