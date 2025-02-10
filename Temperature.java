
/*
  Given a list of temperatures return the count of temps which are greater than the average??

  Cannot be optimized further as it is already O(n)
 */
public class Temperature {

    public static void main(String [] args){
        int[] temp = new int[]{241,121,111,5,6,50};
        int size = temp.length;
        int sum=0, avg, count=0;
        //Find the average
        for(int i=0;i<size;i++){
            sum+=temp[i];
        }
        System.out.println("sum = "+sum);
        avg = sum/size;
        System.out.println("avg = "+avg);

        for(int j=0;j<size;j++){
            if(temp[j]>=avg){
                count++;
            }
        }
        System.out.println("There are "+count+" temperatures larger than avg");
    }
}
