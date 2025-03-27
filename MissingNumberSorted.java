/*
 Find the missing number in a sorted array
 */
public class MissingNumberSorted {

    static int missingNum(int arr[]){
        int arrSize = arr[arr.length-1];
        int sum = 0, num;
        for(int i=0;i<=arr.length-1;i++){
            sum+=arr[i];
        }
       int totalSum= (arrSize*(arrSize+1))/2;
        return totalSum-sum;
    }
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5,6,8,9};
        //{1,3,5,2,4,6,9,8};{1,2,3,4,5,6,8,9};
       int n= missingNum(arr);
       System.out.println("Missing number in the list is = "+n);

    }
}
