

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


            Terminology

            Head: The first node in a linked list 
            Tail: The last node in a linked list 
            pointer: Reference to another node 
            node: An object containing data and pointers(s)

            3--------4--------51--------4--------41--------76
            ^             ^                       ^         ^
            Head          Pointer                 Node      Tail


            Singly vs Doubly Linked List 

            Singly Linked lists only hold a reference to the next
            node. In the implementation you always maintain a reference
            to the head to the linked list and a reference to the tail 
            node for quick additions / removals

            With a doubly linked list each node holds a reference to
            the next and previous node. In the implementation you 
            always maintain a reference to the head and the tail of 
            the doubly linked list to do quick additions/removals
            from both ends of your list 


     */



     /**
     
            Doubly Linked List Source Code 

      */

        public class DoublyLinkedList <T> implements Iterable <T> {
           
           //instances 
            private int size = 0;
            private Node <T> head = null;
            private Node <T> tail = null;

            // Internal node class to represent data 
            private class Node<T> {
                T data;
                Node <T> prev, next;

                //constructor 
                public Node (T data, Node <T> prev, Node <T> next){
                    this.data = data;
                    this.prev = prev;
                    this.next = next;

                }

                //
                @Overide public String toString(){
                    return data.toString();
                }
            }

            // Empty this linked list, 0(n)
            pubic void clear() {
                Node <T> trav = head;
                while(trav != null) {
                    Node<T> next = trav.next;
                }
            }

            // Add an element to the tail of the linked list, 0(1)
            public void add(T elem) {
                addLast(elem);
            }

            // Add an elemement to the beginning of this linked list, 0(1)
            public void addFirst(T elem){

                // The linked list is empty
                if(isEmpty()) {
                    head = tail = new Node <T> (elem, null, null);
                } else {
                    head.prev = new Node<T> (elem, null, head);
                    head = head.prev;
                }
                size++
            }

            //Add a node to the tail of the linked list, 0(1)
            public void addLast(T elem){
                // the linked list is empty 
                if(isEmpty()){
                    head = tail = new Node <T> (elem, null, null);
                } else {
                    tail.next = new Node<T> (elem, tail, null);
                    tail = tail.next;
                } 
                size++;
            }

            // Check the value of the first node if it exist, 0(1)
            public T peekFirst() {
                if(isEmpty()) throw new RuntimeException("Empty list");
                return head.data;
            }

            //Check the value of the last node if it exist, 0(1)
            public T peekLast(){
                if(isEmpty()) throw new RuntimeException("Empty list");
                return tail.data;
            }

            // Remove the first value at the head of the linked list, 0(1)
            public T removeFirst(){

                // can't remove data from an empty list - -
                if(isEmpty()) throw new RuntimeExpection("Empty List");

                // Extract the data at the head and move
                // the head pointer forwards one node
                T data = head.data;
                head = head.next;
                --size;

                // If the list is empty set the tail to null as well
                if(isEmpty()) tail = null;

                // Do a memory clean of the previous node
                else head.prev = null;

                // Return the data that was at the first node we just removed
                return data;


            }
        }

            // Remove the last value at the tail of the linked list 0(1)
            

        // What is a Stack?

        
        /**
            A stack is a one-ended linear data 
            structure which models a real world
            stack by having two primary operations, 
            namely push and pop 

                Data -    -> Data
                  push | |  pop
                       V |
               Top -> Data
                      Data
                      Data
                      Data

         */

<<<<<<< HEAD

        }
