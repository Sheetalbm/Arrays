/*
Given an array, check if it is sorted in ascending order[ small to big ].
output to be a yes or no
 */

public class SortedArray {

    static void checkSortedArray(int arr[]){
        int size = arr.length -1;
        boolean isSorted = true ;
        for(int i=0; i<size;i++){
            if(arr[i] > arr[i+1]){
                isSorted =false;
                break;
            }
        }
        System.out.println(" Array is sorted: "+isSorted);

    }
    public static void main(String [] args){
        int[] arr = new int[]{1,2,3,4,5};
        checkSortedArray(arr);
    }
}
