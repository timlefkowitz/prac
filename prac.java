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
