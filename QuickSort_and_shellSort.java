/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quicksort_and_shellsort;

/**
 *
 * @author Absalom
 */
public class QuickSort_and_shellSort {

    public static void main(String[] args) {
        /**
          * This code creates an object arr of the shellArray class with a maximum size of 10.
          * Ten values are then randomly inserted into the array using the insert() method.
          * The contents of the array are displayed using the display() method before-
          * the array is sorted using the shellSort() method.
          * Finally, the sorted contents of the array are displayed again using the display() method.
          * 
          * The shellSort() method uses the shell sort algorithm to sort the elements of the array.
          * It starts by initializing the variable h to a value that is the largest power of 3 that is-
          * less than or equal to one-third of the array size. It then iteratively reduces h and sorts-
          *the array into sub_arrays of size h, using an insertion sort algorithm. Once h is reduced to 1,
          * the array is fully sorted.
         */
        System.out.println("-------------------------Emplementing shellSort-----------------------------");
        int max=10;
        shellArray arr = new shellArray(max);   // create an array of maximum size 10

        for(int j=0; j<max; j++)  // fill array with
        {                          // random numbers
         long n = (int)(java.lang.Math.random()*99);
         arr.insert(n);
        }

        System.out.println("The array before sorted:");
        arr.display();                         // display the contents of the array

        arr.shellSort();                       // sort the array using shell sort

        System.out.println("The array after sorted:");
        arr.display();                        // display the sorted array
        System.out.println("----------------------------End of shellSort-----------------------------");
        
        /**
           * This code creates an object qArr of the quickArray class with a maximum size of 10.
           * Ten values are then randomly inserted into the array using the insert() method.
           * The contents of the array are displayed using the display() method before-
           * the array is sorted using the quickSort() method.
           * Finally, the sorted contents of the array are displayed again using the display() method.
           * 
           * The quickSort() sort qArr array  elements in ascending  order.
           * It follows the divide-and-conquer approach where a large problem is-
           * broken down into smaller sub-problems that are easier to solve.
         */
        System.out.println("-------------------------Emplementing quickSort---------------------------");
        int qmax=10;
        quickArray qArr=new quickArray(qmax);
         for(int k=0; k<max; k++)              // fill array with
        {                                      // random numbers
         long e = (int)(java.lang.Math.random()*99);
         qArr.insert(e);
        }
         
        System.out.print("The array before sorted:\n");
        qArr.display();                        // display the unsorted array
        
        qArr.quickSort();                      // sort the array using quicksort

        
        System.out.print("The array after sorted:\n");
        qArr.display();                        // display the sorted array
        System.out.println("----------------------------End of quickSort-----------------------------");
    }
    /*
    ***********************RESULTS***********************************
    -------------------------Emplementing shellSort-----------------------------
    The array before sorted:
    Array = 3 12 97 47 65 5 57 19 30 95 
    The array after sorted:
    Array = 3 5 12 19 30 47 57 65 95 97 
    ----------------------------End of shellSort-----------------------------
    -------------------------Emplementing quickSort---------------------------
    The array before sorted:
    Array = 0 41 82 50 86 2 79 79 67 48 
    The array after sorted:
    Array = 0 2 41 48 50 67 79 79 82 86 
    ----------------------------End of quickSort-----------------------------
    */
}
