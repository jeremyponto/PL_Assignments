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
public class Utility {
    public void inputValues(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < n; i++)
        {
            System.out.printf("Enter a number for index %d >> ", i);
            a[i] = sc.nextInt();
        }
    }
    
    public boolean isNonNegative(int[] a, int n) {
        boolean nonNegative = true;
        
        for(int i = 0; i < n; i++)
        {
            if(a[i] < 0)
            {
                nonNegative = false;
                
                return nonNegative;
            }
        }
        
        return nonNegative;
    }
    
    public boolean isUnique(int[] a, int n) {
        boolean unique = true;
        
         for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] == a[j])
                {
                    unique = false;
                    
                    return unique;
                }
            }
        }
        
        return unique;
    }
    
    public void splitMaximum(int[] a, int n) {
        int maximum = a[0], nextMaximum = a[0];
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
            
            if(maximum < a[i])
            {
                maximum = a[i];
            }
        }
        
        System.out.println();
        
        for(int i = 0; i < n; i++)
        {
            if(nextMaximum < a[i] && a[i] < maximum)
            {
                nextMaximum = a[i];
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            if(a[i] == maximum)
            {
                System.out.print(nextMaximum + " " + (maximum - nextMaximum) + " ");
            }
            else
            {
                System.out.print(a[i] + " ");
            }
        }
        
        System.out.println();
    }
    
    public void moveValuesCircularlyRight(int[] a, int n, int rot) {
        int temp;
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 0; i < rot; i++)
        {
            temp = a[n - 1];
            
            for(int j = 1; j <= n; j++)
            {
                if(j < n)
                {
                    a[n - j] = a[n - j - 1];
                }
                else if(j == n)
                {
                    a[0] = temp;
                }
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
    }
    
    public void inputValues(int[][] a, int r, int c) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.printf("Enter a number for row %d column %d >> ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public void printValues(int[][] a, int r, int c) {
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.printf("%d ", a[i][j]);
            }
            
            System.out.println();
        }
    }
    
    public boolean isSymmetric(int[][] a, int r, int c) {
        boolean symmetric = true;
        
        for(int i = 0; i < r - 1; i++)
        {
            for(int j = i + 1; j < c; j++)
            {
                if(a[i][j] != a[j][i])
                {
                    symmetric = false;
                    
                    return symmetric;
                }
            }
        }

        return symmetric;
    }
    
    public int[][] createOddMagicSquare(int order) {
        int[][] magicSquare = new int[order][order];
        int r = 0;
        int number = 0;
        int size = order * order;
        int c = order / 2;
        
        while (number++ < size)
        {
            magicSquare[r][c] = number;
            if (r == 0)
            {
                if (c == order - 1)
                {
                    r++;
                }
                else
                {
                    r = order - 1;
                    c++;
                }
            }
            else
            {
                if(c == order - 1)
                {
                    r--;
                    c = 0;
                }
                else
                {
                    if(magicSquare[r - 1][c + 1] == 0)
                    {
                        r--;
                        c++;
                    }
                    else
                    {
                        r++;
                    }
                }
            }
        }
        return magicSquare;
    }
    
    public void displayOddMagicSquare(int order) {
        for(int[] row: createOddMagicSquare(order))
        {
            for(int number: row)
            {
                System.out.printf("%2s ", number);
            }
            
            System.out.println();
        }
        
        System.out.printf("Magic constant = %d\n", (order * order + 1) * order / 2);
    }
    
    public int[][] createSinglyEvenMagicSquare(int order) {
        int size = order * order;
        int halfOrder = order / 2;
        int subMagicSquareSize = size / 4;
        int[][] subMagicSquare = createOddMagicSquare(halfOrder);
        int[] quadrantFactors = {0, 2, 3, 1};
        int[][] magicSquare = new int[order][order];
        
        for (int r = 0; r < order; r++)
        {
            for (int c = 0; c < order; c++)
            {
                int quadrant = (r / halfOrder) * 2 + (c / halfOrder);
                
                magicSquare[r][c] = subMagicSquare[r % halfOrder][c % halfOrder];
                magicSquare[r][c] += quadrantFactors[quadrant] * subMagicSquareSize;
            }
        }
        
        int numberOfLeftColumns = halfOrder / 2;
        int numberOfRightColumns = numberOfLeftColumns - 1;
 
        for (int r = 0; r < halfOrder; r++)
        {
            for (int c = 0; c < order; c++)
            {
                if (c < numberOfLeftColumns || c >= order - numberOfRightColumns || (c == numberOfLeftColumns && r == numberOfLeftColumns))
                {
                    if (c == 0 && r == numberOfLeftColumns)
                    {
                        continue;
                    }
                    
                    int temp = magicSquare[r][c];
                    
                    magicSquare[r][c] = magicSquare[r + halfOrder][c];
                    magicSquare[r + halfOrder][c] = temp;
                }
            }
        }
 
        return magicSquare;
    }
    
    public void displaySinglyEvenMagicSquare(int order) {
        for (int[] row: createSinglyEvenMagicSquare(order))
        {
            for (int number: row)
            {
                System.out.printf("%2s ", number);
            }
            
            System.out.println();
        }
        
        System.out.printf("Magic constant = %d\n", (order * order + 1) * order / 2);
    }
    
    public int[][] createDoublyEvenMagicSquare(int order) {
        int bits = 0b1001_0110_0110_1001;
        int size = order * order;
        int multiples = order / 4;
        int[][] magicSquare = new int[order][order];
        
        for(int r = 0, i = 0; r < order; r++)
        {
            for(int c = 0; c < order; c++, i++)
            {
                int bitPosition = c / multiples + (r / multiples) * 4;
                
                magicSquare[r][c] = (bits & (1 << bitPosition)) != 0 ? i + 1 : size - i;
            }
        }
        
        return magicSquare;
    }
    
    public void displayDoublyEvenMagicSquare(int order) {
        for(int[] row: createDoublyEvenMagicSquare(order))
        {
            for(int number: row)
            {
                System.out.printf("%2s ", number);
            }
            
            System.out.println();
        }
        
        System.out.printf("Magic constant = %d\n", (order * order + 1) * order / 2);
    }
}
