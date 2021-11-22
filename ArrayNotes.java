import java.util.GregorianCalendar;

/**
 * Write a description of class Notes here.
 * 
 * @author mrcallaghan 
 * @version 22nov2021
 */
public class ArrayNotes
{
    
    public static void createArrayOfEvens()
    {
        /*
         * An array is an ordered collection of elements of the same type. The type can be a primitive
         *      type (e.g., int) or a class (e.g., Turtle).
         *      
         *      An array variable is like an object variable in that it must be declared and initialized.
         *      
         *      The number in the square brackets (i.e.[]) specifies the number of elements in the array.
         *      
         *      All elements in the array are initialized to their default value (e.g. 0, false, null)
         *      
         *      This code create an array taht contains 10 int values (all 0 to start).
         */
        int[] evens = new int[10];
        
        for(int i = 0; i < evens.length; i++)
        {
            System.out.println(i + ": " + evens[i]);
        }
        
        /*
         * Set the value of each element in the array to the first 10 positive even integers.
         * 
         * "length" is used to  query the number of element in the array.
         * 
         * Square brackets are used to reference a specific element in the array based on its index.
         *      Indices are zero-based.
         */
        for(int i = 0; i < evens.length; i++)
        {
            evens[i] = (i + 1) * 2;
        
        }
        
        // print the reference to the array
        System.out.println(evens);
        
        for(int i = 0; i < evens.length; i++)
        {
            System.out.println(i + ": " + evens[i]);
        }
        
        
        
        
    }
    
    public static void createArrayOfOdds()
    {
        /*
         * An array literal (i.e., curly brackets and comma-separated valuses) can be used to initialize
         *  an array.  The size of the array is inferred based on the number of elemenct in the literal.
         */
        
        int[] odds = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        
        /*
         * Bounds error
         * 
         * Arrays have a fixed size once initialized.  The index specified must refer to a valid element.  
         *      Otherwise, an ArrayIndexOutOfBounds exception is generated.
         */
        for (int i = 0; i <= odds.length; i++)
        {
            //System.out.println(i + ": " + odds[i]);
            
        }
        
        /*
         * Array references
         * 
         * Variables of type array, contain a reference to the array stored in the computer's memory.
         * 
         * Assigning one array variable's value to another, copies the reference, not the array's elements.
         */
        int[] moreOdds = odds;
        odds[2] = 6;
        System.out.println(moreOdds[2]);
        
        /*
         * Enhanced for loop
         * 
         * Iterates over the elements in an array.
         * Similar to the "for value in ... " structure in Python.
         */
        for(int odd : odds)
        {
            System.out.println(odd);
        }
        
        /*
         * Limitations of Enhanced for loops
         * 
         * The local variable (e.g. odd) contains a copy of the value of the element in the array.
         * 
         * We cannot modify the element in that array.
         * We cannot easily determine the index of an element.
         */
        
        for(int odd : odds)
        {
            odd += 1;
        }
        for(int odd : odds)
        {
            System.out.println(odd);
        }
    }
    
    
    
    
    
    
}
