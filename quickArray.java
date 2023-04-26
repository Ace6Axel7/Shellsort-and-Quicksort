/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quicksort_and_shellsort;

/**
 *
 * @author Absalom
 */
public class quickArray {
       private long[] qArray;          // ref to array theArray
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public quickArray(int max)          // constructor
      {
      qArray = new long[max];      // create the array
      nElems = 0;                    // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      qArray[nElems] = value;      // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      System.out.print("Array = ");
      for(int j=0; j<nElems; j++)    // for each element,
         System.out.print(qArray[j] + " ");  // display it
      System.out.println("");
      }
//--------------------------------------------------------------
   public void quickSort()
      {
      recQuickSort(0, nElems-1); // insertionSort(0, nElems-1); // the other option
      }
   //--------------------------------------------------------------
   public void recQuickSort(int left, int right)
      {
      if(right-left <= 0)              // if size <= 1,
          return;                      //    already sorted
      else                             // size is 2 or larger
         {
         long pivot = qArray[right];      // rightmost item
                                            // partition range
         int partition = partitionIt(left, right, pivot);
         recQuickSort(left, partition-1);   // sort left side
         recQuickSort(partition+1, right);  // sort right side
         }
      }  // end recQuickSort()
//--------------------------------------------------------------
    public int partitionIt(int left, int right, long pivot)
       {
       int leftPtr = left-1;           // left    (after ++)
       int rightPtr = right;           // right-1 (after --)
       while(true)
          {                            
             
          while( qArray[++leftPtr] < pivot ){}// find bigger item
             
          while(rightPtr > 0 && qArray[--rightPtr] > pivot){}// find smaller item

          if(leftPtr >= rightPtr)      // if pointers cross,
             break;                    //    partition done
          else                         // not crossed, so
             swap(leftPtr, rightPtr);  //    swap elements
          }  // end while(true)
       swap(leftPtr, right);           // restore pivot
       return leftPtr;                 // return pivot location
       }  // end partitionIt()
//--------------------------------------------------------------
   public void swap(int dex1, int dex2)  // swap two elements
      {
      long temp = qArray[dex1];        // A into temp
      qArray[dex1] = qArray[dex2];   // B into A
      qArray[dex2] = temp;             // temp into B
      }  // end swap(
//--------------------------------------------------------------

}