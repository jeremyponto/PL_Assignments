/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3;

import java.util.*;

/**
 *
 * @author user
 */
public class Session3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array >> ");
        int n = sc.nextInt();
        
        int[] myArray = new int[n];
        MyUtilities m = new MyUtilities();
        
        // #1
        m.inputValues(myArray, n);
        
        System.out.println(m.printValues(myArray));
        
        // #2
        System.out.print("Enter a number to search >> ");
        int key = sc.nextInt();
        
        System.out.println(m.isFound(myArray, n, key));
        
        // #3
        m.categorizeValues(myArray, n);
        
        // #4
        m.printSumAndProduct(myArray, n);
        
        // #5
        m.printMaxAndMin(myArray, n);
        
        // #6
        System.out.println(m.isUnique(myArray, n));
        
        // #7
        m.splitArray(myArray, n);
        
        // #8
        if(m.isUnique(myArray, n) == true) {
            m.splitMaximum(myArray, n);
        }
        
        // #9
        m.moveValuesCircularlyRight(myArray, n);
        
        // #10
        System.out.println(m.sortValues(myArray, n));
    }
    
}
