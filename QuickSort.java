/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortalgorithms;
import java.util.*;
/**
 *
 * @author SANKET
 */
public class QuickSort {
    private static void sort(int[] A, int low, int high){
        int pivot_loc;
        if (low<high){
            pivot_loc= partition(A,low,high);
            sort(A,low, pivot_loc-1);
            sort(A,pivot_loc+1,high);
        }
    }
    private static int partition(int[] A, int low, int high){
        int pivot=A[low];
        int leftwall=low;
        for (int i=low+1; i<=high; i++){
            if (A[i]<pivot){
                leftwall++;
                int temp;
                temp=A[i];
                A[i]=A[leftwall];
                A[leftwall]=temp; 
                //swap(A[i],A[leftwall]);
            }
        }
        int temp;
        temp=A[low];
        A[low]=A[leftwall];
        A[leftwall]=temp;
        //swap(A[leftwall],A[low]);
        return leftwall;
            
    }
    
    public static void main(String[] args) {
        int[] numbers={3,6,1,8,4,12,5,2,10,7,9,11,15,23,16,17,14};
        int[] sorted= new int[100];        
        
        System.out.println("Array before Sorting: ");
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        } 
        sort(numbers,0,numbers.length-1);
        System.out.println("\n"+"Array after quicksort: ");
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }    
    }
    
}
