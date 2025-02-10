
// to be improved
public class ReverseArray {

    static void reverseArray(int arr[]){
        int temp;
        int left = 0;
        int right = arr.length-1;
        for(int i=0;i<arr.length;i++){
             temp = arr[i];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        System.out.print(" Reversed Array is => {");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + ",");
        }
        System.out.print("}");
    }
    public static void main(String [] args){
        int[] arr = new int[]{1,2,3,4,5};
        reverseArray(arr);
    }
}
