package gr11review.bk;

//import java.io.*;


public class bk_Utility {  
 // Method 2 (complete)
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

//Array 2 One Dimension
public static int[] notAlone(int[] nums, int val) {
 for (int i= 1;i<nums.length -1;i++){
  if (nums[i] == val)
  if (nums[i-1] != nums[i] && nums[i+1] != nums[i])
   if (nums[i+1] > nums[i-1]) nums[i] = nums[i+1];
   else if (nums[i+1] < nums[i-1]) nums[i] = nums[i-1];
   }
   return nums;
}

//File IO 2
public static String alphaWord(String words){
  BufferedReader thefile = new BufferedReader(new FileReader("WordBank.txt"));
  words = thefile.readLine();
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
  thefile.close();
}

// Array 4 One Dimension (2 loops) (complete)
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
  }

public static void diagonal(int n){
  int[] dimension;
  dimension = new Int [n][n];

  }
}

  
  

//}