=======
         pop()
         push('Onion')
         push('Celery')
         push('Watermelon')          Apple
         pop()                       Potato
         pop()                       Cabbage
         push('Lettuce')             Garlic

         /** i know this stuff im just forcing myself to refresh myself lol
            :D
            
         */

         /**
         
            When and where is a stack used?

            *Used by the undo mechanisms in text editors.
            *Used in compiler syntax checking for matching brackets and braces.
            *Can be used to model a pile of books or plates.
            *Used behind the scenes to support recursion by keeping track
            of previous function calls.  <<<< this is cool 
            Can be used to do a Depth First Search(DFS) on a graph

         
          */
          

          /**
            Bracket - Examples


            invalid bracket example
            [{})[] = invalid bracket structor


             [       {<--------- }                     )[]
            push    push     traverses              traverses
                             checks for             checks for 
                             mirror reversed        mirrred reversed
                             bracket } = yes        bracket ) = no

            Bracket sudo code
            Let S be a stack
            for bracket in bracket_string:

                rev = getReversedBracket(bracket)

                if isLeftBracket(bracket):
                    S.push(bracket)
                Else If S.isEmpty() or S.pop() != rev:
                    return false // Invalid

                return S.isEmpty() // Valid is S is empty 
           */

           /**
           
           Tower of Hanoi = so cool 
           
           If you aren't cleaning up memory properly it will cause 
           memory leaks 
           
           
           */


           /**
                    Stack
                    Source Code 

            */

            public class Stack <T> implements Iterable <T>{
                private java.util.LinkedList <T> list = new java.util.LinkedList<T>();

                //Create an empty stack 
                public Stack (){}

                //Create a Stack with an initial element
                public Stack (T firstElem){
                    push(firstElem);
                }

                //Return the number of elements in the stack 
                public int size(){
                    return list.size();
                }

                //Check if the stack is empty
                public boolean isEmpty(){
                    return size() == 0;
                }

                // Push an element on the stack 
                public void push(T elem) {
                    list.addLast(elem);
                }

                // Pop an elemt off the stack 
                // Throws an error is the stack is empty 
                public T pop(){
                    if(isEmpty())
                        throw new java.util.isEmptyStackException();
                    return list.removeLast();
                }

                public T peek(){
                    if(isEmpty())
                        throw new java.util.EmptyStackException();
                    return list.peek();
                }

                // Allow users to iterate through the stack using an iterator
                @Override public java.util.Iterator <T> iterator (){
                    return list.iterator();
                }


            }

           /**
           Queues
           

            A queue is a linear data structure
            which models real world queues by
            having two primary operations, namely
            enqueue and dequeue

                                  Queue Back
                                   v 
             Dequeue []<-- [][][][][]  <-- [] Enqueue
                ^
                Queue Front

                Queue Terminology

                There does not seem to be consistent
                terminology for inserting and removing 
                elements from a queues.

                Dequeue = polling 
                (These are also sometimes called
                removing, but i find this ambiguous)

                Queue Examples

                Instructions:
                Enqueue(12)
                Dequeue()
                Dequeue()
                Enqueue(7)
                Dequeue()
                Enqueue(-6)

                Front [55][-1][33][17][11] back
        
                

                Adding Elements
                to a Binary Heap


                ways of implementing
                a Priority Queue

                Priority queues are usually
                implemented with heaps since
                this gives them the best possible
                time complexity. 

                The Priority Queue (PQ) is an Abstract 
                Data Type (ADT), hence heaps are not the 
                only way to implement PQs. As an example,
                we could use an unsorted list, but this 
                would not give us the best possible time 
                complexity. 


                Priority Queue With Binary Heap

                There are many types of heaps we 
                could use to implement a priority 
                queue including: 
                    Binary Heap
                    Fibonacci Heap
                    Binomial Heap
                    Pairing Heap


                Priority Queue With
                Binary Heap 

                a binary heap is a binary tree that 
                supports the heap invariant. In a binary
                tree every node has exactly two children.

                if it looks like a parent doesn't have two children
                it's because they are null but they do


                Binary Heap 
                Represebtation

                        0                  9
                  1           2         8      7
                 3  4      5     6     6 5    1  2 
                7 8 9 10 11 12 13 14  2 2 3 40 1 2 1



                Removing Elements 
                From a Binary Heap

                removing the root value is called polling 
                Polling - 0(log(n))
                Removing - 0(n)

                Removing elements from 
                Binary Heap in 0(log(n))

                The inefficiency of the removal algforithm
                comes from the fact that we have to perform 
                a linear search to find out where an element is 
                indexed at. What if instead we did a lookup using 
                a hashtable to find out where a node is indexed at

                a hashtable provides a constant time lookup
                and update for a mapping from a key(the node value ) to a value (the index) 
         
                Removing Elements From 
                Brinary Heap in 0(log(n))

                Node Value      Position(s) 
                (key)           (Value)
                2               0,2,6
                7               1,4
                11              3
                13              5

                     2                  0
                  7      2            1  2
                 117   13 2         3 4 5 6 


                 Removing Elements From 
                 Binary Heap in 0(log(n))

                 Question: If we want to remove a repeated 
                 node in our heap, which node do we remove
                 and does it matter which one we pick 

                 Answer: no it doesn't matter which node 
                 we remove as long as we satisfy
                 the heap invariant in the end.
            */       
            

            import java.util.*

            class PQueue <T extends Comparable<T>> {
                // The Number of elements currently inside the heap
                private int heapSize = 0;

                // The internal capacity of the heap
                private int heapCapacity = 0;

                // A Dynamic list to track the elements inside the heap
                private List<T> heap = null;

                // this map keeps track of the possible indices a particular
                // node value is found in the heap. Having this mapping lets
                // us have 0(log(n)) removals and 0(1) element containment 
                 // check at the cost of some additional space and minor overhead
                 private Map<T, TreeSet<Integer>> map = new HashMap<>();

                 //Construct and initially empty priority queue
                 public PQueue(){
                    this(1);
                 }

                 //Construct a priority queue with an initial capacity
                 public PQueue(int sz){
                    heap = new ArrayList<>(sz);
                 }

                 // Construct a priority queue using heapify
                 // in 0(n) time
                 public PQeue(T[] elems){
                    heapSize = heapCapacity = elems.length;
                    heap = new ArrayList<T>( heapCapacity);

                    // place all element in heap 
                    for(int i =0; i <heapSize; i++){
                        mapAdd(elems[i], i);
                        heap.add(elems[i]);
                    }

                    //heapify process, 0(n)
                    for (int i = Math.max(0,(heapSize/2)-1); i>= 0; i--)
                        sink(i);
                 }

                 //Priority queue construction, 0(nlog(n))
                 public PQueue(Collection<T> elems){
                    this(elems.size());
                    for(T elem : elems) add(elem);
                 }

                 //Returns true/false depending on if the priortity queue is empty
                 public boolean isEmpty(){
                    return heapSize == 0;
                 }

                 //Clears everything inside the heap, 0(n)
                 public void clear(){
                    for(int i = 0; i < heapCapacity; i++)
                        heap.set(i, null);
                    heapSize = 0;
                    map.clear();    
                 }



            }

