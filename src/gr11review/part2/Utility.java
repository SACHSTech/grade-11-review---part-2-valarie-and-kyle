package gr11review.part2;

import java.io.BufferedReader;

public class Utility {

  public static void main(String[] args){

  }

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

  public static String longestWord(String filenametxt) {
    
    BufferedReader thefile = new BufferedReader(new FileReader(strFileName));

    String strLongestWord = "";
    String strCurrent;

    while (thefile.eof () == false) {
      strCurrent = thefile.readLine();

      if (strCurrent.length () >= strLongestWord.length()) {
        strLongestWord = strCurrent;

      }
      
      thefile.close();
      
    }

    return strLongestWord;

  }

}