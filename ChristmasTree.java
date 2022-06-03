package mypackage;

import java.util.Random;

public class ChristmasTree {
    public static void main(String[] args) {
        
        /* for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            for (int j = 0; j < Integer.parseInt(args[1]) - i; j++)
             System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
             System.out.print("*");
            System.out.println();
        }
        */
        int rows = Integer.parseInt(args[0]);
        int height = 1;
        String[] array = {"*", "o", ".", "c"};

        // controls height (num of blocks)
        for (int h = 0; h < height; h++) {
            // loop through rows
            for (int r = 1; r <= rows; r++) {
                // number in rows
                for (int c = 0; c < rows - r; c++){
                    System.out.print(" ");
                }
                for (int c = 0; c < 2 * r - 1; c++){
                    int rnd = new Random().nextInt(array.length);
                    System.out.print(array[rnd]);
                }
                System.out.println();
            }
        }
        

    }
}
