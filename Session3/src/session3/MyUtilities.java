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
public class MyUtilities {
    public void inputValues(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < n; i++)
        {
            System.out.printf("Enter a number for index %d >> ", i);
            a[i] = sc.nextInt();
        }
    }
    
    public String printValues(int[] a) {
        return Arrays.toString(a);
    }
    
    public boolean isFound(int[] a, int n, int key) {
        boolean present = false;
        
        for(int i = 0; i < n; i++)
        {
            if(key == a[i])
            {
                present = true;
                break;
            }
        }
        
        return present;
    }
    
    public void categorizeValues(int[] a, int n) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> zeroes = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
        {
            if(a[i] > 0)
            {
                positiveNumbers.add(a[i]);
            }
            else if(a[i] < 0)
            {
                negativeNumbers.add(a[i]);
            }
            else if(a[i] == 0)
            {
                zeroes.add(a[i]);
            }
            
            if(a[i] % 2 != 0)
            {
                oddNumbers.add(a[i]);
            }
            else if(a[i] % 2 == 0)
            {
                evenNumbers.add(a[i]);
            }
        }
        
        System.out.println(positiveNumbers);
        System.out.println(negativeNumbers);
        System.out.println(zeroes);
        System.out.println(oddNumbers);
        System.out.println(evenNumbers);
    }
    
    public void printSumAndProduct(int[] a, int n) {
        int sum = 0, product = 1;
        
        for(int i = 0; i < n; i++)
        {
            sum += a[i];
            product *= a[i];
        }
        
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
    
    public void printMaxAndMin(int[] a, int n) {
        int max = a[0], min = a[0];
        
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
            else if(min > a[i])
            {
                min = a[i];
            }
        }
        
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
    
    public boolean isUnique(int[] a, int n) {
        boolean same = true;
        
        for(int i = 0; i < n; i++)
        {
            if(a[i] != a[n - i - 1])
            {
                same = false;
                break;
            }
        }
        
        return same;
    }
    
    public void splitArray(int[] a, int n) {
        int[] splittedArray1 = new int[n / 2];
        int[] splittedArray2 = new int[n / 2];
        
        for(int i = 0; i < n; i++)
        {
            if(i < n / 2)
            {
                splittedArray1[i] = a[i];
            }
            else if(i >= n / 2)
            {
                splittedArray2[i - n / 2] = a[i];
            }
        }
        
        System.out.println(Arrays.toString(splittedArray1));
        System.out.println(Arrays.toString(splittedArray2));
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
    
    public void moveValuesCircularlyRight(int[] a, int n) {
        int temp = a[n - 1];
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 1; i <= n; i++)
        {
            if(i < n)
            {
                a[n - i] = a[n - i - 1];
            }
            else if(i == n)
            {
                a[0] = temp;
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
    }
    
    public String sortValues(int[] a, int n) {
        int temp;
        
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[j] < a[i])
                {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        
        return Arrays.toString(a);
    }
}
