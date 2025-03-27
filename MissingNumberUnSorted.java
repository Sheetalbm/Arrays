
/*
 Find missing number in unsorted array
 */
public class MissingNumberUnSorted {

    public static int missingNumber(int[] arr){
        int size = arr.length;
        for(int i=0;i<=size-1;i++){
            int j=Math.abs(arr[i])-1;

            if(j>size && j>0){
                arr[j]= -arr[j];
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) { // The index + 1 is the missing number
                return i + 1;
            }
        }
        return size+1;
    }
    public static void main(String[] args){
        int[] arr=new int[]{3,4,2,1,5,6,8,9};
        int missNum = missingNumber(arr);
        System.out.println(missNum);
    }
}
