/*
===================================

    Messing with subStrings
===================================
*/


public class HelloWorld{

     public static void main(String []args){
         
         String word = "Barefoot";
         // index       01234567
         String sub7 = word.substring(1, 4); //are
         String sub8 = word.substring(2,3) + word.substring(5, 7) + word.substring(4, 5); // roof
        System.out.println(sub7);
        System.out.println(sub8);
     }
}




public class MyClass {
    public static void main(String args[])
    {
        ArrayList<Integer> numList = new ArrayList<Integer> ();
        numList.add(4);numList.add(5); numList.add(6); numList.add(8);
        
        numList.set(1, 3);
        numList.remove(1);
        
        System.out.println("The ArrayList is empty :: " + numList.isEmpty());

        System.out.println("The ArrayList contains 5 :: " + numList.contains(5));
        numList.clear();
        
        for(int i = 0; i < numList.size(); i++){
            System.out.print(numList.get(i) + " ");
            System.out.println("\n");
        }
        
        for(Integer num: numList){
            System.out.print(num + " ");
            System.out.println("\n");
        }
        System.out.println("\n");
     // int x=10;
     // int y=25;
     // int z=x+y;

     // System.out.println("Sum of x+y = " + z);
    }
    
    
    import java.util.*;

class Main {
  public static void main(String[] args) {

    int[] test = {1, -4, 2, 3, 4, -1, 5};
    System.out.println(complementPair(test));
  }

  /*
  
  TODAYS OUTCO LIVE COING SESSION

  Complement Pair 

  input: int[]
  output: ArrayList<Integer> 

  input: {1, -4, 2, 3, 4, -1, 5}
  ouptut: {1, 4}

  Objective: return arraylist of positive integers that have a 
             complement negative integer


  Notes: 
  - 
  
  */


  /*


           i
arr = {1, -4, 2, 3, 4, -1, 5}

current = 2
complement = -2

matches = {1, }


1 my understanding : finding complement elements positive or negitive 
2. my example: int[] myArray = [1 ,4 6, -4 , 8 ,3 ];
output : 4
3. 

ArrayList<int> matches = new ArrayList<int>();

for (int i = 0; i < arr.length; i++) {

  int current = arr[i];
  int complement = -current;

  if(arr.contains(complement)){
    matches.add(complement); 
  }

  return matches;
}

while (int i = 0; i < complementPair.size()); i++; {

}
*/

  public static ArrayList<Integer> complementPair(int[] arr) {
    ArrayList<Integer> matches = new ArrayList<Integer>();

    ArrayList<Integer> arrList = new ArrayList<Integer>();

    for (int i = 0; i < arr.length; i++) {
      arrList.add(arr[i]);
    }
    
    for (int i = 0; i < arr.length; i++) {
      int current = arr[i];
      int complement = -1 * current;
    
      if(arrList.contains(complement)){
        
        if(current > 0){
          matches.add(current); 
        }
      }
    }
  
    return matches;
  }
}
}
}
