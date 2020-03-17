/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4assignment;

import java.util.*;

/**
 *
 * @author user
 */
public class Session4Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array >> ");
        int n = sc.nextInt();
        
        int[] myArray = new int[n];
        
        Utility m = new Utility();
        
        m.inputValues(myArray, n);
        
        // #1
        if(m.isNonNegative(myArray, n) && m.isUnique(myArray, n))
        {
            m.splitMaximum(myArray, n);
        }
        
        // #2
        System.out.print("Enter number of rotations >> ");
        int rot = sc.nextInt();
        
        m.moveValuesCircularlyRight(myArray, n, rot);
        
        // #3
        System.out.print("Enter number of rows >> ");
        int r = sc.nextInt();
        
        System.out.print("Enter number of columns >> ");
        int c = sc.nextInt();
        
        int[][] myTwoDimensionalArray = new int [r][c];
        
        m.inputValues(myTwoDimensionalArray, r, c);
        
        m.printValues(myTwoDimensionalArray, r, c);
        
        if(r == c)
        {
            System.out.println("Symmetric : " + m.isSymmetric(myTwoDimensionalArray, r, c));
        }
        
        // #4
        System.out.print("Enter order of magic square >> ");
        int order = sc.nextInt();
        
        if(order >= 3)
        {
            if(order % 2 != 0)
            {
                m.displayOddMagicSquare(order);
            }
            else if(order / 2 % 2 != 0)
            {
                m.displaySinglyEvenMagicSquare(order);
            }
            else if(order / 2 % 2 == 0)
            {
                m.displayDoublyEvenMagicSquare(order);
            }
        }
        else
        {
            System.out.println("Invalid order!");
        }
    }
    
}
