import java.io.*;
import java.util.*;
public class plusone {
  
  static void AddOne(Vector<Integer> digits)
  {  
  
    // initialize an index (digit of units)
    int index= digits.size() - 1;
  
    // while the index is valid and the value at [index] ==
    // 9 set it as 0
    while (index >= 0 && digits.get(index) == 9){
      digits.set(index, 0);
      index -= 1;
    }
  
    // if index < 0 (if all digits were 9)
    if (index < 0){
      // insert an one at the beginning of the vector
      digits.set(0, 1);
      //Add one extra zero at the end of the vector
      digits.add(digits.size(),0);
  
    }
        
    // else increment the value at [index]
    else
      digits.set(index, digits.get(index) + 1);
  
  }
  
  // Driver code
  public static void main(String[] args)
  {
    Vector<Integer> digits = new Vector<Integer>(Arrays.asList(1,7,8,9));
    AddOne(digits);
    for (int digit : digits)
      System.out.print(digit + " ");
  }
}