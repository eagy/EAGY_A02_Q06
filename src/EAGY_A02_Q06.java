/*
 * This program prints a diamond with the * symbol. 
 * 
 * Completion Time: 1 hour
 * 
 * @author Daniel Eagy
 * @version 1.0
 */
public class EAGY_A02_Q06 {
    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        final int MAX_STARS = 9;
        
        for (int row = 0; row <= MAX_ROWS/2; row++) {
            for (int space = 0; space < (MAX_STARS/2-row + 1); space++)
                System.out.print(" ");
            for (int star = 0; star < row; star++)
                System.out.print("*");
            for (int star = 1; star < row; star++)
                System.out.print("*");            
            System.out.println();
        }
        
        for (int row = MAX_ROWS/2; row >= 0; row--) {
            for (int space = 0; space < (MAX_STARS/2-row + 1); space++)
                System.out.print(" ");
            for (int star = 0; star < row; star++)
                System.out.print("*");
            for (int star = 1; star < row; star++)
                System.out.print("*");            
            System.out.println();            
        }
        
    }
    
}
