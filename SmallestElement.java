public class SmallestElement {

    static int finSmallestElement(int nums[]){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int nums[] = new int[]{5,91,3,5,11};
        int minNum = finSmallestElement(nums);
        System.out.println("Smallest Number in array" + nums +" is = "+minNum);
        // Output Smallest Number in array[I@7b23ec81 is = 1

    }
}
