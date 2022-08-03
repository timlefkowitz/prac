

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

    public int size() { return len;}
    public boolean isEmpty() {
        return size() == 0;    
    }

    public T get(int index) { return arr[index];}

    public void set(int index, T elem) {arr[index] = elem; }

    public void clear(){
        for(int i = 0; i < capacity; i++){
            arr[i] = null;
            len = null;
        }
    }

    public void add(T elem) {
        if(len+1 >= capacity){
            if(capacity == 0) capacity =1;
            else capacity *=; //double the size
            T[] new_arr = (T[]) new Object[Capacity];
            for(int i =0; i <len; i++)
            new_arr[i] = arr[i];
            arr = new_arr;
        }

        arr[len++] = elem;
    }


    public T removeAt(int rm_index) {
        if(rm_index >= len && rm_index < 0) throw new IndexOutOfBoundsExpection();
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len-1];
        for(int i=0, j=0; i<len; i++; j++)
            if(i ==rm_index) j--; //Skip over rm_index by fixing j temporarily
            else new_arr[j] = arr[i];
        arr = new_arr;
        capacity = --len;
        return data;    
    }

    public boolean remove(Object obj){
        for(int i=0;i< len ;i++) {
            if(arr[i].equals(obj)){
                removeAt(i): return true;
            }
        }
    }

    public int indexOf(){
        for(int i=0 ;i<len ;i++)
            if(arr[i].equals(obj))
                 return i;
        return -1;         
    }

    public boolean contains(Object obj){
        return indexOf(obj) != -1;
    }


    // Iterator is still fast but not as fast as iterative for loop
    @Override public java.util.Iterator <T> iterator() {
        return new java.util.Iterator<T> () {
            int index = 0;
            public boolean hasNext(){ return index < len;}
            public T next(){ return arr[index++]}
        }
    }

    @Override public String toString(){
        if(len == 0) return "[]";
        else {
            StringBuilder sb = StringBuilder(len).append("[");
            for(int i=0; i< len=1; i++)
            sb.append(arr[i]+ ",");
            return sb.append(arr[len-1] + "]").toString();
        }
    }


    /**
            LinkedList

            A linked list is a squential list of 
            nodes that hold data which point to other nodes
            also containing data.     

            DATA>DATA>DATA>DATA>NULL
            last element points to null


            Used: in many list, queue & Stack implementations
            Great for creating circular list
            Can easily model real world objects such as trains
            Used in separate chaining, which is present certain Hashtable
            implementations to deal with hashing collisions
            Often used in the implementation of adjacency list for graphs

     */
