/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcshin
 */
public class RecursionDriver {

    
    public static void main ( String [] args ) {
        for ( int i = 0; i < 10; i++ ) {
            System.out.println ( "sum(" + i + ") = " + SuperRecursion.sum(i) );
        }
        
        for ( int i = 0; i < 10; i++ ) {
            System.out.println ( "prod(" + i + ") = " + SuperRecursion.prod(i) );
        }
        
        for ( int i = 0; i < 10; i++ ) {
            System.out.println ( "fib(" + i + ") = " + SuperRecursion.fib(i) );
        }
        
        
    }
    
    
}
