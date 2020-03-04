/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2assignment;

import java.util.*;

/**
 *
 * @author user
 */
public class Session2Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ascii -> digit
        int mask = '\u000F';
        int asc = '0';
        int dig = asc & mask;
        
        System.out.printf("%d\n", dig);
        
        // digit -> ascii
        mask = '\u0030';
        dig = '0';
        asc = dig | mask;
        
        System.out.printf("%d\n", asc);
        
        // reversed array
        int a[] = {1, 2, 3, 4, 5};
        int temp;
        
        System.out.println(Arrays.toString(a));
        
        for(int i = 0; i < a.length / 2; i++)
        {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        
        System.out.println(Arrays.toString(a));
        
        // ArrayPLExercise
        
        // #1
        int[] array1 = new int[10];
        Scanner input1 = new Scanner(System.in);
        
        for(int i = 0; i < array1.length; i++)
        {
            System.out.printf("Enter a number for index %d >> ", i);
            array1[i] = input1.nextInt();
        }
        
        System.out.println(Arrays.toString(array1));
        
        // #2
        int[] array2 = new int[10];
        Scanner input2 = new Scanner(System.in);
        boolean present = false;
        
        for(int i = 0; i < array2.length; i++)
        {
            System.out.printf("Enter a number for index %d >> ", i);
            array2[i] = input2.nextInt();
        }
        
        System.out.println(Arrays.toString(array2));
        
        System.out.print("Enter a number to search >> ");
        int number = input2.nextInt();
        
        for(int i = 0; i < array2.length; i++)
        {
            if(number == array2[i])
            {
                present = true;
                break;
            }
        }
        
        System.out.println(present);
        
        // #3
        int[] array3 = new int[20];
        Scanner input3 = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> zeroes = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        
        for(int i = 0; i < array3.length; i++)
        {
            System.out.printf("Enter a number for index %d >> ", i);
            array3[i] = input3.nextInt();
        }
        
        System.out.println(Arrays.toString(array3));
        
        for(int i = 0; i < array3.length; i++)
        {
            if(array3[i] > 0)
            {
                positiveNumbers.add(array3[i]);
            }
            else if(array3[i] < 0)
            {
                negativeNumbers.add(array3[i]);
            }
            else if(array3[i] == 0)
            {
                zeroes.add(array3[i]);
            }
            
            if(array3[i] % 2 != 0)
            {
                oddNumbers.add(array3[i]);
            }
            else if(array3[i] % 2 == 0)
            {
                evenNumbers.add(array3[i]);
            }
        }
        
        System.out.println(positiveNumbers);
        System.out.println(negativeNumbers);
        System.out.println(zeroes);
        System.out.println(oddNumbers);
        System.out.println(evenNumbers);
        
        // #4
        int[] array4 = {-4, -2, 1, 3, 5};
        int sum = 0, product = 1;
        
        System.out.println(Arrays.toString(array4));
        
        for(int i = 0; i < array4.length; i++)
        {
            sum += array4[i];
            product *= array4[i];
        }
        
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        
        // #5
        int[] array5 = {-3, -1, 2, 4, 6};
        int max = array5[0], min = array5[0];
        
        System.out.println(Arrays.toString(array5));
        
        for(int i = 0; i < array5.length; i++)
        {
            if(max < array5[i])
            {
                max = array5[i];
            }
            else if(min > array5[i])
            {
                min = array5[i];
            }
        }
        
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        
        // #6
        int[] array6 = {3, 2, 1, 2, 3};
        boolean same = true;
        
        System.out.println(Arrays.toString(array6));
        
        for(int i = 0; i < array6.length; i++)
        {
            if(array6[i] != array6[array6.length - i - 1])
            {
                same = false;
                break;
            }
        }
        
        System.out.println(same);
        
        // #7
        int[] array7 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] splittedArray1 = new int[array7.length / 2];
        int[] splittedArray2 = new int[array7.length / 2];
        
        System.out.println(Arrays.toString(array7));
        
        for(int i = 0; i < array7.length; i++)
        {
            if(i < array7.length / 2)
            {
                splittedArray1[i] = array7[i];
            }
            else if(i >= array7.length / 2)
            {
                splittedArray2[i - array7.length / 2] = array7[i];
            }
        }
        
        System.out.println(Arrays.toString(splittedArray1));
        System.out.println(Arrays.toString(splittedArray2));
        
        // #8
        int[] array8 = {4, 8, 6, 3, 2};
        int maximum = array8[0], nextMaximum = array8[0];
        
        for(int i = 0; i < array8.length; i++)
        {
            System.out.print(array8[i] + " ");
            
            if(maximum < array8[i])
            {
                maximum = array8[i];
            }
        }
        
        System.out.println();
        
        for(int i = 0; i < array8.length; i++)
        {
            if(nextMaximum < array8[i] && array8[i] < maximum)
            {
                nextMaximum = array8[i];
            }
        }
        
        for(int i = 0; i < array8.length; i++)
        {
            if(array8[i] == maximum)
            {
                System.out.print(nextMaximum + " " + (maximum - nextMaximum) + " ");
            }
            else
            {
                System.out.print(array8[i] + " ");
            }
        }
        
        System.out.println();
        
        // #9
        int[] array9 = {1, 2, 3, 4, 5};
        int tempCircular = array9[array9.length - 1];
        
        for(int i = 0; i < array9.length; i++)
        {
            System.out.print(array9[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 1; i <= array9.length; i++)
        {
            if(i < array9.length)
            {
                array9[array9.length - i] = array9[array9.length - i - 1];
            }
            else if(i == array9.length)
            {
                array9[0] = tempCircular;
            }
        }
        
        for(int i = 0; i < array9.length; i++)
        {
            System.out.print(array9[i] + " ");
        }
        
        System.out.println();
        
        // #10
        int[] array10 = {8, 4, 0, 2, 6};
        int tempSort;
        
        System.out.println(Arrays.toString(array10));
        
        for(int i = 0; i < array10.length; i++)
        {
            for(int j = i + 1; j < array10.length; j++)
            {
                if(array10[j] < array10[i])
                {
                    tempSort = array10[j];
                    array10[j] = array10[i];
                    array10[i] = tempSort;
                }
            }
        }
        
        System.out.println(Arrays.toString(array10));
    }
    
}
