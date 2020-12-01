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

  public static boolean linearIn(int[] outer, int[] inner) {

    int intCount1 = 0;
    int intCount2 = 0;

    for (intCount1 = 0; intCount1 < inner.length; intCount1++) {
      while (intCount2 < outer.length) {
        if (inner[intCount1] > outer[intCount2]) {
          intCount2++;
        }else if (inner[intCount1] < outer[intCount2]) {
          return false;

        }else if (inner[intCount1] == outer[intCount2]) {
          break;
        }

      }

    }

    if (intCount1 != inner.length) {
      return false;

    }

    return true;

  }

  public static void pascalTri(int i, int j) {
    PrintWriter theout = new PrintWriter(new FileWriter("pascalOut.txt", true));

    int intRow;
    int intColum;
    int intPascalTriangle[] = new int[i][j];

    // First print out row and colum 1
    for (intRow = 0; intRow < i; intRow++) {
      intPascalTriangle[intRow][0] = 1;
    }
    for (intColum = 0; intColum < j; intColum++) {
      intPascalTriangle[0][intColum] = 1;
    }

    for (intRow = 1; intRow < i; intRow++) {
      for (intColum = 1; intColum < j; intColum++) {
        intPascalTriangle[intRow][intColum] = intPascalTriangle[intRow - 1][intColum] + intPascalTriangle[intRow][intColum - 1];
      }
    }

    for (intRow = 0; intRow < i; intRow++) {
      for (intColum = 0; intColum < j; intColum++) {
        theout.print(intPascslTriangle[intRow][intColum] + ", ");
        if (intColum ==j - 1) {
          theout.print(" ");
        }

      }
    }

    theout.close();



    for (intCount)


  }

}