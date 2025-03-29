package TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String [] args){
        FindPair findPair = new FindPair();
        int[] list = new int[]{2,7,11,15,1};
        int target=15;
        int index[] = findPair.getPair(list, target);
        System.out.println(Arrays.toString(index));
    }
}
