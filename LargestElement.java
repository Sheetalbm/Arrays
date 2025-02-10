
class LargestElement {

    static int largestNum(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-1;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
        return max;
    }

    public static void main(String[] args
    ){
        int nums[] = new int[]{31,7,8,41,1};
        int max = LargestElement.largestNum(nums);
        System.out.println(" Largest Number = "+max);
    }
        }