
import java.util.*;

import static java.util.Collections.sort;
/*
   Q - Given a 4 digit natural number find the least sum of it. You can split in two numbers
  It will not have prefix 0 in 4 digit num but the split can contain leading 0s

   A - 5 3 6 1
 */

public class SumOf4DigitNumber {

    static void sumOfDigit(int num){

        Array.toString(num);
        int sorted = sort(num);
    }
    public static void main(String []args){
        int num = 5361; //least will be 13+51 => 64 but when small num is there in 10s place of both numbers 1_ | 3_ => 15 +36 => 51.
        sumOfDigit(num);
    }
}
