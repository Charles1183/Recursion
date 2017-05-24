/*
   Charles Bryant
   ITCS 2214
   Homework 3: Recursion
   01-29-2014
   
   This program demonstrates how recursion works using
   three different mathematical operations.
 
 */


public class SuperRecursion {
    
    static int sum ( int n ) {
    
      if (n == 0) return 0; //returning 0 if n is zero
      return sum(n-1)+n; 
      // sum(n-1) takes in the value for n and substracts one form it.
      // The difference is then used as a reference to a certain slot and calls the element/object in that slot.

    }
    
    static int prod ( int n ) {
 
       if (n == 0) return (n-1)*n;//equation used to give prod (0) the value of zero.
       if (n == 1) return 1;//same as above, but for prod(1) equal to one.
       return prod(n-1)*n;
       //will produce the value for each fatorial of n up to 9.

    }
    
    static int fib ( int n ) {
    
      if (n == 0) return 0;//same as above method
      if (n == 1) return 1;
      return fib(n-2) + fib(n-1);
      //fib(n-2) references the slot above fib(n-1) and adds the value of both slot together.

    }   
}
