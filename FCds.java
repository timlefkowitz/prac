

/**

        Big-0 Notation 
        n - The size of the input 
        Complexities ordered in from smallest to largest 

        Contant Time: 0(1)
        Logarithmic Time: 0(log(n))
        Linear Time: 0(n)
        Linearithmic Time: 0(n2)
        Cubic Tme: 0(n3)
        Exponential Time: 0(bn), b > 1
        Factorial Time: 0(n!)

        Big-0 Properties

        0(n+c) = 0(n)
        0(cn) = 0(n), c > 0

        let f be a function that describes the running time
        of a particular algorithm for an input of size n :

        // n3 is our biggest term
        f(n) = 7log(n)3 + 15n2 + 2n3 + 8

            0(f(n)) = 0(n3)


        [][] EXAMPLES   [][]

        CONSTANT TIME 0(1)
        a := 1
        b := 2
        c := a + 5*b
        i := 0
        While i < 11 Do 
            i = i +1    

        LINEAR TIME: 0(n)
        i := 0
        While i < n Do 
            i = i + 1

            f(n) = n
            0(f(n)) = 0(n)
        i := 0
        While i < n Do 
            i = i + 3

            f(n) = n/3
            0(f(n)) = 0(n)   

        Both of the following run in quadratic time.
        The first may be obious since n work done n
        times is n*n = 0(n2)

        but what about the second one?

        for (i := 0 ; i < n; i = i + 1)
            for (j := 0 ; j < n; j = j + 1)
           
         f(n) = n*n = n2, 0(f(n)) = 0(n2)

        for (i := 0 ; i < n; i = i + 1)
            for (j := i ; j < n; j = j + 1)
                      ^0 preplaced with i    

 /*

/**
        Static and Dynamic Arrays

        COmplexity

                Static Array Dynamic Array
        Access     0(1)          0(1)
        Search     0(n)          0(n)
        Insertion  N/A           0(n)
        Appending  N/A           0(1)
        Deletion   N/A           0(n)





 */

 @SuppressWarnings("unchecked")
 public class Array <T> implements Iterable <T>{
    private T [] arr;
    private int len arr; //the length the user thinks the array is 
    private capacity = 0; // Actual array size 
    

    public Array(){this(16);}

    public Array(int capacity){
        if(capacity < 0) throw new IllegalArumentException("Illegal Capacity: " + capactiy);
        arr = (T[]) new Object[capacity];
    }