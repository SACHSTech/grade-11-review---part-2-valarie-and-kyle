package gr11review.part2;
import java.io.BufferedReader.*;
import java.io.*;
import java.util.*;

public class Utility {

  // Method 1
  public static String zipZap(String str) {

    String strWord = "";
    int intCount;

    if (str.length() <= 3) return str;

    for (intCount = 0; intCount < str.length() - 2; intCount++) {
      if (str.substring(intCount, intCount + 1).equals("z") && str.substring(intCount + 2, intCount + 3).equals("p")) {
        strWord = strWord + str.substring(intCount, intCount +1) + str.substring(intCount + 2, intCount + 3);
        intCount = intCount + 2;
        }else {
          strWord = strWord + str.substring(intCount, intCount + 1);

        }

    }

    return strWord;

  }

  public static String longestWord(String filenametxt) throws IOException {
    
    BufferedReader thefile = new BufferedReader(new FileReader("src/gr11review/part2/" + filenametxt));

    String strLongestWord = "";
    String strCurrent = thefile.readLine();

    while (strCurrent !=null) {

      if (strCurrent.length () >= strLongestWord.length()) {
        strLongestWord = strCurrent;

      }

      strCurrent = thefile.readLine();
      
    }

    thefile.close();


    return strLongestWord;

  }

  public static int[] tenRun(int[] intNums) {

    int intCurrent = 0;
    int intCount;

    for (intCount = 1; intCount < intNums.length; intCount++) {

      if (intNums[intCount] % 10 == 0) {
        intCurrent = intNums[intCount];
      }else if (intNums[intCount] % 10 != 0) {
        intNums[intCount] = intCurrent;
      }

    }

    return intNums;
  }

}