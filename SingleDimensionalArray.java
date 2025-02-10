
import java.util.Arrays;
public class SingleDimensionalArray {
    static int arr[];

    public SingleDimensionalArray(int sizeOfArray){

        arr = new int[sizeOfArray];
        for(int i =0;i<sizeOfArray;i++){
            arr[i]= Integer.MIN_VALUE;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void insert(int location, int value, int sizeOfArray){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = value;
                System.out.println(Arrays.toString(arr));
            }else{
                System.out.println("cell is occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }


    }

    public static void main(String[] args){
        int sizeOfArray = 5;
        new SingleDimensionalArray(sizeOfArray);
        insert(1,55,sizeOfArray);
        insert(0,12,sizeOfArray);
        insert(2,90,sizeOfArray);
        insert(3,45,sizeOfArray);
        insert(4,78,sizeOfArray);
        insert(5,33,sizeOfArray);
        insert(4,22,sizeOfArray);
    }
}