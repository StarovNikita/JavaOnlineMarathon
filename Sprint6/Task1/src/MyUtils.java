
import java.util.Arrays;
import java.util.function.Predicate;
public class MyUtils {
    public static int getCount(int[] arrays, Predicate<Integer> lambda) {

        // Write your code here
        int count= 0;
       for (int i =0;i<arrays.length;i++){
           if(lambda.test(arrays[i]))
               count++;
       }
       return count;
    }
}
