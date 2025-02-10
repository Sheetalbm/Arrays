//Find the Second Largest Element in an Array

import static java.lang.Integer.MAX_VALUE;

public class SecondLargestElement {

    static int SecondLargest(int arr[]){
     int firstLargest = Integer.MAX_VALUE, secondLargest = Integer.MIN_VALUE;

     for(int i=0;i<arr.length-1;i++){
         if(arr[i]>secondLargest){
             firstLargest = arr[i];
         }
     }
        return secondLargest;
    }

   public static void main(String [] args){
        int[] arr = new int[]{23,5,7,55,1};

    }
}
