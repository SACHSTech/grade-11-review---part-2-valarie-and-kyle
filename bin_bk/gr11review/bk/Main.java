package gr11review.part2;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;


public class Main{
  public static void main (String[] args) throws IOException{
  
  //}
  //String myTx = "h";
  
  int x = 0;
  int y = 0;
  int z = 0;
  String str;

  //public static void main (String[] args){

  /*int y = 0;
  int z = 8;
  System.out.println("hell no I dont wanna do this");
   Main myObj = new Main();
   System.out.println(myObj.x);
   //Utility myObj2 = new Utility();
   System.out.println(Main.add(2,4));

   for (int i = 0; i< 6;i++){
     System.out.println(Utility.add(y,z));
     y = y + 1;
   }
  */
  
  
  BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
  Scanner myInput = new Scanner(System.in);
  
  //FILE IO (complete)
  System.out.println("FILE IO");
  File WordBank = new File ("src/gr11review/part2/WordBank.txt");
  BufferedReader thefile = new BufferedReader(new FileReader(WordBank));
  String words = "";
  words = thefile.readLine();
  System.out.println(Utility.alphaWord(words));
  thefile.close();

  //array 2 (complete)
  System.out.println("Array2");
  str = keyboard.readLine();
  System.out.println(Utility.sumNumbers(str));
  
  //int[] nums = {0};
  //int val = 0;
  //int input;
  //input =Integer.parseInt(keyboard.readLine());
  //System.out.println(Utility.notAlone(nums, val));
  
  //canBalance (complete)
  boolean Balance;
  System.out.println("canBalance");
  int[] nums ={0};
  int input;
  input =Integer.parseInt(keyboard.readLine());
  System.out.println(Utility.canBalance(nums));
  
  
  //Dimension (complete)
  int sizee = 4;
  
  
  //System.out.println(diagonal(4));
  }
  
}

