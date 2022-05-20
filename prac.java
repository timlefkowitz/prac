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
}
}
