/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quicksort_and_shellsort;

/**
 *
 * @author Absalom
 */
public class shellArray {
   private long[] sArray;          // ref to array theArray
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public shellArray(int max)           // constructor
      {
      sArray = new long[max];      // create the array
      nElems = 0;                    // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      sArray[nElems] = value;      // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      System.out.print("Array = ");
      for(int j=0; j<nElems; j++)    // for each element,
         System.out.print(sArray[j] + " ");  // display it
      System.out.println("");
      }
//--------------------------------------------------------------
   public void shellSort()
      {
      int inner, outer;
      long temp;

      int h = 1;                     // find initial value of h
      while(h <= nElems/3)
         h = h*3 + 1;                // (1, 4, 13, 40, 121, ...)

      while(h>0)                     // decreasing h, until h=1
         {
                                     // h-sort the file
         for(outer=h; outer<nElems; outer++)
            {
            temp = sArray[outer];
            inner = outer;
                                     // one subpass (eg 0, 4, 8)
            while(inner > h-1 && sArray[inner-h] >=  temp)
               {
               sArray[inner] = sArray[inner-h];
               inner -= h;
               }
            sArray[inner] = temp;
            }  // end for
         h = (h-1) / 3;              // decrease h
         }  // end while(h>0)
      }  // end shellSort()
//--------------------------------------------------------------
}
