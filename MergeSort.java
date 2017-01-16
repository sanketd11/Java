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
public class MergeSort {
    
    private static int[] mergesort(int[] a){
        if (a.length!=1){
            int mid;
            mid=a.length/2;
            int l= mid;
            int r=a.length -mid;
            int f=l+r;
            int[] left=new int[l];
            int[] right=new int[r];
            int[] Final=new int[f];
    
            for(int i=0;i<l;i++){
                left[i]=a[i];
            }
            for(int i=0;i<r;i++){
                right[i]=a[i+mid];
            }           
            left=mergesort(left);
            right=mergesort(right);
            //Merge two arrays after sorting
            int i=0;
            int j=0;
            int k=0;
            while(i< left.length && j<right.length){
                if(left[i] < right[j]){
                   Final[k]=left[i];
                   i++;
                   k++;
                }else{
                    Final[k]=right[j];
                    j++;
                    k++;
                }
            }
            while(i<left.length){
                Final[k]=left[i];
                i++;
                k++;
            }
            while(j<right.length){
                Final[k]=right[j];
                j++;
                k++;
            }
            return Final;
        }else{
            return a;
        }
   }
    
    public static void main(String[] args){
        
        int[] list={3,6,1,8,4,12,5,2,10,7,9,11,15,23,16,17,14};
        int g=list.length;
        System.out.println("Array Before Sorting");
        for (int i=0; i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Array Afer Merge Sort");
        int[] sorted = new int[g];
        sorted = mergesort(list);
        for (int i=0; i<sorted.length;i++){
            System.out.print(sorted[i]+" ");
        }
    }
}
